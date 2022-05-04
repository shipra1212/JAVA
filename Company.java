//lab 6
// Nested static Class
//String class -- (immutable)
class Company {
    static final String org_name = "Vehicle management system ";   //----final keyword
    static String stateName = "punjab ";
    static String cityName = "bathinda";

    static class CompanyInner {
        void info() { 
            System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            System.out.printf("Company: "+org_name +"\n Location: "+stateName + cityName+"\n");
            System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");         
            System.out.println("About Us");
            //StringBuilder class
            StringBuilder Str = new StringBuilder();
            Str.append(" Know more about us!!!!    string buffer printed");
            System.out.println(Str);
            System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");  
        }
        //StringBuffer class
        void end()
        {
            StringBuffer strang = new StringBuffer("Drive Safely !! string builder printed.\n");
            strang.capacity();
            strang = strang.append(" Find all your favourite vehicles here !! ");
            System.out.println(strang);
            //System.out.println(strang.capacity());
        }

    }
    public static void main (String args[]){
        Company.CompanyInner obj= new Company.CompanyInner();
        obj.info();
        obj.end();
        String s1=new String ("CAR");
        s1.concat("DRIVE");
        String s2=s1.concat("SWIFT");
        s2.concat("DESIRE");
        //System.out.println(s1==s2);
        //System.out.println(s1.equals(s2));
        System.out.println(s1);
        System.out.println(s2);
    }
}


/*
heap              |     SCP (string constant pool)
------------------|---------------------------------
 CAR              |  CAR
CARDRIVE  (GC)    |  DRIVE
CARSWIFT          |  SWIFT
CARSWIFTDESIRE(gc)|  DESIRE
                  |
*/