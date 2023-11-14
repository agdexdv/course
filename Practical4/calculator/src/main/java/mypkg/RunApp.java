package mypkg;
import java.util.Scanner;
public class RunApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the first number: ");
            int number1;
            number1 = scanner.nextInt();
            
            System.out.println("Please enter the operator: ");
            char operator = scanner.next().charAt(0);

            System.out.println("Please enter the second number: ");
            int number2;
            number2 = scanner.nextInt();
            
            int result = 0;
            switch (operator) {
                case '+':
                    result = calculator.add(number1, number2);
                    break;
                case '-':
                    result = calculator.subtract(number1, number2);
                    break;
                case '*':
                    result = calculator.multiple(number1, number2);
                default:
                    System.out.println("Invalid input!");
            }
            System.out.println("The result of the selected operation is " + result);
            System.out.println("If you want to quit please enter 'q' or 'Q': ");
            if (scanner.next().equalsIgnoreCase("q") || scanner.next().equalsIgnoreCase("Q")) {  
                break;
            }
        }
    }
}