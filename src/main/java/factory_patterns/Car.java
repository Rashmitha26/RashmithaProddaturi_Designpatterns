package factory_patterns;

public class Car extends Vehicle {
	String color;
	Car(String fuel,String color){
		super(fuel);
		this.color=color;
	}
	public String movement() {
		String x="Mode of transport is Roadways.";
		return x;
	}
	@Override
	public String toString() {
		String x="Color of car: "+this.color+".It uses "+this.fuel+" as fuel. "+this.movement();
		return x;
	}

}
