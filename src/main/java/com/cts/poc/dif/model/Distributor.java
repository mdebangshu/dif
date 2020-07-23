package com.cts.poc.dif.model;

import java.util.Set;

import lombok.Data;

@Data
public class Distributor {

	private Integer distributor_id;
	private String process_manager_identifier;
	private String name;
	private String establishment_date;
	private String enterprise_number;
	private String organization_type;
	private String contract_type;
	private String fsma_status;
	private String axa_distributor_status;
	private String lineofbusiness;
	private String lvf;
	private Set<Convention> convention;
	private Set<Employee> employee;
}
