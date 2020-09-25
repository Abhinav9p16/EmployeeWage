package wageCompute;

public class EmpWage {
public static void main(String[] args) {
	
	int IS_PART_TIME = 1;
	int IS_FULL_TIME = 2;
	int EMP_RATE_PER_HOUR = 20;
	int empHrs = 0;
	int empWage = 0;
	int NUM_OF_WORKING_DAYS=20;
	int totalEmpWage = 0;
	int totalWorkingDays = 0;
	int totalEmpHrs = 0;
	int MAX_HRS_IN_MONTH = 100;
	while(totalWorkingDays<=NUM_OF_WORKING_DAYS && totalEmpHrs<= MAX_HRS_IN_MONTH)
	{	totalWorkingDays++;
		int empCheck = (int) Math.floor(Math.random()*10)%3;
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
			totalEmpHrs += empHrs;
			System.out.println("Day#: " +totalWorkingDays + "Emp Hr: " +empHrs);
	}
	totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR ;
	System.out.println("Total Emp Wage: " + totalEmpWage);




}
}
