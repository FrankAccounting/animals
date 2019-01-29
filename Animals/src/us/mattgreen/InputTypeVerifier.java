package us.mattgreen;
import java.util.Scanner;

public class InputTypeVerifier {

    private int number = Integer.MAX_VALUE; //This value will never change
    private int age = Integer.MAX_VALUE; //This value will never change

    Scanner scanner = new Scanner(System.in);


    public int Number() {
        while (number == Integer.MAX_VALUE) {
            System.out.println("Enter a number: ");
            String numberString = scanner.nextLine();
            try {
                number = Integer.parseInt(numberString);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return number;
    }
    public int Age() {
        while (age == Integer.MAX_VALUE) {
            System.out.println("Enter age: ");
            String ageString = scanner.nextLine();
            try {
                age = Integer.parseInt(ageString);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return age;
    }
}



