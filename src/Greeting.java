// Import Scanner class
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {

        // Instantiate scanner that receives input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");

        // Set name equal to next input line
        String name = scanner.nextLine();

        System.out.println("Hi " + name);

    }

}
