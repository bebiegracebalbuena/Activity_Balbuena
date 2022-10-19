
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Main_HashMap {

    /**
     * @param args
     */
    public static void main(String[] args) {

        boolean mainLoop = true;

        int choice;

        int num;

        Scanner scan = new Scanner(System.in);
        char choices;
        Map<Integer, Integer> numArray = new HashMap<Integer, Integer>();
        // HashMap<Integer, Integer> numArray = new HashMap<>();

        numArray.put(0, 15);
        numArray.put(1, 22);
        numArray.put(2, 30);
        numArray.put(3, 40);
        numArray.put(4, 10);

        while (true) {
            System.out.println("Main Menu\n");
            System.out.print("1.) Add\n");
            System.out.print("2.) Remove\n");
            System.out.print("3.) Display\n");
            System.out.print("4.) Clear\n");
            System.out.print("5.) Exit\n");
            System.out.print("\nEnter Your Menu Choice: ");

            choice = scan.nextInt();
            Iterator it = numArray.entrySet().iterator();

            switch (choice) {

                case 1:
                    // add to the list
                    // displayed added numbers on the list
                    // Allow Return/exit
                    // won't add prime number
                    do {

                        for (int i = 0; i < 1; i++) {
                            int numb, count = 0;

                            System.out.print("Enter Key integer you want to add:");
                            Integer a = scan.nextInt();

                            for (int p = 2; p <= (a / 2); p++) {
                                if ((a % p) == 0) {
                                    count++;
                                    break;
                                }
                            }

                            if ((count == 0) && (a != 1)) {
                                System.out.println(
                                        a + " is a prime number! Prime number is not allowed find another number!");
                                System.out.print("Enter Key integer you want to add:");
                                a = scan.nextInt();
                            } else {
                                System.out.println(a + " key is added to the list");
                                System.out.println("=============================================");
                            }
                            System.out.print("Enter integer value you want to add:");
                            Integer b = scan.nextInt();

                            for (int p = 2; p <= (b / 2); p++) {
                                if ((b % p) == 0) {
                                    count++;
                                    break;
                                }
                            }

                            if ((count == 0) && (b != 1)) {
                                System.out.println(
                                        b + " is a prime number! Prime number is not allowed find another number!");
                                System.out.print("Enter integer value you want to add:");
                                b = scan.nextInt();
                            } else {
                                System.out.println(b + " value is added to the list");
                                System.out.println("=============================================");
                            }

                            numArray.put(a, b);

                        }

                        for (Entry<Integer, Integer> m : numArray.entrySet()) {
                            System.out.println(m.getKey() + " " + m.getValue());
                        }

                        System.out.println("Do You Want To Continue( Y/ N(Return exit) )");
                        choices = scan.next().charAt(0);
                    } while (choices == 'Y' || choices == 'y');

                    break;

                case 2:
                        
                    System.out.println("Number Lists");
                    System.out.println("=================");
                    for (int i = 0; i < 1; i++) {

                        System.out.println("Number = " + numArray);
                    }

                    do {
                        System.out.print("Enter Index number you want to remove: ");
                        int i = scan.nextInt();

                        if (i >= 0 && i < numArray.size()) {
                            System.out.print(" Index Number " + i + " Successfully REMOVED!\n");
                            numArray.remove(i);
                            System.out.println(numArray);
                        } else {
                            System.out.print("Invalid Index! Try to check the maximum number of Index. \n");
                        }

                        System.out.println("Do You Want To Continue(Y/N)");
                        choice = scan.next().charAt(0);
                    } while (choice == 'Y' || choice == 'y');

                    break;

                case 3:

                    do {
                        // Display number list

                        System.out.println(numArray.toString());

                        System.out.println("Do You Want To Continue( Y/ N(Return exit) )");
                        choices = scan.next().charAt(0);
                    } while (choices == 'Y' || choices == 'y');

                    break;

                case 4:
                    System.out.println("Number Lists");
                    System.out.println("=================");
                    for (int i = 0; i < 1; i++) {

                        System.out.println("Number = " + numArray);

                    }

                    do {
                        System.out.print(" Type 1 to Clear number  List?: ");
                        int i = scan.nextInt();
                        int a = 1;

                        if (i == a) {
                            System.out.print(" Successfully REMOVED/ clear all in the list!\n");
                            numArray.clear();
                            System.out.println("Empty list");
                        } else {
                            System.out.print("Unable to clear the list!\n");

                        }
                        System.out.println("Type to exit..: )");

                        choices = scan.next().charAt(0);
                    } while (choice == 'Y' || choice == 'y');
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("This is not a valid Menu Option! Please Select Another");
                    break;

            }

        }

    }

}
