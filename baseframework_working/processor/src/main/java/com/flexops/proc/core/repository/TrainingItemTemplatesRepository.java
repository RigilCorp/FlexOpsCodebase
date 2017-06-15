package com.flexops.proc.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flexops.proc.core.entity.TrainingItemTemplatesEntity;

@Repository("trainingItemTemplatesRepository")
public interface TrainingItemTemplatesRepository extends JpaRepository<TrainingItemTemplatesEntity, Long> {
	TrainingItemTemplatesEntity findById(Long id);
	

	List<TrainingItemTemplatesEntity> findAll();

}
