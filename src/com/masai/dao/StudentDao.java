package com.masai.dao;

import java.util.List;

import com.masai.Exceptions.CourseException;
import com.masai.Exceptions.StudentException;
import com.masai.model.CourseDTO;
import com.masai.model.Student;

public interface StudentDao {

	public String studentRegistration(Student student) throws StudentException;
	
	public String login(String username , String password) throws StudentException;
	
	public String updateDetails(int roll, String field, String Data) throws StudentException;
	
	public List<CourseDTO> availableCourseSeat() throws CourseException;

}
