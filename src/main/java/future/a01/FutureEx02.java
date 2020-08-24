package future.a01;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/*
Future를 통해서 비동기 결과의 값을 가져올 때는 get 메서드를 사용합니다.
그러나 get 메서드를 호출하게 되면 비동기 작업이 완료될 때까지 해당 스레드가 blocking됩니다.
Future는 비동기적인 연산 혹은 작업을 수행하고 그 결과를 갖고 있으며,
완료를 기다리고 계산 결과를 반환(get)하는 메소드와
그 외에도 해당 연산이 완료되었는지 확인하는(isDone) 메소드를 제공합니다.
*/
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
