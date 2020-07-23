package com.cts.poc.dif.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "T_PROCESS_STEP")
@Data
public class ProcessSetupEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name = "process_id")
	private Integer process_id;

	@ManyToOne
	//@JoinColumn(name = "convention_id")
	private ConventionEntity convention;

	@Column(name = "subprocess")
	private String subprocess;

	@Column(name = "process_manager_identifier")
	private String process_manager_identifier;

	@Column(name = "status")
	private String status;

	@Column(name = "create_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date create_date;
}
