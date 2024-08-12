import java.util.Scanner;

public class CalC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nAdvanced Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performOperation(scanner, "add");
                    break;

                case 2:
                    performOperation(scanner, "subtract");
                    break;

                case 3:
                    performOperation(scanner, "multiply");
                    break;

                case 4:
                    performOperation(scanner, "divide");
                    break;

                case 5:
                    performSingleOperandOperation(scanner, "square root");
                    break;

                case 6:
                    performPowerOperation(scanner);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static void performOperation(Scanner scanner, String operation) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = 0;

        switch (operation) {
            case "add":
                result = num1 + num2;
                break;

            case "subtract":
                result = num1 - num2;
                break;

            case "multiply":
                result = num1 * num2;
                break;

            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
        }

        System.out.println("Result: " + result);
    }

    private static void performSingleOperandOperation(Scanner scanner, String operation) {
        System.out.print("Enter number: ");
        double num = scanner.nextDouble();

        if (operation.equals("square root")) {
            if (num >= 0) {
                System.out.println("Square Root: " + Math.sqrt(num));
            } else {
                System.out.println("Error: Cannot compute square root of a negative number.");
            }
        }
    }

    private static void performPowerOperation(Scanner scanner) {
        System.out.print("Enter base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();

        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }
}
