import java.util.Scanner;

public class ReadConsole {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter any positive integer number or enter quit to exit the program: ");
            Integer input = scanner.nextInt();

            if ("quit".equals(input)) {
                System.out.println("Exit!");
                break;
            } else if (input == null) throw new NullPointerException("You did not enter anything!");
            if (input < 0) {
                System.out.println("You entered a negative number, try again.");
                break;}


                System.out.println("input : " + input);
                System.out.println("-----------\n");

            scanner.close();}
