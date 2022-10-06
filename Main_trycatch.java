package Activity_Balbuena;
import java.util.Scanner;

public class Main_trycatch{
    /**
     * @param args
     */
    public static void main(String[] args){
String a []= {"Balbuena","Bebie","Grace","Jimuel","Ryan"};
Scanner scan = new Scanner(System.in);
System.out.println("Enter an Index number: ");
int mychoice = scan.nextInt();



try{ 
    if(mychoice < 0 || mychoice > 4){
        scan.close();
        throw new myNewException( );
    }else{
        System.out.println(a[mychoice]);
    }

}catch(myNewException e){
   e.myError();//display error message
    }
    scan.close();
  }
}