public class empwageWithCompanyArray
{
  	public static void main (String[] args)
	{
		wageComputation[] array = new wageComputation[5];
		array[0]= new wageComputation("DMart",20,2,10);
//		array[0].computeWage();
		array[1]= new wageComputation("BigBasket",10,4,20);

		for(int i=0; i<2;i++)
		{
			array[i].computeWage();
		}
	}
}
