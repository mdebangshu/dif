package com.cts.poc.dif.model;

import lombok.Data;

@Data
public class ProcessSetup {
	private Integer process_id;
	private String subprocess;
	private String process_manager_identifier;
	private String status;
	private String create_date;
}
