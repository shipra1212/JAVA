/*  LAB-7
2.Aggregation and Composition
6.Abstract class with constructor member and methods
7.Use final keyword in appropriate place*/

// Engine class which will be used by car. so 'Car' class will have a field of Engine type.
import java.io.*;
class Engine {
	public void work()
	{
		System.out.println("Start the car Engine  !!");
	}
}
                                                             // final - to prevent from overloading
final class Car {

	// For a car to move,it needs to have an engine.-----------Composition (part of)
	private final Engine engine;
	// ------------------------------------------------------- Aggregation (has a)
	Car(Engine engine)                                       //constructor 
	{
		this.engine = engine;                                // This keyword refers to current instance of class
	}
	public void move()
	{
                                                            // if(engine != null)
		{
			engine.work();
			System.out.println("Car is moving ");
		}
	}
}
class CarManufacture {
	public static void main(String[] args)
	{
		Engine engine = new Engine();
		Car car = new Car(engine);    
		car.move();
	}
}
