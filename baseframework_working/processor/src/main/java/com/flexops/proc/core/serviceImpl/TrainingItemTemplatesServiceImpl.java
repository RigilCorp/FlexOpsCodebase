package com.flexops.proc.core.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flexops.proc.core.entity.TrainingItemTemplatesEntity;
import com.flexops.proc.core.repository.TrainingItemTemplatesRepository;
import com.flexops.proc.core.service.TrainingItemTemplatesService;


@Service
@Transactional
public class TrainingItemTemplatesServiceImpl implements TrainingItemTemplatesService {

	public TrainingItemTemplatesServiceImpl() {

	}

	@Autowired
	private TrainingItemTemplatesRepository trainingItemTemplatesRepository;

//	@Override
//	public TrainingItemTemplatesEntity findById(Long id) {
//
//		return trainingItemTemplatesRepository.findOne(id);
//
//	}

	@Override
	public List<TrainingItemTemplatesEntity> findAll() {
		return trainingItemTemplatesRepository.findAll();
	}

}
