import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Car_Rental
{
    int a;
    void Payment(){
        int cheque_no;
        Scanner scan =new Scanner(System.in);
        System.out.printf("What is the cheque number  =   ");
        cheque_no =scan.nextInt();
        int cheque;
    }

    void Car_option(){

        System.out.printf("                                      CHOOSE AN OPTION          \n"); 
        
        System.out.printf("1.) Rent a car.    \n");
        System.out.printf("2.) Return the car.    \n");
        System.out.printf("3.) Types of cars available.   \n");
        Scanner option = new Scanner(System.in);
        a =option.nextInt();



    }
    void customer_rent(){

        int cheque_no ;
        String name ,identity,model;
        Scanner scann = new Scanner(System.in);
        System.out.printf("What is your name  : ");
        name =scann.nextLine();
        System.out.printf("What is your identiy card  : ");
        identity =scann.nextLine();
        System.out.printf("What is the model of the car  : ");
        model =scann.nextLine();
        Payment();
        //file entry////
         try { 
            BufferedWriter writer = new BufferedWriter( new FileWriter("C:\\Users\\BAKHTAK\\Documents\\Z\\output.txt"));
            writer.write(""+name);  
            writer.write("  "+name); 
            writer.write("  "+identity);
            writer.write("  "+model);  
            writer.close(); 
         } catch (IOException e) {
            e.printStackTrace();
           }  
        System.out.printf("your car is no 345 . Return after you are done using.");

       


    }
    void customer_return(){
        
        String name ,identity,model;
        Scanner scann = new Scanner(System.in);
        System.out.printf("What is your name  : ");
        name =scann.nextLine();
        System.out.printf("What is your identiy card  : ");
        identity =scann.nextLine();
        System.out.printf("What is the model of the car you are returning  : ");
        model =scann.nextLine();
        System.out.printf("Thank you .Please come back");
        

      
    }
    class check extends Car_Rental  
    {
        void checkoption(){
            Car_option();
            if(a==1){
                customer_rent();
            }else if (a==2) {
                customer_return();
    
             } else {
                System.out.printf("invalid option");
                Car_option();
            }
    
        }
    }
    

   
   
       public static void main(String args[])
{
    Car_Rental rent =new Car_Rental();
    
    Car_Rental.check v = rent.new check();
    v.checkoption();

 
 
 
 
}




}