package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/*
결과값
1 : 2 : 3 : 4 : 5 : 6 : 7 : 8 : 9 : 10
 */
public class IntegerNumbersStream {

    public static void main(String[] args){
        final List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        final String result = numbers
                .stream()
                .map( // key value 자료 구조가 아닌고 A 라는 타입을 B 라는 타입으로 맵핑 한다는 의미
                        String::valueOf // String.valuesOf() 안에 값을 넣어서 변환 한다는 의미
                )
                .collect(Collectors.joining((" : ")));



        System.out.println(result);
    }
}
