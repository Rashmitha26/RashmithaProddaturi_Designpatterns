package factory_patterns;

public class FactoryPattern {
	public static void main(String args[]) {
		Car car=new Car("Petrol","black");
		Aeroplane aeroplane=new Aeroplane("gasoline","Air India");
		System.out.println(car);
		System.out.println(aeroplane);
	}

}
