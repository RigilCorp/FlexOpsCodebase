package com.flexops.proc.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flexops.proc.core.entity.TrainingItemTemplatesEntity;
import com.flexops.proc.core.service.TrainingItemTemplatesService;
import com.flexops.proc.core.serviceImpl.TrainingItemTemplatesServiceImpl;
import com.flexops.proc.core.support.TrainingRestControllerSupport;

/**
 * @author Santosh This class takes the request from client and maps the request
 *         to request handler method. The method then passes the request to
 *         another support class including all the request details. Same method
 *         sends the response. Autowires Support class object to use the
 *         instance to forward the request.
 * 
 *
 */

@RestController
public class TrainingRestController {

	public TrainingRestController() {

	}

	@Autowired()
	private TrainingItemTemplatesService trainingItemTemplatesService;

	@RequestMapping(value = "/templates", method = RequestMethod.GET)
	public ResponseEntity<List<TrainingItemTemplatesEntity>> listAllTemplates()

	{

		System.out.println("****Inside TrainingRestController**** ");
		List<TrainingItemTemplatesEntity> itemTemplates = trainingItemTemplatesService.findAll();

		if (itemTemplates==null) {
			System.out.println("****Inside TrainingRestController if empty**** ");

			return new ResponseEntity(HttpStatus.NO_CONTENT);

		}

		return new ResponseEntity<List<TrainingItemTemplatesEntity>>(itemTemplates, HttpStatus.OK);

	}

}
