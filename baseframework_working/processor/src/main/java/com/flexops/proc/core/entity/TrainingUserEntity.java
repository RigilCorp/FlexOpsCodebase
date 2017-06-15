/**
 * 
 */
package com.flexops.proc.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Darpan
 *
 */
@Entity
@Table(name = "TRAINING_USER")
public class TrainingUserEntity implements Serializable{
	
	public TrainingUserEntity() {
		
	}

	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Long id;

}
