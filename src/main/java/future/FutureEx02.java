package future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/* 한글 */
public class FutureEx02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();

        Future<String> f = es.submit(() -> {
            Thread.sleep(2000);
            System.out.println("Async");
            return "Hello";
        });

        System.out.println(String.valueOf(f.isDone()));
        Thread.sleep(3000);
        System.out.println("Exit");
        System.out.println(String.valueOf(f.isDone()));
        System.out.println(f.get());
    }
}
