package com.flexops.proc.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TRAINING_RECORD")
public class TrainingRecordEntity {
	
	
	
	

	public TrainingRecordEntity(Long trainingRecordId, String trainingRecordCode, String recordDesc, Long eciID,
			Date createdTimeStamp, Date updatedTimeStamp, TrainingTypeEntity tr_trainingTypeEntity,
			TrainingStatusEntity tr_TrainingStatusEntity, TrainingItemTemplatesEntity tr_trainingItemTemplatesEntity,
			FlexopsUserEntity tr_createdBy, FlexopsUserEntity tr_updatedBy, FlexopsUserEntity tr_flexOpsUser,
			TrainingCatalogueEntity tr_trainingCatalogueEntity) {
		super();
		this.trainingRecordId = trainingRecordId;
		this.trainingRecordCode = trainingRecordCode;
		this.recordDesc = recordDesc;
		this.eciID = eciID;
		this.createdTimeStamp = createdTimeStamp;
		this.updatedTimeStamp = updatedTimeStamp;
		this.tr_trainingTypeEntity = tr_trainingTypeEntity;
		this.tr_TrainingStatusEntity = tr_TrainingStatusEntity;
		this.tr_trainingItemTemplatesEntity = tr_trainingItemTemplatesEntity;
		this.tr_createdBy = tr_createdBy;
		this.tr_updatedBy = tr_updatedBy;
		this.tr_flexOpsUser = tr_flexOpsUser;
		this.tr_trainingCatalogueEntity = tr_trainingCatalogueEntity;
	}
	public TrainingRecordEntity()
	{}

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="TR_ID")
	private Long trainingRecordId;
	
	@Column(name="TR_CODE")
	private String trainingRecordCode;

	@Column(name="TR_DESCRIPTION")
	private String recordDesc;

	@Column(name="ECI_ID")
	private Long eciID;
	
	
	@Column(name = "TR_CREATED_TS")
	private Date createdTimeStamp;
	
	@Column(name = "TR_UPDATED_TS")
	private Date updatedTimeStamp;

	@ManyToOne
	@JoinColumn(name="TR_TYPE")
	private TrainingTypeEntity tr_trainingTypeEntity;
	
	@ManyToOne
	@JoinColumn(name="TR_STATUS")
	private TrainingStatusEntity tr_TrainingStatusEntity;
	
	@OneToOne(mappedBy="tit_trainingRecordEntity")
	private TrainingItemTemplatesEntity tr_trainingItemTemplatesEntity;
	
	@ManyToOne
	@JoinColumn(name="TR_CREATED_BY")
	private FlexopsUserEntity tr_createdBy;
	
	
	@ManyToOne
	@JoinColumn(name="TR_UPDATED_BY")private FlexopsUserEntity tr_updatedBy;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private FlexopsUserEntity tr_flexOpsUser;
	
	@ManyToOne
	@JoinColumn(name="TC_ID")
	private TrainingCatalogueEntity tr_trainingCatalogueEntity;

	/**
	 * @return the trainingRecordId
	 */
	public Long getTrainingRecordId() {
		return trainingRecordId;
	}

	/**
	 * @param trainingRecordId the trainingRecordId to set
	 */
	public void setTrainingRecordId(Long trainingRecordId) {
		this.trainingRecordId = trainingRecordId;
	}

	/**
	 * @return the trainingRecordCode
	 */
	public String getTrainingRecordCode() {
		return trainingRecordCode;
	}

	/**
	 * @param trainingRecordCode the trainingRecordCode to set
	 */
	public void setTrainingRecordCode(String trainingRecordCode) {
		this.trainingRecordCode = trainingRecordCode;
	}

	/**
	 * @return the recordDesc
	 */
	public String getRecordDesc() {
		return recordDesc;
	}

	/**
	 * @param recordDesc the recordDesc to set
	 */
	public void setRecordDesc(String recordDesc) {
		this.recordDesc = recordDesc;
	}

	/**
	 * @return the eciID
	 */
	public Long getEciID() {
		return eciID;
	}

	/**
	 * @param eciID the eciID to set
	 */
	public void setEciID(Long eciID) {
		this.eciID = eciID;
	}

	

	/**
	 * @return the createdTimeStamp
	 */
	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	/**
	 * @param createdTimeStamp the createdTimeStamp to set
	 */
	public void setCreatedTimeStamp(Date createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	/**
	 * @return the updatedTimeStamp
	 */
	public Date getUpdatedTimeStamp() {
		return updatedTimeStamp;
	}

	/**
	 * @param updatedTimeStamp the updatedTimeStamp to set
	 */
	public void setUpdatedTimeStamp(Date updatedTimeStamp) {
		this.updatedTimeStamp = updatedTimeStamp;
	}

	/**
	 * @return the tr_trainingTypeEntity
	 */
	
	public TrainingTypeEntity getTr_trainingTypeEntity() {
		return tr_trainingTypeEntity;
	}

	/**
	 * @param tr_trainingTypeEntity the tr_trainingTypeEntity to set
	 */
	public void setTr_trainingTypeEntity(TrainingTypeEntity tr_trainingTypeEntity) {
		this.tr_trainingTypeEntity = tr_trainingTypeEntity;
	}

	/**
	 * @return the tr_TrainingStatusEntity
	 */
	
	public TrainingStatusEntity getTr_TrainingStatusEntity() {
		return tr_TrainingStatusEntity;
	}

	/**
	 * @param tr_TrainingStatusEntity the tr_TrainingStatusEntity to set
	 */
	public void setTr_TrainingStatusEntity(TrainingStatusEntity tr_TrainingStatusEntity) {
		this.tr_TrainingStatusEntity = tr_TrainingStatusEntity;
	}

	/**
	 * @return the tr_trainingItemTemplatesEntity
	 */
	
	public TrainingItemTemplatesEntity getTr_trainingItemTemplatesEntity() {
		return tr_trainingItemTemplatesEntity;
	}

	/**
	 * @param tr_trainingItemTemplatesEntity the tr_trainingItemTemplatesEntity to set
	 */
	public void setTr_trainingItemTemplatesEntity(TrainingItemTemplatesEntity tr_trainingItemTemplatesEntity) {
		this.tr_trainingItemTemplatesEntity = tr_trainingItemTemplatesEntity;
	}

	/**
	 * @return the tr_createdBy
	 */
	
	public FlexopsUserEntity getTr_createdBy() {
		return tr_createdBy;
	}

	/**
	 * @param tr_createdBy the tr_createdBy to set
	 */
	public void setTr_createdBy(FlexopsUserEntity tr_createdBy) {
		this.tr_createdBy = tr_createdBy;
	}

	/**
	 * @return the tr_updatedBy
	 */

	public FlexopsUserEntity getTr_updatedBy() {
		return tr_updatedBy;
	}

	/**
	 * @param tr_updatedBy the tr_updatedBy to set
	 */
	public void setTr_updatedBy(FlexopsUserEntity tr_updatedBy) {
		this.tr_updatedBy = tr_updatedBy;
	}

	/**
	 * @return the tr_flexOpsUser
	 */
	
	public FlexopsUserEntity getTr_flexOpsUser() {
		return tr_flexOpsUser;
	}

	/**
	 * @param tr_flexOpsUser the tr_flexOpsUser to set
	 */
	public void setTr_flexOpsUser(FlexopsUserEntity tr_flexOpsUser) {
		this.tr_flexOpsUser = tr_flexOpsUser;
	}

	/**
	 * @return the tr_trainingCatalogueEntity
	 */
	
	public TrainingCatalogueEntity getTr_trainingCatalogueEntity() {
		return tr_trainingCatalogueEntity;
	}

	/**
	 * @param tr_trainingCatalogueEntity the tr_trainingCatalogueEntity to set
	 */
	public void setTr_trainingCatalogueEntity(TrainingCatalogueEntity tr_trainingCatalogueEntity) {
		this.tr_trainingCatalogueEntity = tr_trainingCatalogueEntity;
	}
	
	
	
	
	
	

}
