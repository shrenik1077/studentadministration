package com.shrenik.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@ToString
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentid;
	private String fname;
	private String mname;
	private String lname;
	private String gender;
	private String dob;
	private String city;
	private String contactno;
	
	@ManyToOne
	@JoinColumn(name="courseid", nullable = false)
	private Course course;
	

}
