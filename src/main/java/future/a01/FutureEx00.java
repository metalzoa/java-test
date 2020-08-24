package future.a01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
ExecutorService
ExecutorService�� ���� �񵿱�� �۾��� ������ �� �ֵ��� �����ִ� JDK(1.5����)���� �����ϴ� interface�Դϴ�.
�Ϲ������� ExecutorService�� �۾� �Ҵ��� ���� ������ Ǯ�� API�� ����
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
