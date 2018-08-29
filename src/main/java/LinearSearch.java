import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        int[] array = {2, 4, 3, 2, 2,2 ,2, 2,2, 2,2 };
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int index = 0;
        while (index < array.length){
            if(n == array[index]){

                System.out.println("Found");

                break;
            }
            index++;
        }

    }

}
