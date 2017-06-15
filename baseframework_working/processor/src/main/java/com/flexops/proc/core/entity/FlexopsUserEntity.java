package com.flexops.proc.core.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TRAINING_USER")
public class FlexopsUserEntity implements Serializable {
    
	public FlexopsUserEntity(Long userId, String userFirstName, String userMiddleName, String userLastName,
			String userEmail) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userMiddleName = userMiddleName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
	}
	
	public FlexopsUserEntity() {
	
	}
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="USER_ID")
	private Long userId;
	
	@Column(name="USER_FIRST_NAME")
	private String userFirstName;
	
	@Column(name="USER_MIDDLE_NAME")
	private String userMiddleName;
	
	@Column(name="USER_LAST_NAME")
	private String userLastName;
	
	@Column(name="USER_EMAIL")
	private String userEmail;
	
	@OneToMany(mappedBy = "tit_createdBy", cascade = CascadeType.ALL)
	private Set<TrainingItemTemplatesEntity> createdBy;
	
	@OneToMany(mappedBy = "tit_updatedBy", cascade = CascadeType.ALL)
	private Set<TrainingItemTemplatesEntity> updatedBy;
	
	
	

	/**
	 * @return the updatedBy
	 */
	
	@JsonIgnore
	public Set<TrainingItemTemplatesEntity> getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(Set<TrainingItemTemplatesEntity> updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the typeEntities
	 */
	
	@JsonIgnore
	public Set<TrainingItemTemplatesEntity> getcreatedBy() {
		return createdBy;
	}

	/**
	 * @param typeEntities the typeEntities to set
	 */
	public void setTypeEntities(Set<TrainingItemTemplatesEntity> createdBy) {
		this.createdBy = createdBy;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserMiddleName() {
		return userMiddleName;
	}

	public void setUserMiddleName(String userMiddleName) {
		this.userMiddleName = userMiddleName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((userFirstName == null) ? 0 : userFirstName.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userLastName == null) ? 0 : userLastName.hashCode());
		result = prime * result + ((userMiddleName == null) ? 0 : userMiddleName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlexopsUserEntity other = (FlexopsUserEntity) obj;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userFirstName == null) {
			if (other.userFirstName != null)
				return false;
		} else if (!userFirstName.equals(other.userFirstName))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userLastName == null) {
			if (other.userLastName != null)
				return false;
		} else if (!userLastName.equals(other.userLastName))
			return false;
		if (userMiddleName == null) {
			if (other.userMiddleName != null)
				return false;
		} else if (!userMiddleName.equals(other.userMiddleName))
			return false;
		return true;
	}



}