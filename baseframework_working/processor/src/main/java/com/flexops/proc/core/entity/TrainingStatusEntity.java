package com.flexops.proc.core.entity;

import java.io.Serializable;
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TRAINING_STATUS")
public class TrainingStatusEntity implements Serializable {	
	
	
	private static final long serialVersionUID = 1L;

	public TrainingStatusEntity()
	{}
	
	



	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STATUS_ID")
	private Long id;
	
	@Column(name = "STATUS_CODE")
	private String statusCode;
	

	@Column(name = "STATUS_DESCRIPTION")
	private String statusDescription;
	
	@Column(name = "STATUS_ACTIVATION_TS")
	private Date statusActivationTS;
	
	@Column(name = "STATUS_EXPIRATION_TS")
	private Date statusExpirationTS;
	
	@Column(name = "STATUS_ACTIVITY_TS")
	private Date statusActivityTS;
	
	@OneToMany(mappedBy = "tc_TrainingStatusEntity")
	private Set<TrainingCatalogueEntity> tcEntities;
	
	@OneToMany(mappedBy = "tit_trainingStatusEntity")
	private Set<TrainingItemTemplatesEntity> trainingItemTemplateList;
	
	
	
	
	@JsonIgnore
	public Set<TrainingItemTemplatesEntity> getTrainingItemTemplateList() {
		return trainingItemTemplateList;
	}

	public void setTrainingItemTemplateList(Set<TrainingItemTemplatesEntity> trainingItemTemplateList) {
		this.trainingItemTemplateList = trainingItemTemplateList;
	}

	/**
	 * @return the tcEntities
	 */
	
	public Set<TrainingCatalogueEntity> getTcEntities() {
		return tcEntities;
	}

	/**
	 * @param tcEntities the tcEntities to set
	 */
	
	public void setTcEntities(Set<TrainingCatalogueEntity> tcEntities) {
		this.tcEntities = tcEntities;
	}





	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	private TrainingGroupEntity trainingGroup;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public TrainingGroupEntity getTrainingGroup() {
		return trainingGroup;
	}

	public void setTrainingGroup(TrainingGroupEntity trainingGroup) {
		this.trainingGroup = trainingGroup;
	}

	/**
	 * @return the statusActivationTS
	 */
	public Date getStatusActivationTS() {
		return statusActivationTS;
	}

	/**
	 * @param statusActivationTS the statusActivationTS to set
	 */
	public void setStatusActivationTS(Date statusActivationTS) {
		this.statusActivationTS = statusActivationTS;
	}

	/**
	 * @return the statusExpirationTS
	 */
	public Date getStatusExpirationTS() {
		return statusExpirationTS;
	}

	/**
	 * @param statusExpirationTS the statusExpirationTS to set
	 */
	public void setStatusExpirationTS(Date statusExpirationTS) {
		this.statusExpirationTS = statusExpirationTS;
	}

	/**
	 * @return the statusActivityTS
	 */
	public Date getStatusActivityTS() {
		return statusActivityTS;
	}

	/**
	 * @param statusActivityTS the statusActivityTS to set
	 */
	public void setStatusActivityTS(Date statusActivityTS) {
		this.statusActivityTS = statusActivityTS;
	}
	
	
	



	

	
	
}
