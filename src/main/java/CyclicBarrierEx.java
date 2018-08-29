import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierEx {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable(){
            @Override
            public void run(){
                System.out.println("Cyclic Barrier completed..");
            }
        });

        AService aService = new CyclicBarrierEx().new AService(cyclicBarrier);
        BService bService = new CyclicBarrierEx().new BService(cyclicBarrier);
        Thread t1 = new Thread(aService);
        Thread t2  = new Thread(bService);
        Thread t3 = new Thread(aService);
        Thread t4 = new Thread(aService);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }

    class AService implements Runnable{
        CyclicBarrier cyclicBarrier;

        AService(CyclicBarrier cyclicBarrier){
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run(){
            System.out.println("Cyclic Barrier party A.." + cyclicBarrier.getParties());
            try {
                Thread.sleep(10000);
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    class BService implements Runnable{
        CyclicBarrier cyclicBarrier;

        BService(CyclicBarrier cyclicBarrier){
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run(){
            System.out.println("Cyclic Barrier party A.." + cyclicBarrier.getParties());
            try {
                Thread.sleep(10000);
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
