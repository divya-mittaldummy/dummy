import java.util.Arrays;

public class BinarySort {
    public static void main(String[] args) {
        int[] array = {5, 1, 7, 3, 2, 9, 4};
        int min = -1;
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j <= array.length -1 ; j++){
               if(array[j] < array[i]){
                   int temp = array[j];
                   array[j] = array[i];
                   array[i]  = temp;
               }
            }

        }
        Arrays.stream(array).forEach(a -> System.out.println(a));
    }
}
