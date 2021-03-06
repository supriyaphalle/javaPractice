public class empwageBuilderWithoutObject
{
		// Constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;

	public static  String company;
	public static  int empRatePerHrs;
	public static  int numOfWorkingDays;
	public static  int maxHrsInMonth;

	public static void computeWage(String company, int empRatePerHrs, int numOfWorkingDays, int maxHrsInMonth){
			//variables
	int totalEmpWage=0;
	int totalEmpHrs=0; int totalWorkingDays=0;
	//Computation\
		while( totalEmpHrs <= maxHrsInMonth  &&  totalWorkingDays < numOfWorkingDays)
		{
			int empHrs=0;
			totalWorkingDays++;
			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck)
			 {
				case IS_FULL_TIME:
					empHrs=8;
					break;
				case  IS_PART_TIME:
					empHrs=4;
					break;
		   	default:
					empHrs=0;
					break;
			}
			totalEmpHrs +=empHrs;
			int empWage= empHrs *empRatePerHrs;
			totalEmpWage=totalEmpWage+empWage;	
		}
		System.out.println("Employee Wage For Company "+ company +" is  : "  +totalEmpWage );
	}

	public static void main (String[] args) 
	{
		computeWage("DMart",20,2,10); 
		//dMart.computeWage();
		computeWage("bigBasket",10,4,20); 
	//	bigBasket.computeWage();
	}
}
