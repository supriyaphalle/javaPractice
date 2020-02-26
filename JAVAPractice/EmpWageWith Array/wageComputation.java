public class wageComputation{
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public  String company="";
   public  int empRatePerHrs=0;
   public  int numOfWorkingDays=0;
   public  int maxHrsInMonth=0;

   public wageComputation (String company, int empRatePerHrs,int numOfWorkingDays,int maxHrsInMonth)
   {
      this.company=company;
      this.empRatePerHrs=empRatePerHrs;
      this.numOfWorkingDays=numOfWorkingDays;
      this.maxHrsInMonth=maxHrsInMonth;
   }

	public void computeWage(){
			//variables
		int totalEmpWage=0;
		int totalEmpHrs=0; int totalWorkingDays=0;
		//Computation\
		System.out.println("Wage computation for "+company);
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
			int empWage=empHrs *empRatePerHrs;
			totalEmpWage=totalEmpWage+empWage;
			System.out.println("for day "+totalWorkingDays +"wage =  "+empWage);
		}
		System.out.println("Employee Wage For Company "+ company +" is  : "  +totalEmpWage );
	}

}

