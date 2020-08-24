package stream.a01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/*
1 : 2 : 3 : 4 : 5 : 6 : 7 : 8 : 9 : 10
 */
public class IntegerNumbersStream {

    public static void main(String[] args){
        final List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        final String result = numbers
                .stream()
                .map(
                        String::valueOf
                )
                .collect(Collectors.joining((" : ")));



        System.out.println(result);
    }
}
