public class MotorCycle extends Vehicle
{
	private double yearlyDiscount;
	public MotorCycle(int SerialNum, String Col,double MonthlyIns,double yearlyDiscount) 
	{
		super(SerialNum,Col,MonthlyIns);
		this.yearlyDiscount = yearlyDiscount;
	}
	public double yearInsurance()
	{
		double yi = (halfYearInsurance()*2)-(halfYearInsurance()*0.08);
		yi = yi - (yi*yearlyDiscount/100);
		return yi;
	}
	public String toString()
	{
		return super.toString()+", yearly discount: "+yearlyDiscount;
	}
}
