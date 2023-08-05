import java.util.Arrays;

public class RecursiveCount {
    
    public static int count(int[] list){
        if (list.length == 0){
            return 0;
        }
        
        return 1 + count(Arrays.copyOfRange(list, 1, list.length));
    }
}
