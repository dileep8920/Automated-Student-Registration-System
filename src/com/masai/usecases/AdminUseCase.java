package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.Exceptions.AdminException;
import com.masai.Exceptions.BatchException;
import com.masai.Exceptions.CourseException;
import com.masai.Exceptions.StudentException;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.model.Batch;
import com.masai.model.Admin;
import com.masai.model.Course;
import com.masai.model.StudentBatch;
import com.masai.model.StudentDTO;

public class AdminUseCase {


	public static void adminRegistration() {
		
		Scanner sc= new Scanner(System.in);
				
		System.err.println("Enter Admin Details");
		
		System.out.println("-----------------------------------");
		
		
		System.out.println("Enter Name");
		String name= sc.nextLine();
		
		
		System.out.println("Enter username");
		String username = sc.next();
		
		System.out.println("Enter Passward");
		String password = sc.next();
		
		
		Admin admin= new Admin();
		
		admin.setAname(name);
		admin.setUsername(username);
		admin.setPassword(password);
		
		
		AdminDao dao = new AdminDaoImpl();
		
		try {
			String res= dao.adminRegistration(admin);
			System.out.println(res);
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
				
	}
	
	
	public static int adminLogin() {
		int x = 0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter username");
		String username = sc.next();
		
		System.out.println("Enter Passward");
		String password = sc.next();
		
		AdminDao dao = new AdminDaoImpl();
		
			try {
				String res= dao.login(username, password);
				System.out.println(res);
				x=1;
			} catch (AdminException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
			return x;
	}
	
	
	public static void addCourse() {
		
		Scanner sc= new Scanner(System.in);
		
		System.err.println("Enter Course Details");
		
		System.out.println("----------------------------");
		
		System.out.println("Enter Couse Id");
		int id=sc.nextInt();
		
		
		System.out.println("Enter Course Name");
		String name = sc.next();
		
		System.out.println("Enter Couse fee");
		int fee=sc.nextInt();
		
		
		Course course= new Course(id,name,fee);
		
		AdminDao dao = new AdminDaoImpl();
		
		
			String res;
			try {
				res = dao.addCourse(course);
				System.out.println(res);
			} catch (CourseException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
	}
	
	
	public static void updateFees() {
		
		Scanner sc= new Scanner(System.in);
		
		System.err.println("Enter Course Details");
		
		System.out.println("----------------------------");
		
		System.out.println("Enter Couse Id");
		int id=sc.nextInt();
		
		System.out.println("Enter Couse updated fee");
		int fee=sc.nextInt();
		
		AdminDao dao = new AdminDaoImpl();
		
		try {
			String res= dao.updateFees(id, fee);
			System.out.println(res);
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static void deletCours() {
		
		Scanner sc= new Scanner(System.in);
		
		System.err.println("Enter Course Details");
		
		System.out.println("----------------------------");
		
		System.out.println("Enter Couse Id which you want to delete");
		int id=sc.nextInt();
		
		AdminDao dao = new AdminDaoImpl();
		
		try {
			String res= dao.deletCourse(id);
			System.out.println(res);
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void searchInfoCourse() {
		
		Scanner sc= new Scanner(System.in);
		
		System.err.println("Enter Course Details");
		
		System.out.println("----------------------------");
		
		System.out.println("Enter Course Name which you want to search");
		String name = sc.next();
		
		AdminDao dao = new AdminDaoImpl();
		
		try {
			Course cou= dao.searchInfoCourse(name);
			System.out.println(cou);
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public static void createBatch() {
		
		Scanner sc= new Scanner(System.in);
		
		System.err.println("Enter batch Details");
		
		System.out.println("----------------------------");
		
		System.out.println("Enter batch name");
		String name = sc.next();
		
		System.out.println("enter batch duration in week format");
		int duration = sc.nextInt();
		
		System.out.println("enter batch seates capacity");
		int seates=sc.nextInt();
		
		System.out.println("enter Course Id");
		int cid = sc.nextInt();
		
		
		Batch batch= new Batch();
		
		
		batch.setBname(name);
		batch.setBduration(duration);
		batch.setBseats(seates);
		batch.setCid(cid);
		
		AdminDao dao = new AdminDaoImpl();
		
		
		try {
			String res= dao.createBatch(batch);
			System.out.println(res);
		} catch (BatchException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	public static void allocateStudent() {
		
		Scanner sc= new Scanner(System.in);
		
		System.err.println("Enter detail bout Student roll batch id and course id");
		
		System.out.println("----------------------------");
		
		System.out.println("enter Student roll number");
		int roll = sc.nextInt();
		
		
		System.out.println("enter batch id");
		int bid = sc.nextInt();
		
		System.out.println("enter course id");
		int cid = sc.nextInt();
		
		StudentBatch sb= new StudentBatch(roll, cid, bid);
		
		AdminDao dao = new AdminDaoImpl();
		
		try {
			String res= dao.allocateStudent(sb);
			System.out.println(res);
		} catch (BatchException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void updateSeat() {
		
		Scanner sc= new Scanner(System.in);
		
		System.err.println("Enter detail of batch for update seat limite");
		
		System.out.println("----------------------------");
		
		
		System.out.println("enter batch id ");
		int id = sc.nextInt();
		
		System.out.println("enter seat value which you want to update");
		int value = sc.nextInt();
		
		AdminDao dao = new AdminDaoImpl();
		
		try {
			String res=  dao.updateSeat(id, value);
			System.out.println(res);
		} catch (BatchException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public static void viewStudentOfBatch() {
		
		
		
		AdminDao dao = new AdminDaoImpl();
		
		try {
			List<StudentDTO> student = dao.viewStudentOfBatch();
			
			if(student.size() == 0 ) {
				System.out.println("No data found");
			}else
				student.forEach(s -> System.out.println(s));
				
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		addCourse();

	}


}
