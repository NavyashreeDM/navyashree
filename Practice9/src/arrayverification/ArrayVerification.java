package arrayverification;

public class ArrayVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Verifying array size and elements
        System.out.println("Array size: " + numbers.length);
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        // Modifying an element in the array
        numbers[2] = 10;

        // Verifying the modification
        System.out.println("Updated element at index 2: " + numbers[2]);

        // Summing up all elements in the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);

	}

}
