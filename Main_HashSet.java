import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main_HashSet {

    public static void main(String[] args) {

        boolean mainLoop = true;

        int choice;

        int num;

        Scanner scan = new Scanner(System.in);
        char choices;
        Set<Integer> numArray = new HashSet<Integer>();
        numArray.add(15);
        numArray.add(22);
        numArray.add(30);
        numArray.add(40);
        numArray.add(10);

        while (true) {
            System.out.println("Calculator Main Menu\n");
            System.out.print("1.) Add\n");
            System.out.print("2.) Remove\n");
            System.out.print("3.) Display\n");
            System.out.print("4.) Clear\n");
            System.out.print("5.) Exit\n");
            System.out.print("\nEnter Your Menu Choice: ");

            choice = scan.nextInt();
            switch (choice) {

                case 1:
                    // add to the list
                    // displayed added numbers on the list
                    // Allow Return/exit
                    // can't add existing number/integer

                    do {
                        System.out.print("Enter integer you want to add:");

                        num = scan.nextInt();
                        boolean check = numArray.add(num);

                        if (!check) {
                            System.out.println("=========================================");
                            System.out.println("The Entered number is already Exist! Please choose another number!");

                        }

                        else {

                            System.out.println(num + " is added and displayed on the List");
                            for (int i = 0; i < 1; i++) {
                                numArray.add(num);
                                for (Integer numbers : numArray) {
                                    System.out.println("Number = " + numbers);
                                }
                            }
                        }

                        System.out.println("Do You Want To Continue( Y/ N(Return exit) )");
                        choices = scan.next().charAt(0);
                    } while (choices == 'Y' || choices == 'y');

                    break;

                case 2:
                    System.out.println("Number Lists");
                    System.out.println("=================");
                    for (int i = 0; i < 1; i++) {

                        for (Integer number : numArray) {
                            System.out.println("Number = " + number);
                        }
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
                    // clear the list
                    System.out.println("Number Lists");
                    System.out.println("=================");
                    for (int i = 0; i < 1; i++) {

                        for (Integer number : numArray) {
                            System.out.println("Number = " + number);
                        }
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
