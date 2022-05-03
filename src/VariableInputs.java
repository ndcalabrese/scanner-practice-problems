import java.util.Scanner;

public class VariableInputs {

    public static void main(String[] args) {

        // Instantiate scanner that receives input
        Scanner scanner = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter a string of text: ");

        // Store user input
        String inputString = scanner.nextLine();

        System.out.print("Enter an integer: ");

        // Store user input as an integer
        int inputInteger = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter a double: ");

        double inputDouble = Double.valueOf(scanner.nextLine());

        System.out.print("Enter a boolean: ");

        boolean inputBoolean = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is " + inputString);
        System.out.println("Your integer is " + inputInteger);
        System.out.println("Your double is " + inputDouble);
        System.out.println("Your boolean is " + inputBoolean);
    }

}
