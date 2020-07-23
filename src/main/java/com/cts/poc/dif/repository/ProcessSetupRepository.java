package com.cts.poc.dif.repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProcessSetupRepository {

	@Autowired
	private EntityManager entityManager;
	// @Query(value = "select process_id, convention_id, subprocess,
	// process_manager_identifier, status, create_date from t_process_step where
	// status = 'Initiated'")
	//@Query(value = "select process0_.convention_id, process0_.process_id, process0_.create_date, process0_.process_manager_identifier, process0_.status, process0_.subprocess, convention1_.convention_id, convention1_.created_by, convention1_.created_date, convention1_.distributor_id, convention1_.modified_by, convention1_.modified_date, convention1_.process_manager_identifier, convention1_.segment_type, convention1_.valid_from, convention1_.valid_to, distributo2_.distributor_id, distributo2_.axa_distributor_status, distributo2_.contract_type, distributo2_.enterprise_number, distributo2_.establishment_date, distributo2_.fsma_status, distributo2_.lineofbusiness, distributo2_.lvf, distributo2_.name, distributo2_.organization_type, distributo2_.process_manager_identifier from ProcessSetupEntity process0_ left outer join ConventionEntity convention1_ on process0_.convention_id=convention1_.convention_id left outer join DistributorEntity distributo2_ on convention1_.distributor_id=distributo2_.distributor_id where process0_.status = ?1")
	public Integer findProcessSetupEntityByStatus(String status){
		String qry = "select convention1_.distributor_id from t_process_step process0_ left outer join t_convention convention1_ on process0_.convention_id=convention1_.convention_id where process0_.status = 'Initiated'";
		Query query = entityManager.createNativeQuery(qry);
		//query.setParameter("status", status);
		
		return (Integer) query.unwrap(org.hibernate.Query.class).getResultList().get(0);
	}
}
