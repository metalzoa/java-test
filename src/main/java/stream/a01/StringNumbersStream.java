package stream.a01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/*

1 : 2 : 3 : 4 : 5 : 6 : 7 : 8 : 9 : 10
 */
public class StringNumbersStream {

    public static void main(String[] args){
        final List<String> numbers = Arrays.asList("1","2","3","4","5","6","7","8","9","10");

        final String result = numbers
                .stream()
                .collect(Collectors.joining((" : ")));
        System.out.println(result);
    }
}
