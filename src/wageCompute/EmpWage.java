package wageCompute;

public class EmpWage {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

public static int compute(String company ,int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH  )

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
public static void main(String[] args) {
	
	compute("DMart",20, 2, 10 );
	compute("Reliance",10, 4, 20 ); 
	
}
}
