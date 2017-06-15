package com.flexops.proc.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TRAINING_ITEM")
public class TrainingItemEntity {
	
	
	public TrainingItemEntity(Long trainingItem, String ti_code, String ti_description, Date ti_createdTimeStamp,
			Date ti_updatedTimeStamp, TrainingTypeEntity ti_trainingTypeEntity,
			TrainingStatusEntity ti_trainingStatusEntity, TrainingCatalogueEntity ti_trainingCatalogueEntity,
			TrainingItemTemplatesEntity ti_itemTemplateEntity, FlexopsUserEntity ti_createdBy,
			FlexopsUserEntity ti_updatedBy) {
		super();
		this.trainingItem = trainingItem;
		this.ti_code = ti_code;
		this.ti_description = ti_description;
		this.ti_createdTimeStamp = ti_createdTimeStamp;
		this.ti_updatedTimeStamp = ti_updatedTimeStamp;
		this.ti_trainingTypeEntity = ti_trainingTypeEntity;
		this.ti_trainingStatusEntity = ti_trainingStatusEntity;
		this.ti_trainingCatalogueEntity = ti_trainingCatalogueEntity;
		this.ti_itemTemplateEntity = ti_itemTemplateEntity;
		this.ti_createdBy = ti_createdBy;
		this.ti_updatedBy = ti_updatedBy;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="TI_ID")
	private Long trainingItem;
	
	@Column(name="TI_CODE")
	private String ti_code;
	
	@Column(name="TI_DESCRIPTION")
	private String ti_description;
	
	@Column(name="TI_CREATED_TS")
	private Date ti_createdTimeStamp;
	
	@Column(name="TI_UPDATED_TS")
	private Date ti_updatedTimeStamp;
	
	
	private TrainingTypeEntity ti_trainingTypeEntity;
	
	private TrainingStatusEntity ti_trainingStatusEntity;
	
		
	private TrainingCatalogueEntity ti_trainingCatalogueEntity;
	
	
	private TrainingItemTemplatesEntity ti_itemTemplateEntity;
	
	
	private FlexopsUserEntity ti_createdBy;
	private FlexopsUserEntity ti_updatedBy;

	/**
	 * @return the trainingItem
	 */
	public Long getTrainingItem() {
		return trainingItem;
	}

	/**
	 * @param trainingItem the trainingItem to set
	 */
	public void setTrainingItem(Long trainingItem) {
		this.trainingItem = trainingItem;
	}

	/**
	 * @return the ti_code
	 */
	public String getTi_code() {
		return ti_code;
	}

	/**
	 * @param ti_code the ti_code to set
	 */
	public void setTi_code(String ti_code) {
		this.ti_code = ti_code;
	}

	/**
	 * @return the ti_description
	 */
	public String getTi_description() {
		return ti_description;
	}

	/**
	 * @param ti_description the ti_description to set
	 */
	public void setTi_description(String ti_description) {
		this.ti_description = ti_description;
	}

	
	/**
	 * @return the ti_createdTimeStamp
	 */
	public Date getTi_createdTimeStamp() {
		return ti_createdTimeStamp;
	}

	/**
	 * @param ti_createdTimeStamp the ti_createdTimeStamp to set
	 */
	public void setTi_createdTimeStamp(Date ti_createdTimeStamp) {
		this.ti_createdTimeStamp = ti_createdTimeStamp;
	}

	/**
	 * @return the ti_updatedTimeStamp
	 */
	public Date getTi_updatedTimeStamp() {
		return ti_updatedTimeStamp;
	}

	/**
	 * @param ti_updatedTimeStamp the ti_updatedTimeStamp to set
	 */
	public void setTi_updatedTimeStamp(Date ti_updatedTimeStamp) {
		this.ti_updatedTimeStamp = ti_updatedTimeStamp;
	}

	/**
	 * @return the ti_trainingTypeEntity
	 */
	@ManyToOne
	@JoinColumn(name="TI_TYPE")
	public TrainingTypeEntity getTi_trainingTypeEntity() {
		return ti_trainingTypeEntity;
	}

	/**
	 * @param ti_trainingTypeEntity the ti_trainingTypeEntity to set
	 */
	public void setTi_trainingTypeEntity(TrainingTypeEntity ti_trainingTypeEntity) {
		this.ti_trainingTypeEntity = ti_trainingTypeEntity;
	}

	/**
	 * @return the ti_trainingStatusEntity
	 */
	@ManyToOne
	@JoinColumn(name="TI_STATUS")
	public TrainingStatusEntity getTi_trainingStatusEntity() {
		return ti_trainingStatusEntity;
	}

	/**
	 * @param ti_trainingStatusEntity the ti_trainingStatusEntity to set
	 */
	public void setTi_trainingStatusEntity(TrainingStatusEntity ti_trainingStatusEntity) {
		this.ti_trainingStatusEntity = ti_trainingStatusEntity;
	}

	/**
	 * @return the ti_trainingCatalogueEntity
	 */
	@ManyToOne
	@JoinColumn(name="TC_ID")
	public TrainingCatalogueEntity getTi_trainingCatalogueEntity() {
		return ti_trainingCatalogueEntity;
	}

	/**
	 * @param ti_trainingCatalogueEntity the ti_trainingCatalogueEntity to set
	 */
	public void setTi_trainingCatalogueEntity(TrainingCatalogueEntity ti_trainingCatalogueEntity) {
		this.ti_trainingCatalogueEntity = ti_trainingCatalogueEntity;
	}

	/**
	 * @return the ti_itemTemplateEntity
	 */
	@ManyToOne
	@JoinColumn(name="TIT_ID")
	public TrainingItemTemplatesEntity getTi_itemTemplateEntity() {
		return ti_itemTemplateEntity;
	}

	/**
	 * @param ti_itemTemplateEntity the ti_itemTemplateEntity to set
	 */
	public void setTi_itemTemplateEntity(TrainingItemTemplatesEntity ti_itemTemplateEntity) {
		this.ti_itemTemplateEntity = ti_itemTemplateEntity;
	}

	/**
	 * @return the ti_createdBy
	 */
	@ManyToOne
	@JoinColumn(name="TI_CREATED_BY")
	public FlexopsUserEntity getTi_createdBy() {
		return ti_createdBy;
	}

	/**
	 * @param ti_createdBy the ti_createdBy to set
	 */
	public void setTi_createdBy(FlexopsUserEntity ti_createdBy) {
		this.ti_createdBy = ti_createdBy;
	}

	/**
	 * @return the ti_updatedBy
	 */
	@ManyToOne
	@JoinColumn(name="TI_UPDATED_BY")
	public FlexopsUserEntity getTi_updatedBy() {
		return ti_updatedBy;
	}

	/**
	 * @param ti_updatedBy the ti_updatedBy to set
	 */
	public void setTi_updatedBy(FlexopsUserEntity ti_updatedBy) {
		this.ti_updatedBy = ti_updatedBy;
	}

		
	
	

}
