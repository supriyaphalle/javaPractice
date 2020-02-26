import java.util.*; 

public class empwageWithCompanyArray
{
  	public static void main (String[] args)
	{
		ArrayList <wageComputation> arrayList =  new ArrayList <wageComputation>();
		arrayList.add(new wageComputation("DMart",20,2,10));
		arrayList.add(new wageComputation("BigBasket",10,4,20));
		for(int i=0; i<arrayList.size();i++)
		{
			arrayList.get(i).computeWage();
		}
	}
}
