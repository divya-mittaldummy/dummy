import java.util.Scanner;

public class BinarySearch {
    static int[] array = {3, 5, 6, 8, 9, 10, 14, 15};

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();

        //binarySearch(i, array.length);

    }

    public static void binarySearch(int element, int start, int end){
        if(element == array[end/2]){
            System.out.println("Found");
        }else if(element< array[end/2]){
            binarySearch(element, 0 , end/2 - 1);
        }else{
            binarySearch(element, end/2 + 1 , end);
        }
    }
}
