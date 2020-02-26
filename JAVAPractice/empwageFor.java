public class empwageFor{
		// Constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUMBER_OF_WORKING_DAYS=20;

	public static void main (String[] args){
		//variables
		int empWage=0;
		int empHrs=0;
		int totalEmpWage=0;
		//Computation\
		for ( int days =0; days<NUMBER_OF_WORKING_DAYS;days++)
		{
			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
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
			empWage= empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage=totalEmpWage+empWage;	
	}
		System.out.println("Emp Wage = " + totalEmpWage );
	
}
}
