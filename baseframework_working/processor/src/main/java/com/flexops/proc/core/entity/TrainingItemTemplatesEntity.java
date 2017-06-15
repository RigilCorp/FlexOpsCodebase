package com.flexops.proc.core.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRAINING_ITEM_TEMPLATES")
public class TrainingItemTemplatesEntity implements Serializable {

	
	public TrainingItemTemplatesEntity(Long id, String itemTemplateName, String iconTemplateIcon, String itemCategory,
			String code, String description, TrainingTypeEntity trainingTypeEntity,
			TrainingStatusEntity tit_trainingStatusEntity, TrainingRecordEntity tit_trainingRecordEntity,
			FlexopsUserEntity tit_createdBy, FlexopsUserEntity tit_updatedBy, Date tit_createdTimeStamp,
			Date tit_updatedTimeStamp) {
		super();
		this.id = id;
		this.itemTemplateName = itemTemplateName;
		this.iconTemplateIcon = iconTemplateIcon;
		this.itemCategory = itemCategory;
		this.code = code;
		this.description = description;
		this.trainingTypeEntity = trainingTypeEntity;
		this.tit_trainingStatusEntity = tit_trainingStatusEntity;
		this.tit_trainingRecordEntity = tit_trainingRecordEntity;
		this.tit_createdBy = tit_createdBy;
		this.tit_updatedBy = tit_updatedBy;
		this.tit_createdTimeStamp = tit_createdTimeStamp;
		this.tit_updatedTimeStamp = tit_updatedTimeStamp;
	}

	/**
	 * 
	 */
	private static long serialVersionUID = 1L;

	public TrainingItemTemplatesEntity()
	{
		
	}
	
	@Id()
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "TIT_ID")
	private Long id;
	
	@Column(name = "TIT_ITEM_TEMPLATE_NAME")
	private String itemTemplateName;
	
	@Column(name = "TIT_ITEM_TEMPLATE_ICON")
	private String iconTemplateIcon;

	@Column(name = "TIT_ITEM_CATEGORY")
	private String itemCategory;
	
	@Column(name = "TIT_CODE")
	private String code;
	
	@Column(name = "TIT_DESCRIPTION")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="TIT_CATEGORY_TYPE")	
	private TrainingTypeEntity trainingTypeEntity;
	
	@ManyToOne
	@JoinColumn(name="TIT_STATUS")
	private TrainingStatusEntity tit_trainingStatusEntity;
	
	@OneToOne
	@JoinColumn(name="TR_ID")
	private TrainingRecordEntity tit_trainingRecordEntity;
	

	@ManyToOne
	@JoinColumn(name="TIT_CREATED_BY",referencedColumnName="USER_EMAIL")
	private FlexopsUserEntity tit_createdBy;
	
	@ManyToOne
	@JoinColumn(name="TIT_UPDATED_BY",referencedColumnName="USER_EMAIL")
	private FlexopsUserEntity tit_updatedBy;
	
	@Column(name = "TIT_CREATED_TS")
	private Date tit_createdTimeStamp;
	
	@Column(name = "TIT_UPDATED_TS")
	private Date tit_updatedTimeStamp;

	/**
	 * @return the itemTemplateName
	 */
	public String getItemTemplateName() {
		return itemTemplateName;
	}

	/**
	 * @param itemTemplateName the itemTemplateName to set
	 */
	public void setItemTemplateName(String itemTemplateName) {
		this.itemTemplateName = itemTemplateName;
	}

	/**
	 * @return the iconTemplateIcon
	 */
	public String getIconTemplateIcon() {
		return iconTemplateIcon;
	}

	/**
	 * @param iconTemplateIcon the iconTemplateIcon to set
	 */
	public void setIconTemplateIcon(String iconTemplateIcon) {
		this.iconTemplateIcon = iconTemplateIcon;
	}

	/**
	 * @return the itemCategory
	 */
	public String getItemCategory() {
		return itemCategory;
	}

	/**
	 * @param itemCategory the itemCategory to set
	 */
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the tit_trainingTypeEntity
	 */
	
	public TrainingTypeEntity getTrainingTypeEntity() {
		return trainingTypeEntity;
	}

	/**
	 * @param tit_trainingTypeEntity the tit_trainingTypeEntity to set
	 */
	public void setTrainingTypeEntity(TrainingTypeEntity trainingTypeEntity) {
		this.trainingTypeEntity = trainingTypeEntity;
	}

	/**
	 * @return the tit_trainingStatusEntity
	 */
	
	public TrainingStatusEntity getTit_trainingStatusEntity() {
		return tit_trainingStatusEntity;
	}

	/**
	 * @param tit_trainingStatusEntity the tit_trainingStatusEntity to set
	 */
	public void setTit_trainingStatusEntity(TrainingStatusEntity tit_trainingStatusEntity) {
		this.tit_trainingStatusEntity = tit_trainingStatusEntity;
	}

	/**
	 * @return the tit_trainingRecordEntity
	 */
	
	public TrainingRecordEntity getTit_trainingRecordEntity() {
		return tit_trainingRecordEntity;
	}

	/**
	 * @param tit_trainingRecordEntity the tit_trainingRecordEntity to set
	 */
	public void setTit_trainingRecordEntity(TrainingRecordEntity tit_trainingRecordEntity) {
		this.tit_trainingRecordEntity = tit_trainingRecordEntity;
	}

	/**
	 * @return the tit_createdBy
	 */
	public FlexopsUserEntity getTit_createdBy() {
		return tit_createdBy;
	}

	/**
	 * @param tit_createdBy the tit_createdBy to set
	 */
	public void setTit_createdBy(FlexopsUserEntity tit_createdBy) {
		this.tit_createdBy = tit_createdBy;
	}

	/**
	 * @return the tit_updatedBy
	 */
	public FlexopsUserEntity getTit_updatedBy() {
		return tit_updatedBy;
	}

	/**
	 * @param tit_updatedBy the tit_updatedBy to set
	 */
	public void setTit_updatedBy(FlexopsUserEntity tit_updatedBy) {
		this.tit_updatedBy = tit_updatedBy;
	}

	/**
	 * @return the tit_createdTimeStamp
	 */
	
	public Date getTit_createdTimeStamp() {
		return tit_createdTimeStamp;
	}

	/**
	 * @param tit_createdTimeStamp the tit_createdTimeStamp to set
	 */
	public void setTit_createdTimeStamp(Date tit_createdTimeStamp) {
		this.tit_createdTimeStamp = tit_createdTimeStamp;
	}

	/**
	 * @return the tit_updatedTimeStamp
	 */
	
	public Date getTit_updatedTimeStamp() {
		return tit_updatedTimeStamp;
	}

	/**
	 * @param tit_updatedTimeStamp the tit_updatedTimeStamp to set
	 */
	public void setTit_updatedTimeStamp(Date tit_updatedTimeStamp) {
		this.tit_updatedTimeStamp = tit_updatedTimeStamp;
	}
	
}
	