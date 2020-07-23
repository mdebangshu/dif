package com.cts.poc.dif.model;

import java.util.Set;

import lombok.Data;

@Data
public class Convention {

	private Integer convention_id;
	private String process_manager_identifier;
	private String segment_type;
	private String created_by;
	private String created_date;
	private String modified_by;
	private String modified_date;
	private String valid_from;
	private String valid_to;
	private Set<ProcessSetup> process;
}
