package com.cts.poc.dif.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "T_EMPLOYEE")
@Data
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name = "employee_id")
	private Integer employee_id;

	@Column(name = "process_manager_identifier")
	private String process_manager_identifier;

	@ManyToOne
	//@JoinColumn(name = "distributor_id")
	private DistributorEntity distributor;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "gender")
	private char gender;

	@Column(name = "nationality")
	private String nationality;

	@Column(name = "activity_type")
	private String activity_type;

	@Column(name = "specialization_type")
	private String specialization_type;

	@Column(name = "ni_number")
	private String ni_number;

	@Column(name = "behavior_type")
	private String behavior_type;

	@Column(name = "certification")
	private String certification;

	@Column(name = "manager_id")
	private Integer manager_id;

	@Column(name = "hierarchy_type")
	private String hierarchy_type;

	@Column(name = "lvf")
	private char lvf;
}
