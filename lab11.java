import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        
        ArrayList<Integer> al1=new ArrayList<>(20);
        
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));
        
        al1.add(10);
        al1.add(0,5);
        //al1.addAll(al2);
        al1.addAll(1,al2);
        al1.add(5,70);
        al1.set(6,100);
        
        //al1.forEach(n->System.out.println(n));
        //al1.forEach(System.out::println);
        al1.forEach(n->show(n));
        
        //System.out.println(al1.contains(25));
        //System.out.println(al1.get(5));
        //System.out.println(al1.indexOf(70));
        //System.out.println(al1.lastIndexOf(70));
        
        //System.out.println(al1);
        
        /*for(int i=0;i<al1.size();i++)
            System.out.println(al1.get(i));*/
        
        /*for(Integer x:al1)
            System.out.println(x);*/
        
        /*for(Iterator<Integer> it= al1.iterator(); it.hasNext();)
        {
            java.lang.Integer x = it.next();
            System.out.println(x);
        }*/
        
        /*al1.forEach((x)->{
            System.out.println(x);
        });*/
        
        /*for(Iterator<Integer> it=al1.listIterator();it.hasNext();)
        while(it.hasNext())
        {
            System.out.println(it.next());
        }*/
        
        
    }
    
    static void show(int n)
    {
        if(n>60)
            System.out.println(n);
    }
    
}


------------------------------
package setdemo;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        
        HashSet<Integer> hs=new HashSet<>(20,0.75f);
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        
        System.out.println(hs);
    }
    
}
------------------------------------
package setdemo1;

import java.util.*;

public class SetDemo1 {

    public static void main(String[] args) {
        
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
        
        ts.add(25);
        
        //ts.ceiling(55);
        
        System.out.println(ts);
        
    }
    
}----------------------------
package setdemo2;

import java.util.*;

class Point implements Comparable
{
    int x;
    int y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public String toString()
    {
        return "x="+x+"y="+y;
    }
    public int compareTo(Object o)
    {
        Point p=(Point)o;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else
        {
        if(this.y<p.y) 
            return -1;
        else if(this.y>p.y)
            return 1;
        else 
            return 0;
        }
    }
}

public class SetDemo2 {

    public static void main(String[] args) {
        
        TreeSet<Point> ts=new TreeSet<>();
        
        ts.add(new Point(1,1));
        ts.add(new Point(5,5));
        ts.add(new Point(5,2));
        
        System.out.println(ts);
    }
    
}
-------------------------------
package mapdemo;
import java.util.*;
import java.util.Map.*;

public class MapDemo 
{ 
    public static void main(String[] args) 
    {    
        HashMap<Integer,String> tm=new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        

        tm.put(4,"E");
        tm.put(5,"F");
        
        
        Entry<Integer,String> e=tm.firstEntry();
        
        System.out.println(e.getKey()+" "+e.getValue());
        
        System.out.println(tm);
        
    }  
}-------------------------
package hashdemo;

import java.util.*;

public class HashDemo 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,String> hm=new HashMap<>();
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();

        hm.put(5,"E");
        hm.put(1,"A");
        hm.put(4, "D");
        hm.put(2, "B");
        hm.put(3,"C");
        hm.put(6,"A");
        
        lhm.put(5,"E");
        lhm.put(1,"A");
        lhm.put(4,"D");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(6,"A");
        
        System.out.println(hm);
        String s=lhm.get(5);
        lhm.put(4,"K");
        lhm.get(1);
        System.out.println(lhm);
    }    
}----------------------------------------
package hashtabledemo;

import java.util.*;

public class HashTableDemo 
{
    public static void main(String[] args) 
    {
        Hashtable<Integer,String> ht=new Hashtable<>();
        
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");
        
        
        Enumeration e=ht.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        
        ht.computeIfAbsent(7, (k)->"Z"+k);

        System.out.println(ht);
        
        
    }   
}--------------------------

package linkedhashmapdemo;

import java.util.*;

public class LinkedHashMapDemo 
{
    public static void main(String[] args) 
    {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5){
            
            protected boolean removeEldestEntry(Map.Entry e)
            {
                return size()>5;
            }
        };
        
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        String s=lhm.get(2);
        s=lhm.get(5);
        s=lhm.get(1);
        lhm.put(6,"F");
        
        lhm.forEach((k,v)->System.out.println(k+" "+v));
        
    }   
}------------------------------
package linkedhashsetdemo;

import java.util.*;

public class LinkedHashSetDemo 
{
    public static void main(String[] args) 
    {
        HashSet<String> lhs=new HashSet<>(10);
        
        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");
        lhs.add("B");
        
        Iterator<String> itr=lhs.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        Hashtable ht=new Hashtable(10);
        
    }   
}--------------------------------










package sccollection1;

import java.io.*;
import java.util.*;

class Account implements Serializable
{
    String accno;
    String name;
    double balance;
    
    Account(){}
    
    Account(String a,String n,double b)
    {
        accno=a;
        name=n;
        balance=b;
    }
    
    public String toString()
    {
        return "Account No:"+accno+"\nName :"+name+"\nBalance :"+balance+"\n";
    }
}

public class SCCollection1 
{
   public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        
        Account acc=null;
        HashMap<String,Account> hm=new HashMap<>();
        

        try
        {
        FileInputStream fis=new FileInputStream("Accounts.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        
        int count=ois.readInt();
        for(int i=0;i<count;i++)
        {
            acc=(Account)ois.readObject();
            System.out.println(acc);
            hm.put(acc.accno,acc);
        }
        fis.close();
        ois.close();
        
        }
        catch(Exception e)
        {
            
        }
        
        
        
        FileOutputStream fos=new FileOutputStream("Accounts.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        System.out.println("Menu");
        
        int choice;
        String accno,name;
        double balance;
        
        do
        {
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View  All Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");            
            System.out.println("Enter your choice ");
            choice=sc.nextInt();
            
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            switch(choice)
            {
                case 1: System.out.println("Enter Details Accno, Name ,balance ");
                        accno=sc.nextLine();
                        name=sc.nextLine();
                        balance=sc.nextDouble();
                        acc=new Account(accno,name,balance);
                        hm.put(accno, acc);
                        System.out.println("Account Created for "+name);

                        break;
                case 2: System.out.println("Enter Accno");
                       
                        accno=sc.nextLine();
                        hm.remove(accno);
                        break;
                case 3: System.out.println("Enter Accno");
                        accno=sc.nextLine();
                        acc=hm.get(accno);
                        System.out.println(acc);
                        break;
                case 4:
                        for(Account a:hm.values())
                            System.out.println(a);
                        break;
                        
                case 5:
                case 6: oos.writeInt(hm.size());
                
                        for(Account a:hm.values()) 
                            oos.writeObject(a);
                        
            }
            
        }while(choice!=6);
        oos.flush();
        oos.close();

        fos.close();
    }   
}


    
===================================================

package comparatordemo;

import java.util.*;

class My implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        if(i1<i2)
            return 1;
        if(i1>i2)
            return -1;
        return 0;
    }
}

public class ComparatorDemo 
{
    public static void main(String[] args) 
    {
        Integer a[]={2,4,6,8,1,3,5,7};
        
        
        Arrays.sort(a);
        
       for(Integer x:a) 
            System.out.println(x);

    }   
}
-------------------------------// Java code to illustrate iterator()

import java.util.*;

public class GFG {

	public static void main(String[] args)
	{
		// Create and populate the list
		ArrayList<String> list
			= new ArrayList<>();

		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		list.add("is");
		list.add("a");
		list.add("CS");
		list.add("Students");
		list.add("Portal");

		// Displaying the list
		System.out.println("The list is: \n"
						+ list);

		// Create an iterator for the list
		// using iterator() method
		Iterator<String> iter
			= list.iterator();

		// Displaying the values after iterating
		// through the list
		System.out.println("\nThe iterator values"
						+ " of list are: ");
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
}
