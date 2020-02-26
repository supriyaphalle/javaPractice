import java.util.*;

class wageComputation{
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public  String company;
    public  int empRatePerHrs;
    public  int numOfWorkingDays;
    public  int maxHrsInMonth;
    public static HashMap<String,Integer> dailyWage = new HashMap<String,Integer>();

    public wageComputation (String company, int empRatePerHrs,int numOfWorkingDays,int maxHrsInMonth)
    {
        this.company=company;
        this.empRatePerHrs=empRatePerHrs;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHrsInMonth=maxHrsInMonth;
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

}


public class empwageWithArray
{
    public static void main (String[] args)
    {
        ArrayList<wageComputation> arrayList =  new ArrayList<wageComputation>();
        arrayList.add(new wageComputation("DMart",20,20,100));
        arrayList.add(new wageComputation("BigBasket",30,30,80));
        arrayList.add(new wageComputation("Reliance",10,40,67));
        arrayList.add(new wageComputation("StarBazar",30,40,60));
        for(int i=0; i<arrayList.size();i++)
        {
            arrayList.get(i).computeWage();
        }
		  arrayList.get(arrayList.size()-1).printTotalWage("DMart");
    }
}




