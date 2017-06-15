package com.flexops.proc.core.service;

import java.util.List;

import com.flexops.proc.core.entity.TrainingItemTemplatesEntity;

/**
 * @author Santosh kumar This class will contain the service call from Support
 *         class to process GET/PUT/DELETE/POST methods.
 */

public interface TrainingItemTemplatesService {

	//TrainingItemTemplatesEntity findById(Long id);

	List<TrainingItemTemplatesEntity> findAll();

}
