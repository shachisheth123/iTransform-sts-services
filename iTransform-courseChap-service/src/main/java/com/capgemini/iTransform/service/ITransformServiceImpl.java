package com.capgemini.iTransform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capgemini.iTranform.entity.CourseChapter;
import com.capgemini.iTransform.dao.ITransformDao;

@Service
public class ITransformServiceImpl implements ITransformService{

	@Autowired
	private ITransformDao iTranformDao;
	
	@Override
	public CourseChapter addNewCourse(CourseChapter itransForm) {
		CourseChapter ITransform=iTranformDao.insert(itransForm);
		return ITransform;
//		return iTranformDao.insert(itransForm);
	}

}
