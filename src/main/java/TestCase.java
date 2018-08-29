public class TestCase {

    public static void main(String[] args) {
        TestCaseThread t1 = new TestCaseThread();
        TestCaseThread t2 = new TestCaseThread();
        Thread t11 = new Thread(t1);
        Thread t22 = new Thread(t2);
        t11.start();
        t22.start();
    }


}

class TestCaseThread implements Runnable{

    public void run(){
        for(int i = 0; i < 100 ; i++)
        System.out.println("In thread class " + i);
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }
}

