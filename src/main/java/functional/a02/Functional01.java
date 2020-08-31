package functional.a02;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Functional01 {

    /*
     * ���� ��ũ : https://multifrontgarden.tistory.com/125
     */
    public static void main(String[] args){
        /*
        * �������� �����ϴ� �������̽��� �����带 �����Ҷ� �ַλ���Ͽ����� ���� �⺻���� �Լ��� �������̽���.
        * void Ÿ���� ���ھ��� �޼��带 �����ִ�.
        */
        Runnable r = () -> System.out.println("-----> hello functional");
        r.run();

        /*
         * ���ڴ� ���������� ����Ÿ�Ը� �����ϴ� �޼��带 �����ִ�. \
         * �����Լ����� ����� �ٲٴ°� ���� ��ǲ(input) ���̴�.
         * �׷��� ��ǲ�� ���ٴ°� ���ο��� �����Լ��������� ���°� �ƴ��̻�
         * �׻� ���� ���� �����ϴ� �޼����°� �� �� �ִ�.
         */
        Supplier<String> s = () -> "-----> hello supplier";
        String result = s.get();
        System.out.println(result);

        /*
         * ������ �����ʰ�(void), ���ڸ� �޴� �޼��带 �����ִ�.
         * ���ڸ� �޾� �Ҹ��Ѵٴ� ������ �������̽� ��Ī�� �����ϸ� �ɵ� �ϴ�.
         */

        Consumer<String> c = str -> System.out.println(str);
        c.accept("-----> hello consumer");


        /*
         * �ڹ��� �������� �������̽� �� �ϳ��̴�.
         * ��ü�� �켱������ ���Ҷ� ����ϴ� �������̽��ε� ���������� 1ȸ�� ������ ���� �ϴ� �������̽��̴�.
         * ������ �������� Comparator�� ������ �ſ� ��������
         * Comparable �������̽��� ��ȿ���� ���� �������� �ϴ�.
         */
        Comparator<String> cp = (str1, str2) -> str1.compareTo(str2);
        int cpResult = cp.compare("aaa", "bbb");
        System.out.println("-----> result : "+cpResult);
    }
}
