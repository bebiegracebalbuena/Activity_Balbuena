import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main{
    /**
     * @param args
     */
    public static void main(String[] args){
// String a []= {"Balbuena","Bebie","Grace","Jimuel","Ryan"};

Scanner scan = new Scanner(System.in);
System.out.println("How much object to create?: ");
int mychoice = scan.nextInt();

List<Person> person = new ArrayList<Person>();//use class data types

person.add(new Person("Bebie Grace Balbuena", 21));
person.add(new Person("Jimwil Balbuena", 14));
person.add(new Person("Ryan Dexter Balbuena", 16));
person.add(new Person("Chriscel Balbuena", 17));
person.add(new Person("John Roy Balbuena", 18));
person.add(new Person("Jeah Mea Balbuena", 24));
person.add(new Person("Randelle Balbuena", 27));
person.add(new Person("Charmine Fate Balbuena", 26));
person.add(new Person("Reymart Balbuena", 29));
person.add(new Person("Reymart Jr. Balbuena",9));
person.add(new Person("Angelica Baloca", 8));
person.add(new Person("Jessa Marie Saranillo", 6));
person.add(new Person("Princess Mara Ministerio", 10));
person.add(new Person("Kaila Marie Ministerio", 7));

System.out.println("_______________________________________________");
Iterator<Person> ite = person.iterator();

try{ 
    if(mychoice == 1){

        System.out.println("Input 1 for Name? Input 2 for age: ");
        int fobject = scan.nextInt();
        if(fobject == 1){
            System.out.println("+++++++++List of Names+++++++++");
            System.out.println("----------------------------");
            System.out.println("Name: "+ite.next().getName());
           
        }if(fobject == 2){
            System.out.println("+++++++++AGE List+++++++++");
            System.out.println("----------------------------");
            System.out.println("Age: "+ite.next().getAge());
        }else
            System.out.println("Invalid Input");
        }
    

    
   if(mychoice == 2){
    System.out.println("====Persons' Name and Age===");
    while(ite.hasNext()){
    System.out.println("Name: " + ite.next().getName() + "___" + "Age: " + ite.next().getAge());
    }

  }else{
     scan.close();
    throw new bebieNewException( );
  }
    }

catch(bebieNewException e){
    
   e.myError();//display error message
    }
    scan.close();
  }
}

    
  
    