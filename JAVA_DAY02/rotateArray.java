import java.util.Arrays;
// import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(arr, k);

        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handles k > array length

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}