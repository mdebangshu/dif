package com.cts.poc.dif.model;

import lombok.Data;

@Data
public class Employee {
	private Integer employee_id;
	private String process_manager_identifier;
	private String first_name;
	private String last_name;
	private String gender;
	private String nationality;
	private String activity_type;
	private String specialization_type;
	private String ni_number;
	private String behavior_type;
	private String certification;
	private String manager_id;
	private String hierarchy_type;
	private String lvf;
}
