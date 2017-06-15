package com.flexops.proc.core.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TRAINING_GROUP")
public class TrainingGroupEntity implements Serializable {	
	
	
	public TrainingGroupEntity(Long id, String groupCode, String groupDescription, Date groupActivationTS,
			Date groupExpirationTS, Date groupActivityTS, Set<TrainingStatusEntity> statusEntities) {
		super();
		this.id = id;
		this.groupCode = groupCode;
		this.groupDescription = groupDescription;
		this.groupActivationTS = groupActivationTS;
		this.groupExpirationTS = groupExpirationTS;
		this.groupActivityTS = groupActivityTS;
		this.statusEntities = statusEntities;
	}



//	private static final long serialVersionUID = 1L;

	public TrainingGroupEntity()
	{}
	
	
	
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GROUP_ID")
	private Long id;
	
	@Column(name = "GROUP_CODE")
	private String groupCode;
	

	@Column(name = "GROUP_DESCRIPTION")
	private String groupDescription;
	
	@Column(name = "GROUP_ACTIVATION_TS")
	private Date groupActivationTS;
	
	@Column(name = "GROUP_EXPIRATION_TS")
	private Date groupExpirationTS;
	
	@Column(name = "GROUP_ACTIVITY_TS")
	private Date groupActivityTS;
	
	@OneToMany(mappedBy= "trainingGroup" , cascade = CascadeType.ALL)
	private Set<TrainingStatusEntity> statusEntities;

	/**
	 * @return the statusEntities
	 */

	public Set<TrainingStatusEntity> getStatusEntities() {
		return statusEntities;
	}

	/**
	 * @param statusEntities the statusEntities to set
	 */
	public void setStatusEntities(Set<TrainingStatusEntity> statusEntities) {
		this.statusEntities = statusEntities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	/**
	 * @return the groupActivationTS
	 */
	public Date getGroupActivationTS() {
		return groupActivationTS;
	}

	/**
	 * @param groupActivationTS the groupActivationTS to set
	 */
	public void setGroupActivationTS(Date groupActivationTS) {
		this.groupActivationTS = groupActivationTS;
	}

	/**
	 * @return the groupExpirationTS
	 */
	public Date getGroupExpirationTS() {
		return groupExpirationTS;
	}

	/**
	 * @param groupExpirationTS the groupExpirationTS to set
	 */
	public void setGroupExpirationTS(Date groupExpirationTS) {
		this.groupExpirationTS = groupExpirationTS;
	}

	/**
	 * @return the groupActivityTS
	 */
	public Date getGroupActivityTS() {
		return groupActivityTS;
	}

	/**
	 * @param groupActivityTS the groupActivityTS to set
	 */
	public void setGroupActivityTS(Date groupActivityTS) {
		this.groupActivityTS = groupActivityTS;
	}

	
	
}
