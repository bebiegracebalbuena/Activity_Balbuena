import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int capacity;
        char choices;
        boolean mainLoop = true;
        
        while (true) {
            System.out.println("===============================");
            System.out.println("===============================");
   
            System.out.println("Welcome Back User!!!\n");
            System.out.println("===============================");
     
            System.out.print("\nType to start: ");

            choices = scan.next().charAt(0);

        do {
            System.out.print("How many objects do you want to create?:");
            int objectnumber =scan.nextInt();      
            if(objectnumber > 0){

                   
                System.out.println("-------Create " + objectnumber + " objects-------");

                System.out.println("======Create the first object=====");
           
           

                    List <Person> persons = new ArrayList<Person>();
                    // Iterator<Person> ite = persons.iterator();
                
                    // String bebie = "";
                    // int numb = Integer.parseInt(bebie);

                    for (int i = 0; i<objectnumber; i ++){



                try{
                    
                    System.out.println(  i + " Input Name:");
                    scan.nextLine();
                    String name = scan.nextLine(); // Get the users name

                    System.out.println( i + " Input Age:");

                    int  age = scan.nextInt();  // Get the users age

                  
                
                    if (age < 0){
                        throw new newException("Invalid input for age! Negative is not allowed!");    
                    }
                    
                    Pattern pat= Pattern.compile("[!@-]");
                    Matcher matcher= pat.matcher(name);

                    if (matcher.find()){
                        throw new newException("Invalid Input! No special characters allowed! Please input a String with no spacial characters!");    
                    }

                    Person pers = new Person(name,age);
                    persons.add(pers);
                    

              
       
                }catch(newException e) {
                    System.out.println(e.getMessage());
                    }


                    }

                    int arrs = persons.size();
                    for(int b = 0; b < arrs ; b ++){
                    System.out.println("Name: " + persons.get(b).getName() + "Age: " + persons.get(b).getAge());
                        }
                 
             }else if(objectnumber < 0){

                    System.out.println("You can't create an object with negative input integer!");
                    System.out.println("===========================================");
             }
             
             System.out.println("Do You Want To Continue(Y/N)");
             choices = scan.next().charAt(0);
        } while (choices == 'Y' || choices == 'y');
      }
    }
}
    
    





    

    
