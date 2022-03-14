package emailApp;

import java.util.Scanner;

public class Employee
{
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordlength=8;
	private String companySuffix="abc.com";
	//Constructor to receive first name and last name
	public Employee(String fname,String lname )
	{
		this.firstname=fname;
		this.lastname=lname;
		 
		
	// call a method asking for the department and return the department
		this.department=setDepartment();
		 
		
	
	  
	  //Generate Email
	  this.email=generateEmailAddress();
	  
	// call the method to return random password
			this.password=generatePassword(defaultPasswordlength);
		  
		}
	

//Ask for the department
		private String setDepartment() {
			System.out.print( " Please enter Department from the Followings \n1.Technical\n2.Admin\n3.Human Resources\n4.Legal ");
			Scanner in= new Scanner(System.in);
			int deptchoice=in.nextInt();
			if(deptchoice==1) {return "tech";}
			else if(deptchoice==2) {return "admin";}
			else if(deptchoice==3) {return "hr";}
			else if(deptchoice==4) {return "legal";}
			else {return " " ;}
			
		}
		private String generatePassword(int length) {
			String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
			char[] password=new char[length];
			for(int i=0;i<length;i++) {
				int rand=(int) (Math.random()*passwordSet.length());
				password[i]=passwordSet.charAt(rand);
				
			}
			return new String(password);
			
			
		}
		private String generateEmailAddress() {
			email=firstname.toLowerCase()+lastname.toLowerCase()+"@"+department+"."+companySuffix;
			return email;
		}
		public void showCredentials() {
			System.out.println("Email-->"+this.email);
			System.out.println("Password --> "+this.password);
		}
}

