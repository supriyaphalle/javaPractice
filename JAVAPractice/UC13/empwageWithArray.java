import java.util.*; 

class wageComputation{
   public static final int IS_PART_TIME=1;
   public static final int IS_FULL_TIME=2;
   public  String company;
   public  int empRatePerHrs;
   public  int numOfWorkingDays;
   public  int maxHrsInMonth;

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
		HashMap<Integer,String> dailyWage = new HashMap<Integer,String>();
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
		//	dailyWage.put(totalWorkingDays, empWage);
         totalEmpWage=totalEmpWage+empWage;

	   	dailyWage.put(totalWorkingDays," "+company +"  " +empWage+" TotalEmpWage "+totalEmpWage);

//         System.out.println("for day "+totalWorkingDays +"wage =  "+empWage);
      }
      System.out.println("Employee Wage For Company "+ company +" is  : "  +totalEmpWage );
		//	print(map);
		for(int i :dailyWage.keySet()){
		System.out.println(i+ " " +dailyWage.get(i));
	}

}

}
public class empwageWithArray
{
	public static void main (String[] args)
	{
		ArrayList<wageComputation> arrayList =  new ArrayList<wageComputation>();
		arrayList.add(new wageComputation("DMart",20,20,100));
		arrayList.add(new wageComputation("BigBasket",30,30,80));
		for(int i=0; i<arrayList.size();i++)
		{
	//		int i=0;
			arrayList.get(i).computeWage();
		}
	}
}
