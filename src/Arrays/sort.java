package Arrays;
import java.util.Scanner;

public class sort {
    int[] arr; 

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        arr = new int[size];

        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
     // boolean function to check if array is sorted or not.
    boolean sorted() {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        sort ar = new sort();
        ar.input();

        if (ar.sorted()) {
            System.out.println("Array is sorted in non-decreasing order.");
        } else {
            System.out.println("Array is NOT sorted.");
        }
    }
}
