package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * An example of "Inheritance breaks Encapsulation"
 *
 *
 * @author Kevin Lee
 * @since 2015-08-01
 */
public class OopExample {
    public static void main(final String[] args) {
        final MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("     list count: " + list.getCount());   // 3

        final MyList<Integer> list2 = new MyList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("    list2 count: " + list2.getCount());  // 5

        System.out.println("--------------------");
        final MySet<Integer> mySet = new MySet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        System.out.println("    mySet count: " + mySet.getCount());   // 3

        final MySet<Integer> mySet2 = new MySet<>();
        mySet2.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("   mySet2 count: " + mySet2.getCount());   // ooops 10, why 10 ????

        System.out.println("--------------------");
        final MyNewSet<Integer> myNewSet = new MyNewSet<>();
        myNewSet.add(1);
        myNewSet.add(2);
        myNewSet.add(3);
        System.out.println(" myNewSet count: " + myNewSet.getCount());   // 3

        final MyNewSet<Integer> myNewSet2 = new MyNewSet<>();
        myNewSet2.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("myNewSet2 count: " + myNewSet2.getCount());   // 5

    }
}

class MyList<E> extends ArrayList<E> {
    private int count;

    public int getCount() {
        return count;
    }

    @Override
    public boolean addAll(final Collection c) {
        count += c.size();
        return super.addAll(c);
    }

    @Override
    public boolean add(final E o) {
        count++;
        return super.add(o);
    }
}


class MySet<E> extends HashSet<E> {
    private int count;

    public int getCount() {
        return count;
    }

    @Override
    public boolean addAll(final Collection c) {
        count += c.size();
        return super.addAll(c);
    }

    @Override
    public boolean add(final E o) {
        count++;
        return super.add(o);
    }
}

/**

 */
class NewSet<E> extends HashSet<E> {
    @Override
    public boolean add(final E e) {
        return add0(e);
    }

    private boolean add0(final E e) {
        return super.add(e);
    }

    @Override
    public boolean addAll(final Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c)
            if (add0(e))
                modified = true;
        return modified;
    }
}


class MyNewSet<E> extends NewSet<E> {
    private int count;

    public int getCount() {
        return count;
    }

    @Override
    public boolean addAll(final Collection c) {
        count += c.size();
        return super.addAll(c);
    }

    @Override
    public boolean add(final E o) {
        count++;
        return super.add(o);
    }
}