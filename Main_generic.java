import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main_generic {
    public static void main(String[] args){

        List<Person> person = new ArrayList<Person>();//use class data types

        System.out.println("My Siblings");
        System.out.println("_______________________________");
        person.add(new Person("Bebie Grace Balbuena", 21)); //initialize new person
        person.add(new Person("Jimwil Balbuena", 14));
        person.add(new Person("Ryan Dexter Balbuena", 16));
        person.add(new Person("Chriscel Balbuena", 17));
        person.add(new Person("John Roy Balbuena", 18));
        person.add(new Person("Jeah Mea Balbuena", 24));
        person.add(new Person("Randelle Balbuena", 27));
        person.add(new Person("Charmine Fate Balbuena", 26));
        person.add(new Person("Reymart Balbuena", 29));
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("My Cute Pamangkins");
        System.out.println("_______________________________");
        person.add(new Person("Reymart Jr. Balbuena",9));
        person.add(new Person("Angelica Baloca", 8));
        person.add(new Person("Jessa Marie Saranillo", 6));
        person.add(new Person("Princess Mara Ministerio", 8));
        person.add(new Person("Kaila Marie Ministerio", 6));
       

       Iterator<Person> ite = person.iterator();

       while(ite.hasNext()){
        System.out.println("Hello my name is "+ ite.next().getName() + " and I am " + ite.next().getAge() + " years old.");
       }
    }
}
