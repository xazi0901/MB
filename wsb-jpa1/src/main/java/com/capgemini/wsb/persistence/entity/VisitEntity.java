package com.capgemini.wsb.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "VISIT")
public class VisitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;

	@Column(nullable = false)
	private LocalDateTime time;

	// Relacja jednokierunkowa której rodzicem jest VisitEntity
	@OneToMany
	@JoinColumn(name ="visitEntity_id")
	private List<MedicalTreatmentEntity> medicalTreatmentEntity;

	public List<MedicalTreatmentEntity> getMedicalTreatmentEntity() {
		return this.medicalTreatmentEntity;
	}

	public void setMedicalTreatmentEntity(List<MedicalTreatmentEntity> medicalTreatmentEntity) {
		this.medicalTreatmentEntity = medicalTreatmentEntity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

}
