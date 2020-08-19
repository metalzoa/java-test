package future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/*
FutureTask는 비동기 작업을 생성합니다.
지금까지 위의 코드는 비동기 작업 생성과 실행을 동시에 했다면
FutureTask는 비동기 작업 생성과 실행을 분리하여 진행할 수 있습니다.
 */
public class FutureEx03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();

        FutureTask<String> f = new FutureTask<>(() -> {
            Thread.sleep(2000);
            System.out.println("Async");
            return "Hello";
        });

        es.execute(f);

        System.out.println(String.valueOf(f.isDone()));
        Thread.sleep(2000);
        System.out.println("Exit");
        System.out.println(String.valueOf(f.isDone()));
        System.out.println(f.get());
    }
}
