package wageCompute;

public class EmpWage {
public static void main(String[] args) {
	
	int IS_FULL_TIME = 2;
	int IS_PART_TIME = 1;
	int EMP_RATE_PER_HOUR = 20;
	
	int empHrs = 0;
	int empWage = 0;
	
	int empCheck = (int) Math.floor(Math.random()*10)%2;
	switch(empCheck) 
	{
	case 1: 
		empHrs = 8;
		System.out.print("Employee Present Fulltime ");
		break;
		
	case 2:
		empHrs = 4;
		System.out.print("Employee Present Parttime ");
		break;
	default:
		empHrs = 0;	
		System.out.print("Employee absent ");
	}	
		    empWage = empHrs * EMP_RATE_PER_HOUR;
		    System.out.println("Emp Wage: " + empWage);
		    



}
}
