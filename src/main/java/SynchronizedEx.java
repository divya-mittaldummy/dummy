import com.sun.org.apache.xpath.internal.SourceTree;

public class SynchronizedEx {
    //lock on class -- static locking & lock on object -- this
    public static void main(String[] args) {
        SyncTask task = new SyncTask();
        /*StaticSyncTask sattictask = new StaticSyncTask();*/
        new Thread(task).start();
        new Thread(task).start();
        new Thread(new StaticSyncTask()).start();
        new Thread(new StaticSyncTask()).start();

    }
}

class StaticSyncTask implements Runnable{
    public void run(){
        synchronized (SyncTask.class) {
            System.out.println("Static Print....");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class SyncTask implements Runnable{
    public void run() {
        synchronized (this){
            System.out.println("Print....");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
