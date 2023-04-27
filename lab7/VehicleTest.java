class VehicleTest
{
	public static void main(String args[])
	{ 	
		Vehicle[] VehicleArray = new Vehicle[3];
		VehicleArray[0] = new Vehicle(1,"white",15);
		VehicleArray[1] = new SportsCar(2,"red",20,30);
		VehicleArray[2] = new MotorCycle(3,"black",10,10);
		for(int i=0;i<3;i++)
		{	
			System.out.println(VehicleArray[i].toString());
			System.out.println("Half year's insurance cost = " +VehicleArray[i].halfYearInsurance());
			System.out.println("Whole year's insurance cost = " +VehicleArray[i].yearInsurance());
		}
	}
}
