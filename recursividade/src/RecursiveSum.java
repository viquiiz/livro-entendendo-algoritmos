import java.util.Arrays;

public class RecursiveSum {

    public static int sum(int[] arr){
        if (arr.length == 0) {
            return 0;
        } else {
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }
}