/*  LAB-7    part2

1.Any two type of inheritance
4.Accessing parent class variable, method and constructor using super
5.Reusing parent constructor using super
6.Abstract class with constructor member and methods
*/
class Vehicle
{
    int maxSpeed = 120;
    Vehicle()
    {
        System.out.println("________________________________________________________________ ");
        System.out.println("Vehicle class Constructor");
    }
	void message()
	{
		System.out.println("This is vehicle class");
	}
}

class Truck extends Vehicle
{
    int maxSpeed = 180;
    Truck()
    {
        // Reusing parent constructor using super
        //super keyword is used to invoke method overloading
        super();
  
        System.out.println("Truck class Constructor");
    }


	void message()
	{
		System.out.println("This is student class");
	}

	// Note that display() is only in Student class
	void display()
	{
        
		// will invoke or call current class message() method
		message();

		// will invoke or call parent class message() method using super
		super.message();
        /* print maxSpeed of base class (vehicle) */
        System.out.println("Maximum Speed: " + super.maxSpeed);
	}
}

abstract class Safari                                                //abstract class (may or may not have defination )
{
    Safari()                                                         //constructor of abstract class
    {
        System.out.println("________________________________________________________________ ");
        System.out.println("Lets enjoy SAFARI ride!!!! ");
    }  
    abstract void runSafari();                                       //abstract method (with no defination)

    void WildSafari()
    {
         System.out.println("Switch to Wild Safari");
    }  
  }  
 //Creating a Child class which inherits Abstract class  
 class Thar extends Safari{  
  void runSafari()
  {
      System.out.println("Safari ride is Awsm!!");
  }  
  
}
class lab7
{
	public static void main(String args[])
	{
		Truck s = new Truck();          
		s.display();                    // calling display() of Truck class
        Safari obj = new Thar();        //can't create object of Safari as it is an Abstract class so used normal class
        obj.runSafari();                //calling abstract method
        obj.WildSafari();
	}
}
