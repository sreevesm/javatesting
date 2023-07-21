package bootcamp.testing.pack;
import java.util.Scanner;

public class JavaTesting {

    public static void main(String[] args) {
        String firstName = "mathilde";
        String lastName = "sreeves";

        System.out.println(firstName + " " + lastName);

        double num1 = 2;
        double num2 = 3;

        System.out.println(num1 + num2);

        double result = num1 / num2;
        System.out.println(result);

        int num3 = 8;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first name:");

        String first = myObj.nextLine();  // Read user input
        System.out.println("Enter last name:");

        String last = myObj.nextLine();  // Read user input

        System.out.println("Hi " + first + " " + last + "!");

        System.out.println("enter two numbers: ");

        int a = Integer.parseInt(myObj.nextLine());  // Read user input
        int b = Integer.parseInt(myObj.nextLine());  // Read user input

        System.out.print(a+b);
    }
}

