import java.util.concurrent.ExecutorService;

public class WaitNotifyEx {
    public static void main(String[] args) {

        Runnable printOddTask = () -> {
            synchronized (WaitNotifyEx.class) {
                for (int i = 0; i <= 20; i = i + 2) {
                    System.out.println("Print odd." + i);
                    //notify
                }
            }
        };

        Runnable printEvenTask = () -> {
            for(int i=1; i <20; i = i + 2) {
                System.out.println("Print even.." + i);
            }
        };

        new Thread(printEvenTask).start();
        new Thread(printOddTask).start();
    }

    /*class PrintOdd implements Runnable{
        public
    }*/

    class PrintEven{

    }
}
