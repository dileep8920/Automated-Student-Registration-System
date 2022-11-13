package com.masai.main;

import java.util.Scanner;

import com.masai.usecases.AdminUseCase;
import com.masai.usecases.StudentUseCase;

public class Main {


static Scanner sc= new Scanner(System.in);

 static {
		
		System.out.println();
		System.out.println();

		System.out.println("          *****-*****-******-*****-*****-******-*****-*****-******-*****");
		
		System.out.println();

		System.out.println("                  WELCONE TO AUTOMATED STUDENT REGISTRATION SYSTEM");
		System.out.println();

		System.out.println("          *****-*****-******-*****-*****-******-*****-*****-******-*****");
		
		System.out.println();
		System.out.println();
	 
 }
 
 
 
 public static void main(String[] args) {
		
		
		mainMenu();
	}
 
 
 public static void mainMenu() {            
		
	     
	 System.out.println("PLEASE SELECT ONE OPTION");
	 
		System.out.println();
		
		System.out.println("1. ADMIN");
		System.out.println("2. STUDENT");
		System.out.println("9. EXIT");
		
		System.out.println("ENTER YOUR OPTION IN NEXT LINE");
		int rest = sc.nextInt();
		
		switch (rest) {
		  case 1:
			  System.out.println("WELCOME TO ADMIN SECTION");
		    System.out.println();
		    adminAuthorizetion();
		    break;
		  case 2:
			  System.out.println("WELCOME TO STUDENT SECTION");
		    System.out.println();
		    studentAuthorizetion();
		    break;
		  case 9:
			  System.out.println("THANK YOU");
			  System.out.println("WELCOME");
		    break;
		  default:
			  System.out.println("INVALID PLEASE SELECT RIGHT OPTION");
			  mainMenu();
		}
 }
 
 
 
 public static void adminAuthorizetion() {
	 
	 System.out.println("PLEASE SELECT ONE OPTION ");
		System.out.println();
		
		System.out.println("1. NEW ADMIN REGISTRATION");
		System.out.println("2. ADMIN LOGIN");
		System.out.println("0. MAIN MENU");
		System.out.println("9. EXIT");
		System.out.println("PLEASE ENTER YOUR OPTION IN NEXT LINE");
		
		AdminUseCase ad= new AdminUseCase();
		
		int day = sc.nextInt();
		switch (day) {
		  case 1:
		    ad.adminRegistration();
		    adminAuthorizetion();
		    break;
		  case 2:
		    int res=ad.adminLogin();
		    if(res == 1) adminTask();
		    else adminAuthorizetion();
		    break;
		  case 0:
		    mainMenu();
		    break;
		  case 9:
			  System.out.println("THANK YOU");
			  System.out.println("WELCOME");
			break;
		  default:
			  System.out.println("INVALID PLEASE SELECT RIGHT OPTION");
		    adminAuthorizetion();
		}
		
 }
 
 public static void adminTask() {
	 
	 System.out.println("PLEASE SELECT ONE OPTION");
	 
	 System.out.println();
		
	 	System.out.println("1. Add new Course");
		System.out.println("2. Update Fees of Course");
		System.out.println("3. Delete Course");
		System.out.println("4. Search Course");
		System.out.println("5. Create Batch");
		System.out.println("6. Add Student in Batch");
		System.out.println("7. Update Seats in Batch");
		System.out.println("8. View Student in Batch");
		System.out.println("0. GO BACK");
		System.out.println("10. MAINMENU");
		System.out.println("9. EXIT");
		
		System.out.println("ENTER YOUR OPTION IN NEXT LINE");
		
		AdminUseCase ad= new AdminUseCase();
		
		int rest = sc.nextInt();
		
		switch (rest) {
		  case 1:
		    ad.addCourse();
		    adminTask();
		    break;
		  case 2:
			ad.updateFees();
		    adminTask();
		    break;
		  case 3:
			ad.deletCours();;
			adminTask();
			break;
		  case 4:
			ad.searchInfoCourse();
			adminTask();
			break;
		  case 5:
			ad.createBatch();
			adminTask();
			break;
		  case 6:
			ad.allocateStudent();
			adminTask();
			break;
		  case 7:
			ad.updateSeat();
			adminTask();
			break;
		  case 8:
			ad.viewStudentOfBatch();
			adminTask();
			break;
		  case 0:
			adminAuthorizetion();
			break;
		  case 10:
			mainMenu();
			break;
		  case 9:
			  
			  System.out.println("THANK YOU");
			  System.out.println("WELCOME");
		    break;
		  default:
			  System.out.println("INVALID PLEASE SELECT RIGHT OPTION");
			  adminTask();
		}
		
 }
 
 
 public static void studentAuthorizetion() {
	 
	 System.out.println("PLEASE SELECT ONE OPTION");
		System.out.println();
		
		System.out.println("1. New Student Registration");
		System.out.println("2. Student Login");
		System.out.println("3. Show All Courses and Seats Available");
		System.out.println("0. GO BACK");
		System.out.println("10. MAINMENU");
		System.out.println("9. EXIT");
		System.out.println("ENTER YOUR OPTION IN NEXT LINE");
		
		StudentUseCase st = new StudentUseCase();
		
		int day = sc.nextInt();
		switch (day) {
		  case 1:
		    st.studentRegistration();
		    studentAuthorizetion();
		    break;
		  case 2:
		    int res=st.login();
		    if(res == 1) studentTask();
		    else studentAuthorizetion();
		    break;
		  case 3:
			st.availableCourseSeat();
			studentAuthorizetion();
			break;
		  case 0:
		    mainMenu();
		    break;
		  case 10:
			mainMenu();
			break;
		  case 9:
			  System.out.println("THANK YOU");
			  System.out.println("WELCOME");
			break;
		  default:
			  System.out.println("INVALID PLEASE SELECT RIGHT OPTION");
		    adminAuthorizetion();
		}
		
 }
 
 
 public static void studentTask() {
	 System.out.println("PLEASE SELECT ONE OPTION");
	 System.out.println();
	 
	 System.out.println("1. Update Details ");
	 System.out.println("0. GO BACK");
	 System.out.println("10. MAINMENU");
	 System.out.println("9. EXIT");
	 System.out.println("ENTER YOUR OPTION IN NEXT LINE");
	 
	 StudentUseCase st = new StudentUseCase();
	 
	 int day = sc.nextInt();
		switch (day) {
		  case 1:
		    st.updateDetails();
		    studentTask();
		    break;
		  case 0:
		    mainMenu();
		    break;
		  case 10:
			mainMenu();
			break;
		  case 9:
			  System.out.println("THANK YOU");
			  System.out.println("WELCOME");
			break;
		  default:
			  System.out.println("INVALID PLEASE SELECT RIGHT OPTION");
		    adminAuthorizetion();
		}
 }
 

}
