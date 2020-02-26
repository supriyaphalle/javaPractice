import java.util.*;

class empWageBuilder{
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static HashMap<String,Integer> dailyWage = new HashMap<String,Integer>;
	ArrayList<wageComputation> arrayList =  new ArrayList<wageComputation>();


	public void addCompany(String company, int empRatePerHrs,int numOfWorkingDays,int maxHrsInMonth){
		arrayList.add(new wageComputation(company,empRatePerHrs,numOfWorkingDays,maxHrsInMonth));
		arrayList.get(arrayList.size()-1).computeWage();

	}

	public void computeWage()
	{   //variables
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
            dailyWage.put(company +" " +totalWorkingDays,empWage);
        }
      //  System.out.println(".................Employee Wage For Company "+ company +" is  : "  +totalEmpWage );
       dailyWage.put("totalWage for "+company,totalEmpWage);
      for(String i :dailyWage.keySet()){
            System.out.println(i+ " " +dailyWage.get(i));
        }
    }
	
	public void printTotalWage(String company ){
      System.out.println( " ....................Print totoal hashmap.................."); 
      System.out.println("TotalWage  for" +company +" " +dailyWage.get("totalWage for "+company));
	}



    public static void main (String[] args)
    {
		empWageBuilder object = new empWageBuilder();
		object.addCompany("BigBasket",30,30,80));
		object.addCompany("Reliance",10,40,67));
		object.addCompany("StarBazar",30,40,60));
		arrayList.get(arrayList.size()-1).printTotalWage("DMart");
	}
}


