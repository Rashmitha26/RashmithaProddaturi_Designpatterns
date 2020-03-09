package factory_patterns;
public class Vehicle implements ModeOfTransport{
	String fuel;
	public Vehicle(String fuel) {
		this.fuel=fuel;
	}
	public String movement()
	{
		String x="This tells the mode of transport of the vehicle";
		return x;
	}
}