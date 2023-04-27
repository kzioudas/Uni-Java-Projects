public class Vehicle
{
	private int SerialNum;
	private String Col;
	private double MonthlyIns;
	
	public Vehicle(int SerialNum, String Col,double MonthlyIns)
	{ 	this.SerialNum=SerialNum;
		this.Col = Col;
		this.MonthlyIns= MonthlyIns;
	}
	
	public void setMonthlyIns(double MonthlyIns)
	{
		this.MonthlyIns = MonthlyIns;
	}
	public double halfYearInsurance()
	{
		double hyi = this.MonthlyIns * 6;
		return hyi;
	}
	public double yearInsurance()
	{
		double yi = (halfYearInsurance()*2)-(halfYearInsurance()*0.08);
		return yi;
	}
	public String toString()
	{
		String s= "Vehicle id: " + this.SerialNum +", color: " + this.Col + ", monthly insurance: " + this.MonthlyIns;
		return s;
	}
}

		
		
