package ji;
import java.util.Arrays;

public class PASET8 {
    public double mean(int[] arr) {
        int sum = 0;
        int i = 0;
        for (; i < arr.length; i++){
            sum += arr[i];
        }
        return (double)(sum)/i;
    }

    public int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = (min>arr[i])? arr[i] : min;
        }
        return min;
    }

    public int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = (max<arr[i])? arr[i] : max;
        }
        return max;
    }

    public int range(int[] arr) {
        return max(arr) - min(arr);
    }

    public int mode(int[] arr) {
        int mode = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 1;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] == arr[i]) {
                    count++;
                }
            }
            if (count > max) {
                mode = arr[i];
                max = count;
            }
        }
        return mode;
    }

    public int[] sort(int[] asd) {
        int[] sorted = asd.clone();
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i+1; j < sorted.length; j++) {
                if ( (sorted[i] > sorted[j]) && (i != j) ) {
                    int temp = sorted[j];
                    sorted[j] = sorted[i];
                    sorted[i] = temp;
                }
            }
        }
        return sorted;
    }

    public double median(int[] arr) {
        arr = sort(arr);
        return (arr.length % 2 == 0)? (arr[arr.length/2 - 1] + arr[arr.length/2])/2.0 : (double) arr[arr.length/2];
    }

    public double iqr(int[] arr) {
        arr = sort(arr);
        int[] arr1 = Arrays.copyOfRange(arr, 0, arr.length/2);
        int[] arr2 = Arrays.copyOfRange(arr, arr.length/2, arr.length);
        return median(arr2) - median(arr1);
        
    }
}