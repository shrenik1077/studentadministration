package com.shrenik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shrenik.entity.Student;

@RepositoryRestResource(collectionResourceRel = "student",path="student-rec")
public interface StudentRepository extends JpaRepository<Student, Long>{

}
