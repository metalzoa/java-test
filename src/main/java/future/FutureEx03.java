package future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/*
FutureTask�� �񵿱� �۾��� �����մϴ�.
���ݱ��� ���� �ڵ�� �񵿱� �۾� ������ ������ ���ÿ� �ߴٸ�
FutureTask�� �񵿱� �۾� ������ ������ �и��Ͽ� ������ �� �ֽ��ϴ�.
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
