package methodexample;

public class MethodExample {
	
	// Method with no parameters and no return value
    public static void displayMessage() {
        System.out.println("Hello, this is a simple method!");
    }

    // Method with parameters and return value
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method with variable number of arguments (varargs)
    public static int sumAll(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Method with default parameter values (Java 8 and later)
    public static void printMessage(String message, boolean uppercase) {
        if (uppercase) {
            message = message.toUpperCase();
        }
        System.out.println(message);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Calling a method with no parameters and no return value
        displayMessage();

        // Calling a method with parameters and return value
        int result = addNumbers(5, 7);
        System.out.println("Sum of numbers: " + result);

        // Calling a method with variable number of arguments (varargs)
        int sumVarargs = sumAll(1, 2, 3, 4, 5);
        System.out.println("Sum of all numbers (varargs): " + sumVarargs);

        // Calling a method with default parameter values
        printMessage("Hello, world!", false);
        printMessage("Hello, world!", true);

	}

}
