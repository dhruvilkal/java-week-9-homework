package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Calculator calculator =new Calculator();
        char choice;

        do {
            System.out.println("Enter first Number:");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter second Number:");
            int secondNumber = scanner.nextInt();
            System.out.println("Please enter one of symbol + , - , * , /:");
            char symbol = scanner.next().charAt(0);



            System.out.println("Would you like to do more calculation ?  Please enter 'Y' or 'N': ");
            choice =scanner.next().charAt(0);
        }while (choice == 'Y' || choice == 'y');
        System.out.println("Programme terminated. ");
    }
}
