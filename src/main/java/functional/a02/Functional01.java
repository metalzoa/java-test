package functional.a02;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Functional01 {

    /*
     * 참고 링크 : https://multifrontgarden.tistory.com/125
     */
    public static void main(String[] args){
        /*
        * 기존부터 존재하던 인터페이스로 스레드를 생성할때 주로사용하였으며 가장 기본적인 함수형 인터페이스다.
        * void 타입의 인자없는 메서드를 갖고있다.
        */
        Runnable r = () -> System.out.println("-----> hello functional");
        r.run();

        /*
         * 인자는 받지않으며 리턴타입만 존재하는 메서드를 갖고있다. \
         * 순수함수에서 결과를 바꾸는건 오직 인풋(input) 뿐이다.
         * 그런데 인풋이 없다는건 내부에서 랜덤함수같은것을 쓰는게 아닌이상
         * 항상 같은 것을 리턴하는 메서드라는걸 알 수 있다.
         */
        Supplier<String> s = () -> "-----> hello supplier";
        String result = s.get();
        System.out.println(result);

        /*
         * 리턴을 하지않고(void), 인자를 받는 메서드를 갖고있다.
         * 인자를 받아 소모한다는 뜻으로 인터페이스 명칭을 이해하면 될듯 하다.
         */

        Consumer<String> c = str -> System.out.println(str);
        c.accept("-----> hello consumer");


    }
}
