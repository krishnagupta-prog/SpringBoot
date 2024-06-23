package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="JPA_DOCTOR")
@Entity
@Data
public class Doctor {
	@Column(name = "DOC_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer docId;
	@Column(name = "DOC_NAME",length = 25)
	private String docName;
	@Column(name = "SPECIALIZATION", length = 20)
	private String specialization;
	@Column(name = "INCOME")
	private Double income;
	
}
