package com.cts.poc.dif.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "T_DISTRIBUTOR")
@Data
public class DistributorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name = "distributor_id")
	private Integer distributor_id;

	@Column(name = "process_manager_identifier")
	private String process_manager_identifier;

	@Column(name = "name")
	private String name;

	@Column(name = "establishment_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date establishment_date;

	@Column(name = "enterprise_number")
	private String enterprise_number;

	@Column(name = "organization_type")
	private String organization_type;

	@Column(name = "contract_type")
	private String contract_type;

	@Column(name = "fsma_status")
	private String fsma_status;

	@Column(name = "axa_distributor_status")
	private String axa_distributor_status;

	@Column(name = "lineofbusiness")
	private String lineofbusiness;

	@Column(name = "lvf")
	private char lvf;

	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="distributor_id")
	private Set<ConventionEntity> convention;

	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="distributor_id")
	private Set<EmployeeEntity> employee;
}
