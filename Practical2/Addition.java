import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = input.nextInt();
        System.out.print("Enter the ending number: ");
        int end = input.nextInt();
        
        if (end >= start) {
            int sum = 0;  
        for (int i = start; i <= end; i++) {  
            sum += i;
        }
        System.out.println("The sum of all integers from " + start + " to " + end + " is: " + sum);
        } else {
            System.out.println("Error: The starting number is larger or equal to the ending number!");
        }
    }
}