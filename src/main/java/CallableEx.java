import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CallableEx {
    public static void main(String[] args) {
        //CallableThread ct = new CallableThread();

        Executor executor = Executors.newFixedThreadPool(3);

        /*executor.execute(

        );*/

    }

    class CallableThread implements Callable<Integer>{
        public Integer call(){
            System.out.println("Callng threaddd...");
            return 1;
        }
    }
}
