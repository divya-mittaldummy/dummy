import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        AService aService = new CountDownLatchEx().new AService(countDownLatch);
        BService bService = new CountDownLatchEx().new BService(countDownLatch);

        Thread t1 = new Thread(aService);
        Thread t2 = new Thread(bService);
        t1.start();
        t2.start();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count down ........................ completed.. All services up.");
    }

    class AService implements Runnable{
        CountDownLatch countDownLatch;

        AService(CountDownLatch countDownLatch){
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run(){
            System.out.println("In Service A..");
            try {
                Thread.sleep(10000);
                countDownLatch.countDown();
            }catch (Exception e){

            }

        }
    }

    class BService implements Runnable{

        CountDownLatch countDownLatch;

        BService(CountDownLatch countDownLatch){
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run(){
            System.out.println("In service B....");
            try {
                Thread.sleep(2000);
                countDownLatch.countDown();
            }catch (Exception e){

            }
        }
    }
}
