import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Car_Rental
{
    int Car_ID;
    String line;
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
    void carid(){
        try { 
            BufferedReader reader = new BufferedReader( new FileReader("C:\\Users\\BAKHTAK\\Documents\\car\\cars.txt"));
            
            int i =1;
            while ((line =reader.readLine())!= null ) {
                int Car_ID;  
                Car_ID = 111*i;

            }
            
            reader.close(); 
         } catch (IOException e) {
            e.printStackTrace();
           }
        
    }
    void types_cars(){
        try { 
            BufferedReader reader = new BufferedReader( new FileReader("C:\\Users\\BAKHTAK\\Documents\\car\\cars.txt"));
            String line;
            int i =1;
            while ((line =reader.readLine())!= null ) {
                
                System.out.println(line);   
                Car_ID = 111*i;
                i++;

            }
            
            reader.close(); 
         } catch (IOException e) {
            e.printStackTrace();
           }
        
    }
    void customer_rent(){


    int cheque_no,model ;
    String name ,identity;
    Scanner scann = new Scanner(System.in);
    System.out.printf("What is your name  : ");
    name =scann.nextLine();
    System.out.printf("What is your identiy card  : ");
    identity =scann.nextLine();
    System.out.printf("What is the Car ID of the car  : ");
    model =scann.nextInt();

    Payment();
        
    //file entry////
     try { 
        BufferedWriter writer = new BufferedWriter( new FileWriter("C:\\Users\\BAKHTAK\\Documents\\car\\output.txt"));
        writer.write(""+name);  
        writer.write("  "+name); 
        writer.write("  "+identity);
        writer.write("  "+model);  
        writer.close(); 
        } catch (IOException e) {
        e.printStackTrace();
        }  
        System.out.printf("your car is ready for pickup.");
         
       


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
        System.out.printf("Thank you .Please come back\n");
        

      
    }
    class check extends Car_Rental  
    {
        void checkoption(){
            for (int i = 0; i < 30; i++) {
                
                Car_option();
                if(a==1){
                    customer_rent();
                }else if (a==2) {
                    customer_return();
        
                } else if(a==3){
                    types_cars();
                    Car_option();
                }else{
                    System.out.printf("invalid option");
                    Car_option();
                }
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
