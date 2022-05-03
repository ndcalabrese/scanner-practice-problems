import java.util.Scanner;

public class HelloThere {

    public static void main(String[] args) {

        // Instantiate scanner that receives input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there! How are you doing today?");

        // Prints user input
        scanner.nextLine();

        System.out.println("Wow - Interesting! Tell me more!");

        // Prints user input
        scanner.nextLine();

        System.out.println("Nice chatting with you! Goodbye!");

    }

}