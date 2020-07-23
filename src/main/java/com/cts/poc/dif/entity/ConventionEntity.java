package com.cts.poc.dif.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "T_CONVENTION")
@Data
public class ConventionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name = "convention_id")
	private Integer convention_id;

	@ManyToOne
	//@JoinColumn(name = "distributor_id")
	private DistributorEntity distributor;

	@Column(name = "process_manager_identifier")
	private String process_manager_identifier;

	@Column(name = "segment_type")
	private String segment_type;

	@Column(name = "created_by")
	private String created_by;

	@Column(name = "created_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_date;
	
	@Column(name = "modified_by")
	private String modified_by;

	@Column(name = "modified_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modified_date;

	@Column(name = "valid_from")
	@Temporal(TemporalType.TIMESTAMP)
	private Date valid_from;

	@Column(name = "valid_to")
	@Temporal(TemporalType.TIMESTAMP)
	private Date valid_to;
	
	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "convention")
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="convention_id")
	private Set<ProcessSetupEntity> process;
}
