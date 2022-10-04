package Activity_Balbuena;
import java.util.Scanner;

public class Main_trycatch{
    /**
     * @param args
     */
    public static void main(String[] args){
String a []= {"Balbuena","Bebie","Grace","Jimuel","Ryan"};
Scanner scan = new Scanner(System.in);
System.out.println("Enter the Index: ");
int mychoice = scan.nextInt();

try{ 
    if(mychoice < 0 || mychoice > 4){
        scan.close();
        throw new NewException( );
    }else{
        System.out.println(a[mychoice]);
    }

}catch(NewException e){
   e.myError();//display error message
   scan.close();

    }
  }
}