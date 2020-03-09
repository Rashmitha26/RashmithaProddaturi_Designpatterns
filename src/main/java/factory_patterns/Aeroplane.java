package factory_patterns;

public class Aeroplane extends Vehicle{
	String company;
	Aeroplane(String fuel,String company){
		super(fuel);
		this.company=company;
	}
	public String movement() {
		return "This uses airways as mode of transport";
	}
	@Override
	public String toString() {
		String x="Company is: "+this.company+". It uses "+this.fuel+" as fuel. "+this.movement();
		return x;
	}

}
