package future;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
Future
Future는 자바 1.5에서 등장한 비동기 계산의 결과를 나타내는 Interface 입니다.

비동기적인 작업을 수행한다는 것은 현재 진행하고 있는 스레드가 아닌
별도의 스레드에서 작업을 수행하는 것을 말합니다.
같은 스레드에서 메서드를 호출할 때는 결과를 리턴 값을 받지만,
비동기적으로 작업을 수행할 때는 결과값을 전달받을 수 있는
무언가의 interface가 필요한데 Future가 그 역할을 합니다.
 */
public class FutureEx01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();

        Future<String> f = es.submit(() -> {
            Thread.sleep(2000);
            System.out.println("Async");
            return "Hello";
        });

        System.out.println(f.get());
        System.out.println("Exit");
    }
}
