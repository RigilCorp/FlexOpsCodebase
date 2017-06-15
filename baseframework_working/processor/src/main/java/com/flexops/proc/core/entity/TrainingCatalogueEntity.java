package com.flexops.proc.core.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.Table;

@Entity
@Table(name ="TRAINING_CATALOGUE")
public class TrainingCatalogueEntity implements Serializable{


	public TrainingCatalogueEntity(Long catalogueId, String catalogueCode, String catalogueDescription,
			Date tc_createdTimeStamp, Date tc_updatedTimeStamp, TrainingStatusEntity tc_TrainingStatusEntity,
			TrainingTypeEntity tc_trainingTypeEntity, FlexopsUserEntity tc_createdBy, FlexopsUserEntity tc_updatedBy) {
		super();
		this.catalogueId = catalogueId;
		this.catalogueCode = catalogueCode;
		this.catalogueDescription = catalogueDescription;
		this.tc_createdTimeStamp = tc_createdTimeStamp;
		this.tc_updatedTimeStamp = tc_updatedTimeStamp;
		this.tc_TrainingStatusEntity = tc_TrainingStatusEntity;
		this.tc_trainingTypeEntity = tc_trainingTypeEntity;
		this.tc_createdBy = tc_createdBy;
		this.tc_updatedBy = tc_updatedBy;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="TC_ID")
	private Long catalogueId;
	
	@Column(name="TC_CODE")
	private String catalogueCode;
	
	@Column(name="TC_DESCRIPTION")
	private String catalogueDescription;
	
	@Column(name="TC_CREATED_TS")
	private Date tc_createdTimeStamp;
	
	@Column(name="TC_UPDATED_TS")
	private Date tc_updatedTimeStamp;
	
	@ManyToOne
	@JoinColumn(name= "TC_STATUS")
	private TrainingStatusEntity tc_TrainingStatusEntity;
	
	@ManyToOne
	@JoinColumn(name= "TC_TYPE")
	private TrainingTypeEntity tc_trainingTypeEntity;
	
	@ManyToOne
	@JoinColumn(name= "TC_CREATED_BY")
	private FlexopsUserEntity tc_createdBy;
	private FlexopsUserEntity tc_updatedBy;
	
	
	/**
	 * @return the catalogueId
	 */
	public Long getCatalogueId() {
		return catalogueId;
	}
	/**
	 * @param catalogueId the catalogueId to set
	 */
	public void setCatalogueId(Long catalogueId) {
		this.catalogueId = catalogueId;
	}
	/**
	 * @return the catalogueCode
	 */
	public String getCatalogueCode() {
		return catalogueCode;
	}
	/**
	 * @param catalogueCode the catalogueCode to set
	 */
	public void setCatalogueCode(String catalogueCode) {
		this.catalogueCode = catalogueCode;
	}
	/**
	 * @return the catalogueDescription
	 */
	public String getCatalogueDescription() {
		return catalogueDescription;
	}
	/**
	 * @param catalogueDescription the catalogueDescription to set
	 */
	public void setCatalogueDescription(String catalogueDescription) {
		this.catalogueDescription = catalogueDescription;
	}
		public Date getTc_createdTimeStamp() {
		return tc_createdTimeStamp;
	}
	/**
	 * @param tc_createdTimeStamp the tc_createdTimeStamp to set
	 */
	public void setTc_createdTimeStamp(Date tc_createdTimeStamp) {
		this.tc_createdTimeStamp = tc_createdTimeStamp;
	}
	/**
	 * @return the tc_updatedTimeStamp
	 */
	
	public Date getTc_updatedTimeStamp() {
		return tc_updatedTimeStamp;
	}
	/**
	 * @param tc_updatedTimeStamp the tc_updatedTimeStamp to set
	 */
	public void setTc_updatedTimeStamp(Date tc_updatedTimeStamp) {
		this.tc_updatedTimeStamp = tc_updatedTimeStamp;
	}
	/**
	 * @return the tc_TrainingStatusEntity
	 */
	
	public TrainingStatusEntity getTc_TrainingStatusEntity() {
		return tc_TrainingStatusEntity;
	}
	/**
	 * @param tc_TrainingStatusEntity the tc_TrainingStatusEntity to set
	 */
	public void setTc_TrainingStatusEntity(TrainingStatusEntity tc_TrainingStatusEntity) {
		this.tc_TrainingStatusEntity = tc_TrainingStatusEntity;
	}
	/**
	 * @return the tc_trainingTypeEntity
	 */
	
	public TrainingTypeEntity getTc_trainingTypeEntity() {
		return tc_trainingTypeEntity;
	}
	/**
	 * @param tc_trainingTypeEntity the tc_trainingTypeEntity to set
	 */
	public void setTc_trainingTypeEntity(TrainingTypeEntity tc_trainingTypeEntity) {
		this.tc_trainingTypeEntity = tc_trainingTypeEntity;
	}
	/**
	 * @return the tc_createdBy
	 */
	
	public FlexopsUserEntity getTc_createdBy() {
		return tc_createdBy;
	}
	/**
	 * @param tc_createdBy the tc_createdBy to set
	 */
	public void setTc_createdBy(FlexopsUserEntity tc_createdBy) {
		this.tc_createdBy = tc_createdBy;
	}
	/**
	 * @return the tc_updatedBy
	 */
	public FlexopsUserEntity getTc_updatedBy() {
		return tc_updatedBy;
	}
	/**
	 * @param tc_updatedBy the tc_updatedBy to set
	 */
	public void setTc_updatedBy(FlexopsUserEntity tc_updatedBy) {
		this.tc_updatedBy = tc_updatedBy;
	}
	
	
	
	
	
	
	
	
	
	
	
}
