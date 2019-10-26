import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args){
        int[] array = createArray();
        int[] array2 = createArray();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(sumArray(array, array2)));
    }
    public static int[] createArray(){
        Random random = new Random();
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = random.nextInt(100);
        }
        return arr1;
    }
    public static int[] sumArray(int[] array, int[] array2){
        int[] sum = new int[array.length];
        for (int x = 0; x < array.length; x++) {
            sum[x] = array[x] + array2[x];
        }
        return sum;
    }


}


