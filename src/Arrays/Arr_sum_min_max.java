package Arrays;

import java.util.Scanner;

public class Arr_sum_min_max{
        public static void main(String[] args) {
            int sum = 0;
            int arr[] = new int[5];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array elements");
            for (int i = 0; i < arr.length; i++) {  // taking array input from the user
                arr[i] = sc.nextInt();
            }
            System.out.println("The inputted array from the user is: ");
            for (int i = 0; i < arr.length; i++) {// displaying array output
                System.out.println(arr[i] + " ");
            }
            //  System.out.println("The inputted array from the user is : ");
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i]; // printing the sum of all the array elements.
            }
            System.out.println("The total sum of the array elemnts is :" + sum);

            int max = arr[0]; // consider 1st element as max and then compare with the rest of the elements.
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {        // finding the maximum element of the inputted array.
                    max = arr[i];
                }
            }
            System.out.println("The maximum element of the array is :" + max); // print maximum element.

            int min = arr[0]; // conside the first element as minimum and then compare with the rest of the elements.
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {        // finding the minimum element of the inputted array.
                    min = arr[i];
                }
            }
            System.out.println("The minimum element of the array is :" + min); // print minimum element.

            // printing the inputted array in reverse order.
            System.out.println("The array in reverse order is printed below : ");
            for (int i = 4; i >=0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }

