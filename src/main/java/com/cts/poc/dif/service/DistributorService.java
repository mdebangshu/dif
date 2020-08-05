package com.cts.poc.dif.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.poc.dif.entity.DistributorEntity;
import com.cts.poc.dif.model.Distributor;
import com.cts.poc.dif.repository.DistributorRepository;
import com.cts.poc.dif.repository.ProcessSetupRepository;

@Service
@Transactional
public class DistributorService {

	private static Log logger = LogFactory.getLog(DistributorService.class);

	@Autowired
	private DistributorRepository distributorRepository;

	@Autowired
	private ProcessSetupRepository processSetupRepository;

	/*
	 * @Autowired private ConventionRepository conventionRepository;
	 */

	@Autowired
	private RestTemplate restTemplate;

	private static final String DRM_URL = "https://4a995b2bv7.execute-api.us-east-2.amazonaws.com/V1/sendconvention";

	public DistributorEntity getDistributor(Integer id) {
		if (null == id) {
			return new DistributorEntity();
		}
		Optional<DistributorEntity> distributor = distributorRepository.findById(id);
		if (null == distributor) {
			return new DistributorEntity();
		}
		return distributor.get();
	}

	public DistributorEntity saveDistributor(DistributorEntity distributor) {
		return distributorRepository.save(distributor);
	}

	public Integer getProcessSetup() {
		return processSetupRepository.findProcessSetupEntityByStatus("Initiated");
	}

	public DistributorEntity getDistributor() {
		Integer id = getProcessSetup();
		logger.info("Distributor ID : " + id);
		return getDistributor(id);
	}

	public Integer doPostRequestToDrm(Distributor distributor) {
		logger.info("Sending post request");
		/*
		 * MultiValueMap<String, String> headers = new LinkedMultiValueMap<String,
		 * String>(); headers.add("Content-Type", "application/json");
		 * HttpEntity<Distributor> request = new HttpEntity<Distributor>(distributor,
		 * headers);
		 */
		RequestEntity<Distributor> re = null;
		try {
			re = RequestEntity.post(new URI(DRM_URL)).accept(MediaType.APPLICATION_JSON)
					.contentType(MediaType.APPLICATION_JSON).body(distributor);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return restTemplate.exchange(re, Object.class).getStatusCodeValue();
	}
}
