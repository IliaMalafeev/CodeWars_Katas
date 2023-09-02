package CodeWarsKatas7KYU;

import java.util.ArrayList;
import java.util.List;

/* <------------------------------------------------
    DESCRIPTION:

    In this kata you will create a function that takes a list of non-negative
    integers and strings and returns a new list with the strings filtered out.
---------------------------------------------------> */

public class K24_ListFiltering_UPGRADED {

    public static void main(String[] args) {

        List<Object> testList = List.of(1, 2, "aasf", "1", "123", 123);
        System.out.println(filterList(testList));
        System.out.println(filterListUpgraded(testList));
    }
    public static List<Object> filterList(final List<Object> list) {

        List<Object> listCopy = new ArrayList<>();
        for (Object o : list){
            if (o instanceof Integer) listCopy.add(o);
        }
        return listCopy;
    }

    public static List<Object> filterListUpgraded(final List<Object> list) {

        return list.stream().filter(x -> x instanceof Integer).toList();
    }
}
