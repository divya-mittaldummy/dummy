import java.util.PriorityQueue;
import java.util.Queue;

public class ProducerConsumer {
    public static void main(String[] args) {

        Queue<Integer> sharedQueue = new PriorityQueue<Integer>();

        Producer producer = new Producer(sharedQueue, 5);
        Consumer consumer = new Consumer(sharedQueue, 5);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();


    }
}


class Producer implements Runnable{
    Queue<Integer> sharedQueue;
    int size;

    Producer(Queue<Integer> sharedQueue, int size){
        this.sharedQueue = sharedQueue;
        this.size = size;
    }

    public void run(){
        for(int i=0; i < 10; i++){
            synchronized (sharedQueue) {
                while (sharedQueue.size() == size) {
                    try {
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                sharedQueue.add(i);
                sharedQueue.notifyAll();
            }
        }
    }
}

class Consumer implements Runnable{
    Queue<Integer> sharedQueue;
    int size;

    Consumer(Queue<Integer> sharedQueue, int size){
        this.sharedQueue = sharedQueue;
        this.size = size;
    }

    public void run(){
        for(int i=0; i < 10; i++){
            synchronized (sharedQueue) {
                while (sharedQueue.size() == 0) {
                    try {
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(sharedQueue.remove());
                sharedQueue.notifyAll();
            }
        }
    }
}