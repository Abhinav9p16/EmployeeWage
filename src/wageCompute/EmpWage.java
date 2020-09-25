package wageCompute;

public class EmpWage {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int empWage = 0;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH = 100;

	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Total Emp Wage: " +compute() ); 
		

	}
private static int compute()

{  int empHrs = 0;
   int totalWorkingDays = 0;
   int totalEmpHrs = 0;
   int totalEmpWage = 0;

	while(totalWorkingDays<=NUM_OF_WORKING_DAYS && totalEmpHrs<= MAX_HRS_IN_MONTH)
	{	totalWorkingDays++;
		int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch(empCheck) 
			{
			case 1: 
				empHrs = 8;
		
				break;
				
			case 2:
				empHrs = 4;
			
				break;
			default:
				empHrs = 0;	
			
			}	
			totalEmpHrs += empHrs;
			
			
			totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR ;			
		}
	return totalEmpWage;	

	}
}
