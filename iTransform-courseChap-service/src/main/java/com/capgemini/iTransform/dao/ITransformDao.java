package com.capgemini.iTransform.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.iTranform.entity.CourseChapter;

@Repository
public interface ITransformDao extends MongoRepository<CourseChapter, String> {

}
