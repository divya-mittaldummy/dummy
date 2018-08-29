import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new Thread(new Task(semaphore)).start();
        new Thread(new Task(semaphore)).start();
    }

}

class Task implements  Runnable{
    Semaphore semaphore;

    Task(Semaphore semaphore){
        this.semaphore = semaphore;
    }

    public void run(){
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello.. lock acquired");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semaphore.release();

    }
}