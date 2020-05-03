package com.shrenik.config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.shrenik.entity.Course;
import com.shrenik.entity.Student;

public class RepositoryConfig implements RepositoryRestConfigurer {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config);
		
		config.exposeIdsFor(Student.class);
		config.exposeIdsFor(Course.class);
		
		config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().
				map(Type::getJavaType).toArray(Class[]::new));
	}

	
}
