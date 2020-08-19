package future;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
Future
Future�� �ڹ� 1.5���� ������ �񵿱� ����� ����� ��Ÿ���� Interface �Դϴ�.

�񵿱����� �۾��� �����Ѵٴ� ���� ���� �����ϰ� �ִ� �����尡 �ƴ�
������ �����忡�� �۾��� �����ϴ� ���� ���մϴ�.
���� �����忡�� �޼��带 ȣ���� ���� ����� ���� ���� ������,
�񵿱������� �۾��� ������ ���� ������� ���޹��� �� �ִ�
������ interface�� �ʿ��ѵ� Future�� �� ������ �մϴ�.
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
