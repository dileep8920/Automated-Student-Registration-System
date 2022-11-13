package com.masai.dao;

import java.util.List;

import com.masai.Exceptions.AdminException;
import com.masai.Exceptions.BatchException;
import com.masai.Exceptions.CourseException;
import com.masai.Exceptions.StudentException;
import com.masai.model.Admin;
import com.masai.model.Batch;
import com.masai.model.Course;
import com.masai.model.StudentBatch;
import com.masai.model.StudentDTO;

public interface AdminDao {

public String adminRegistration(Admin admin) throws AdminException;

public String login(String username , String password) throws AdminException;

public String addCourse(Course course) throws CourseException;

public String updateFees(int cid, int fee) throws CourseException;

public String deletCourse(int cid) throws CourseException;

public Course searchInfoCourse(String cname) throws CourseException;

public String createBatch(Batch batch) throws BatchException;

public String allocateStudent(StudentBatch sb) throws BatchException;

public String updateSeat(int bid,int value) throws BatchException;

public List<StudentDTO> viewStudentOfBatch() throws StudentException;



}
