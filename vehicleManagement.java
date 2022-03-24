//Shipra Jha 

//VEHICLE SERVICE MANAGEMENT SYSTEM

class Customer{
    int Cid;
    String Cname;
    String Cmobile;
    String Caddress;
    String Cemail;
    String Cpassword;
    String Cusername;

    void getCustomerDetails();
    void newCustomer();
    void regularCustomer();
    void displayCustomerDetails();
    void resetCustomerPassword();
}
class Vehicle{
    int vehicle_id;
    String vehicle_number;
    String vehicle_type;
    String vehicle_category;
    String vehicle_description;
    String vehicle_owner_id;

    void getVehicleDetails();
    void bestSellingVehicles();
    void displayVehicleDetails();
}
class Booking{
    int Bid;
    String Bname;
    String Btype;
    String Bdescription;
    String Btitle;
    String Bticket;
    Date Bdate;

    void BookVehicle();
    void BookingStatus();
    void getBookingDate();
    void searchBookingDate();
    void generateBookingReceipt();
}
class User{
    int Uid;
    int User_role_id;
    String Uname;
    String Umobile;
    String Uaddress;
    String Uemail;
    Date Udob;

    void getUserDetails();
    void modifyUserDetails();
    void resetUser();
}
class Payment{
    int payment_Id;
    String payment_Bill;
    String payment_Type;
    String payment_description;
    Date payment_Date;
    int payment_Customer_Id;

    void getPaymentDetails();
    void getPaymentStatus();
    
}
class Permission{
    int p_id;
    int p_role_id;
    String p_title;
    String p_module;
    String p_description;

    void getPermission();
    void getPermissionStatus();
    void removePermission();
}
class Repair{
    int repair_id;
    String repair_number;
    String repair_description;
    String repair_type;
    String repair_bill;
    int repair_customer_id;

    void getRepairStatus();
    void deleteCustomer();
    void fullRepairPackage();
    void discountOnRepair();
}
class Role{
    int role_id;
    String role_title;
    String role_description;

    void assignRole();
    void displayRole();
    void changeRole();
}
class complain{
    int complain_id;
    String compalin_description;
    String complain_date;
    String complain_topic;

    void getComplainDetails();
    void displayComplain();
    void newComplain();

}
class feedback{
    int feedback_id;
    String feedback_description;
    String feedback_date;
    String feedback_topic;

    void getFeedbackDetails();
    void displayFeedback();
    void newFeedback();
}