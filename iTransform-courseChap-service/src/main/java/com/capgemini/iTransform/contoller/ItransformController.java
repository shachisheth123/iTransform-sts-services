package com.capgemini.iTransform.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.iTranform.entity.CourseChapter;
import com.capgemini.iTransform.service.ITransformService;

@RestController
public class ItransformController {

	@Autowired
	private ITransformService  iTransformService;
	
	@PostMapping("/course")
	public ResponseEntity<CourseChapter> addNewChapter(@RequestBody CourseChapter Itransform){
		CourseChapter iTransform=iTransformService.addNewCourse(Itransform);
		return new ResponseEntity<CourseChapter>(iTransform,HttpStatus.CREATED);
	


		
	}

	
	
}
