package executorsvc;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorServiceTest {

    public static void main(String[] args){
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            System.out.println("Async");
        });

        System.out.println("Exit");


    }

}
