import java.util.Arrays;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        int[] arr = { 12, 22, 34, 22, 54, 6, 52, 8, 9, 34, 54, 68, 10, 20, 30 };
        
        int[] oddArray = new int[arr.length];
        int[] evenArray = new int[arr.length];
        
        segregateEvenOdd(arr, oddArray, evenArray);
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Odd Array: " + Arrays.toString(trimArray(oddArray)));
        System.out.println("Even Array: " + Arrays.toString(trimArray(evenArray)));
    }
    
    static void segregateEvenOdd(int[] arr, int[] odd, int[] even) {
        int oddCount = 0;
        int evenCount = 0;
        
        for (int num : arr) {
            if (num % 2 == 0) {
                even[evenCount++] = num;
            } else {
                odd[oddCount++] = num;
            }
        }
    }
    
    static int[] trimArray(int[] arr) {
        return Arrays.copyOf(arr, countNonZeroElements(arr));
    }
    
    static int countNonZeroElements(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num != 0) {
                count++;
            }
        }
        return count;
    }
}
