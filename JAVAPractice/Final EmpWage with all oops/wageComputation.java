public wageComputation
{ 
	public String company;
	public final int empRatePerHrs;
	public final int numOfWorkingDays;
	public final int maxHrsInMonth;
	public wageComputation (String company, int empRatePerHrs,int numOfWorkingDays,int maxHrsInMonth)
    {
        this.company=company;
        this.empRatePerHrs=empRatePerHrs;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHrsInMonth=maxHrsInMonth;
    }
}

