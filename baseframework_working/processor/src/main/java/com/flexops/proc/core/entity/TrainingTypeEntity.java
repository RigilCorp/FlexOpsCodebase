package com.flexops.proc.core.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TRAINING_TYPE")
public class TrainingTypeEntity implements Serializable {	
	
	
	public TrainingTypeEntity(Long id, String typeCode, String typeDescription, Date typeActivationTS,
			Date typeExpirationTS, Date typeActivityTS, TrainingGroupEntity trainingGroup) {
		super();
		this.id = id;
		this.typeCode = typeCode;
		this.typeDescription = typeDescription;
		this.typeActivationTS = typeActivationTS;
		this.typeExpirationTS = typeExpirationTS;
		this.typeActivityTS = typeActivityTS;
		this.trainingGroup = trainingGroup;
	}

	public TrainingTypeEntity()
	{
		
	}

	//private static final long serialVersionUID = 1L;

	
	
	
	
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TYPE_ID")
	private Long id;
	
	@Column(name = "TYPE_CODE")
	private String typeCode;
	

	@Column(name = "TYPE_DESCRIPTION")
	private String typeDescription;
	
	@Column(name = "TYPE_ACTIVATION_TS")
	private Date typeActivationTS;
	
	@Column(name = "TYPE_EXPIRATION_TS")
	private Date typeExpirationTS;
	
	@Column(name = "TYPE_ACTIVITY_TS")
	private Date typeActivityTS;
	
	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	private TrainingGroupEntity trainingGroup;
	
	
	//Here if u see, we are using default lazy loading, but output is not as per expected.
	//pls tell us how to map fetch type so that parent child relationship works and we get the child data as well.
	@OneToMany(mappedBy = "tc_trainingTypeEntity")
	private Set<TrainingCatalogueEntity> catalogueEntities;
	
	
	//Here if u see, we are using default lazy loading, but output is not as per expected.
	//pls tell us how to map fetch type so that parent child relationship works and we get the child data as well.
	@OneToMany(mappedBy = "trainingTypeEntity")	
  private List<TrainingItemTemplatesEntity> trainingItemTemplateList= new ArrayList();
	
	
	
	
	@JsonIgnore
	public List<TrainingItemTemplatesEntity> getTrainingItemTemplateList() {
		return trainingItemTemplateList;
	}

	public void setTrainingItemTemplateList(List<TrainingItemTemplatesEntity> trainingItemTemplateList) {
		this.trainingItemTemplateList = trainingItemTemplateList;
	}
	
	
	
	/**
	 * @return the catalogueEntities
	 */
	
	public Set<TrainingCatalogueEntity> getCatalogueEntities() {
		return catalogueEntities;
	}

	/**
	 * @param catalogueEntities the catalogueEntities to set
	 */
	public void setCatalogueEntities(Set<TrainingCatalogueEntity> catalogueEntities) {
		this.catalogueEntities = catalogueEntities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeDescription() {
		return typeDescription;
	}

	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}

	
	public TrainingGroupEntity getTrainingGroup() {
		return trainingGroup;
	}

	public void setTrainingGroup(TrainingGroupEntity trainingGroup) {
		this.trainingGroup = trainingGroup;
	}

	/**
	 * @return the typeActivationTS
	 */
	public Date getTypeActivationTS() {
		return typeActivationTS;
	}

	/**
	 * @param typeActivationTS the typeActivationTS to set
	 */
	public void setTypeActivationTS(Date typeActivationTS) {
		this.typeActivationTS = typeActivationTS;
	}

	/**
	 * @return the typeExpirationTS
	 */
	public Date getTypeExpirationTS() {
		return typeExpirationTS;
	}

	/**
	 * @param typeExpirationTS the typeExpirationTS to set
	 */
	public void setTypeExpirationTS(Date typeExpirationTS) {
		this.typeExpirationTS = typeExpirationTS;
	}

	/**
	 * @return the typeActivityTS
	 */
	public Date getTypeActivityTS() {
		return typeActivityTS;
	}

	/**
	 * @param typeActivityTS the typeActivityTS to set
	 */
	public void setTypeActivityTS(Date typeActivityTS) {
		this.typeActivityTS = typeActivityTS;
	}



	

	
	
}
