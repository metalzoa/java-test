package future.a01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
ExecutorService
ExecutorService는 쉽게 비동기로 작업을 실행할 수 있도록 도와주는 JDK(1.5부터)에서 제공하는 interface입니다.
일반적으로 ExecutorService는 작업 할당을 위한 스레드 풀과 API를 제공
 */
public class FutureEx00 {

    public static void main(String[] args) {
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
