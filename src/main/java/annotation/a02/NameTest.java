package annotation.a02;

import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

public class NameTest {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException{
        final Method method = Z.class.getMethod("something");
        if(method.isAnnotationPresent(Name.class)) {
            final Annotation annotaion = method.getAnnotation(Name.class);
            final Name name = (Name) annotaion;
            System.out.println(name.myName());
        }

    }
}
