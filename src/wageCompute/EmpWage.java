package wageCompute;

public class EmpWage {
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	private String company;
	private int EMP_RATE_PER_HOUR;
	private int NUM_OF_WORKING_DAYS;
	private int MAX_HRS_IN_MONTH;
	private int totalEmpWage ;
	
public EmpWage(String company,int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH)
{
	this.company = company;
	this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
	this. NUM_OF_WORKING_DAYS= NUM_OF_WORKING_DAYS;
	this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
}
	
public void compute()

{  int empHrs = 0;
   int totalWorkingDays = 0;
   int totalEmpHrs = 0;
   

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
		}
	totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR ;
	}

@Override 
 public String toString()
 {
	 return " Total empWage for: " +company+ " is " +totalEmpWage ;
 }
public static void main(String[] args) {
	
	
	EmpWage e1 = new EmpWage("DMart",20,2,10);
    EmpWage e2 = new EmpWage("Reliance",10,4,20);
    e1.compute();
    System.out.println(e1);
    e2.compute();
    System.out.println(e2);	
   }
}
