package com.jspiders.springcoreannotations.beans;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentBean {
	@Value("3")
	private int id;
	
	@Value("karan")
	private String name;
	
	@Value("karan@gmail.com")
	private String email;
	
	@Value("pune")
	private String city;
	
	
}
