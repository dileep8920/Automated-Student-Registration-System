package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.Exceptions.CourseException;
import com.masai.Exceptions.StudentException;
import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.model.CourseDTO;
import com.masai.model.Student;

public class StudentUseCase {

public static void studentRegistration() {
		
		Scanner sc= new Scanner(System.in);
		
		System.err.println("Enter student Details");
		
		System.out.println("-----------------------------------");
		
		
		System.out.println("Enter Name");
		String name= sc.nextLine();
		
		
		System.out.println("Enter adress");
		String adress = sc.next();
		
		System.out.println("Enter email");
		String email = sc.next();
		
		System.out.println("Enter password");
		String pass = sc.next();
		
		
		Student student = new Student();
		
		student.setName(name);
		student.setAddress(adress);
		student.setEmail(email);
		student.setPassward(pass);
		
		
		StudentDao dao= new StudentDaoImpl();
		
		
		try {
			String res= dao.studentRegistration(student);
			System.out.println(res);
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	
	public static int login() {
		
		int x=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter username");
		String username = sc.next();
		
		System.out.println("Enter Passward");
		String password = sc.next();
		
		StudentDao dao= new StudentDaoImpl();
		
		try {
			String res= dao.login(username, password);
			System.out.println(res);
			x=1;
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return x;
	}

	
	public static void updateDetails() {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter roll");
		int roll= sc.nextInt();
		
		System.out.println("Enter field");
		String field = sc.next();
		
		System.out.println("Enter value");
		String value = sc.next();
		
		
		StudentDao dao= new StudentDaoImpl();
		
		try {
			String res= dao.updateDetails(roll, field, value);
			System.out.println(res);
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void availableCourseSeat() {
		
		StudentDao dao= new StudentDaoImpl();
		
		
		try {
			List<CourseDTO> student= dao.availableCourseSeat();
			
			if(student.size() == 0 ) {
				System.out.println("No data found");
			}else
				student.forEach(s -> System.out.println(s));
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
			
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
