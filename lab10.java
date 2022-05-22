
//thread
class Multi3 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
Multi3 m1=new Multi3();  
Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
t1.start();  
 }  
}  
--------------------------
public class MyThread2 implements Runnable  
{    
public void run()  
{    
System.out.println("Now the thread is running ...");    
}    
    
// main method  
public static void main(String argvs[])  
{   
// creating an object of the class MyThread2  
Runnable r1 = new MyThread2();   
  
// creating an object of the class Thread using Thread(Runnable r, String name)  
Thread th1 = new Thread(r1, "My new thread");    
  
// the start() method moves the thread to the active state  
th1.start();   
  
// getting the thread name by invoking the getName() method  
String str = th1.getName();  
System.out.println(str);  
}    
}    
--------------------------------
// Importing the required classes  
import java.lang.*;  
  
public class ThreadPriorityExample extends Thread   
{  
  
// Method 1  
// Whenever the start() method is called by a thread  
// the run() method is invoked  
public void run()  
{  
// the print statement  
System.out.println("Inside the run() method");  
}  
  
// the main method  
public static void main(String argvs[])  
{  
// Creating threads with the help of ThreadPriorityExample class  
ThreadPriorityExample th1 = new ThreadPriorityExample();  
ThreadPriorityExample th2 = new ThreadPriorityExample();  
ThreadPriorityExample th3 = new ThreadPriorityExample();  
  
// We did not mention the priority of the thread.  
// Therefore, the priorities of the thread is 5, the default value  
  
// 1st Thread  
// Displaying the priority of the thread  
// using the getPriority() method  
System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
  
// 2nd Thread   
// Display the priority of the thread  
System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
  
// 3rd Thread   
// // Display the priority of the thread  
System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
  
// Setting priorities of above threads by  
// passing integer arguments  
th1.setPriority(6);  
th2.setPriority(3);  
th3.setPriority(9);  
  
// 6  
System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
  
// 3  
System.out.println("Priority of the thread th2 is : " + th2.getPriority());  
  
// 9  
System.out.println("Priority of the thread th3 is : " + th3.getPriority());  
  
// Main thread  
  
// Displaying name of the currently executing thread   
System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
  
// Priority of the main thread is 10 now  
Thread.currentThread().setPriority(10);  
  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
}  
}  
--------------------------------

//example of java synchronized method  
class Table{  
 synchronized void printTable(int n){//synchronized method  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThread1 extends Thread{  
Table t;  
MyThread1(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
public class TestSynchronization2{  
public static void main(String args[]){  
Table obj = new Table();//only one object  
MyThread1 t1=new MyThread1(obj);  
MyThread2 t2=new MyThread2(obj);  
t1.start();  
t2.start();  
}  
}  
-----------------------------------
==========================================
package threadtest;

/*class MyThread extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}*/

class MyRunnable implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class ThreadTest //implements Runnable //extends Thread
{
    /*public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }*/
    
    public static void main(String[] args) {
        
        //MyThread t=new MyThread();
        //ThreadTest t=new ThreadTest();
        MyRunnable t=new MyRunnable();
        Thread th=new Thread(t);
        
        th.start();
        
        int i=1;
        while(true)
        {
            System.out.println(i+"World");
        }
        
    }
    
}
======================================
package threadtest1;

/*class MyRun implements Runnable
{
    public void run()
    {
        
    }
}*/
class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        //setPriority(Thread.MAX_PRIORITY);
        //setPriority(Thread.MIN_PRIORITY+2);
    }
    
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class ThreadTest1 {

    public static void main(String[] args) 
    {
        //Thread t=new Thread(new MyRun(),"My Name");
        MyThread t=new MyThread("My Thread 1");
        t.start();
        t.interrupt();
        /*System.out.println("ID "+t.getId());
        System.out.println("Name "+t.getName());
        System.out.println("Priority "+t.getPriority());
        t.start();
        System.out.println("State "+t.getState());
        System.out.println("Alive "+t.isAlive());*/
    }
    
}
==================================

class MyData
{
    synchronized public void display(String str)
    {
            for(int i=0;i<str.length();i++)
            {
                 System.out.print(str.charAt(i));
                 try{Thread.sleep(100);}catch(Exception e){}
            }
        
    }
}

class MyThread1 extends Thread
{
    MyData d;
    public MyThread1(MyData d)
    {
        this.d=d;
    }
    
    public void run()
    {
        d.display("Hello World");
    }
            
    
}

class MyThread2 extends Thread
{
    MyData d;
    public MyThread2(MyData d)
    {
        this.d=d;
    }
    
    public void run()
    {
        d.display("Welcome All");
    }
            
    
}

public class SyncDemo 
{
    public static void main(String[] args) 
    {
        MyData data=new MyData();
        
        MyThread1 t1=new MyThread1(data);
        MyThread2 t2=new MyThread2(data);
        
        t1.start();
        t2.start();
        
        
    
    }    
}
=================================

class ATM
{
    
    synchronized public void checkBalance(String name)
    {
       System.out.print(name + " Checking ");
       
       try{Thread.sleep(1000);}catch(Exception e){}
       
       System.out.println("Balance");
    }
    
    synchronized public void withdraw(String name,int amount)
    {
        System.out.print(name + " withdrawing "); 
        
        try{Thread.sleep(1000);}catch(Exception e){}
        
        System.out.println(amount);
        
    }
}

class Customer extends Thread
{
    String name;
    int amount;
    ATM atm;
    
    Customer(String n,ATM a,int amt)
    {
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM()
    { 
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run()
    {
        useATM();
    }
}

public class SCThread1 
{
    public static void main(String[] args) 
    {
        ATM atm=new ATM();
        Customer c1=new Customer("Smith",atm,100);
        Customer c2=new Customer("John",atm,200);
        c1.start();
        c2.start();
        
        
    }   
}
