import com.sun.org.apache.xpath.internal.SourceTree;

public class OddEven {
    public static void main(String[] args) {
        Integer i = 10;
        Odd odd = new Odd(i);
        Even even =  new Even(i);
        new Thread(odd).start();
        new Thread(even).start();

    }
}

class Odd implements Runnable{

    Integer i;

    Odd(Integer i){
        this.i = i;
    }

    public void run() {
        synchronized(i)
        {
            while(i  < 30){
                if(i%2 == 0){
                    try {
                        i.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(i++);
                i.notifyAll();
            }
        }
    }
}

class Even implements  Runnable{

    Integer i;

    Even(Integer i){
        this.i = i;
    }

    public void run() {
        synchronized(i)
        {
            while(i  < 30){
                if(i%2 != 0){
                    try {
                        i.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd" + i++);
                i.notifyAll();
            }
        }
    }
}