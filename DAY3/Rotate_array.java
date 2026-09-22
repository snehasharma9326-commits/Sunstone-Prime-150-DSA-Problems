import java.util.Arrays;

public class Main {

    static void rotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;

        // Reverse entire array
        reverse(arr, 0, n - 1);

        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotate(arr, k);

        System.out.println(Arrays.toString(arr));
    }
}