package department;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  SuperDepartment  a= new AdminDepartment();
  System.out.println( "Welcome to "+a.departmentName());
  System.out.println(a.getTodaysWork());
  System.out.println(a.getWorkDeadline());
  System.out.println(a.isTodayAHoliday());
  System.out.println("\n");
  SuperDepartment  h= new HRdepartment();
  System.out.println( "Welcome to "+h.departmentName());
  HRdepartment h2=new HRdepartment();
  System.out.println(h2.doActivity());
  System.out.println(h.getTodaysWork());
  System.out.println(h.getWorkDeadline());
  System.out.println(h.isTodayAHoliday());
  System.out.println("\n");
  
  SuperDepartment  t= new HRdepartment();
  System.out.println( "Welcome to "+t.departmentName());
  System.out.println(t.getTodaysWork());
  System.out.println(h.getWorkDeadline());
  TechDepartment t2=new TechDepartment();
  System.out.println(t2.getTechStackInformation());
  System.out.println(h.isTodayAHoliday());
  
  
	}
	

}
