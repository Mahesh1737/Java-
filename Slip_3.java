import java.util.Scanner;

public class luffy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int n = scanner.nextInt();

        // Create an array to store city names
        String[] cities = new String[n];

        // Read city names from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter city name " + (i + 1) + ": ");
            cities[i] = scanner.next();
        }

        // Sort the city names using Bubble Sort
        bubbleSort(cities);

        System.out.println("Cities sorted in ascending order:");

        // Display the sorted city names
        for (String city : cities) {
            System.out.println(city);
        }
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    // Swap arr[i-1] and arr[i]
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
