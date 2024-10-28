import java.util.Scanner;

public class ArrayComparison {
    private static final int SIZE = 3; // Constant for array size

    public static void main(String[] args) {
        // Initialize two 3x3 arrays
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] array1 = new int[SIZE][SIZE];
            int[][] array2 = new int[SIZE][SIZE];
            
            // Input for first array
            System.out.println("Enter 9 elements for the first array:");
            fillArray(scanner, array1);
            
            // Input for second array
            System.out.println("Enter 9 elements for the second array:");
            fillArray(scanner, array2);
            
            // Check if the arrays are identical
            if (areIdentical(array1, array2)) {
                System.out.println("The two arrays are identical.");
            } else {
                System.out.println("The two arrays are not identical.");
            }
        }
    }

    // Method to fill a 3x3 array with user input from a single line
    public static void fillArray(Scanner scanner, int[][] array) {
        String[] input = scanner.nextLine().trim().split("\\s+"); // Split input by spaces
        
        // Verifies if it received exactly 9 inputs
        if (input.length != SIZE * SIZE) {
            System.out.println("Error: Please enter exactly 9 integers.");
            System.exit(1);
        }
        
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // Parse the input and fill the array
                array[i][j] = Integer.parseInt(input[i * SIZE + j]);
            }
        }
    }

    // Method to check if two arrays are identical
    public static boolean areIdentical(int[][] array1, int[][] array2) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (array1[i][j] != array2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
