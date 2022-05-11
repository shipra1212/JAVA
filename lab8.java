/*lab 8  (completed)
interface supports multiple inheritance whereas Abstract doesn't, (only abstract method)(no def)(only static and final)

 Implement Interface and Packages with following constraints
 1.Multiple Inheritance using interface
 2.Extending Interface
 3.Default ad Static method inside interface
 4.Nested Interface     //class abc implements interface1.interface2
 5.Implement package with fully qualified name and display the package information using Package class
*/

interface Automatic {
    void car();
 }
 interface Manual {
    void bike();
 }
interface Engine extends Automatic{
    void petrol();
    void diesel();
}
 class Vehicle  implements Automatic , Manual                 //multiple inheritance
 {
    
    public void car() {
        System.out.println("____________________multiple inheritance of  interface__________________________\n");
       System.out.println("This is automatic car");
    }
    public void bike() {
       System.out.println("Manual bike");
       System.out.println("____________________extending interface__________________________\n");
    }
    public void petrol() {
        System.out.println("petrol printed");
     }
     public void diesel() {
        System.out.println("diesel printed");
     }
     public static void safe() {
        System.out.println("__________This is a static method_______"); 
     }

 }

 interface Testspeed
{
   interface Speedup
   {
      void show();   
      public default void display() {
        System.out.println("__________________default method ___________________\n");
        System.out.println("Drive safe!!!!!");
     } 
   }
}
  
class Testing implements Testspeed.Speedup
{
   public void show()
   {
      System.out.println("____________________nested interface__________________________\n");
      System.out.println("Speeding up the vehicle!!!!!!");
   } 
} 
  
 public class lab8 {
    public static void main(String args[]) {
       Vehicle a = new Vehicle();
       a.car();
       a.bike();
       a.petrol();
       a.diesel();
       Vehicle.safe();
       
      Testspeed.Speedup obj;
      Testing t = new Testing();
      obj = t;
      obj.show();
      obj.display();
       
    }
 }
