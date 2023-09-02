package CodeWarsKatas6KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/* <------------------------------------------------
    DESCRIPTION:

    John has invited some friends.
    His list is: "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
    Could you make a program that makes this string uppercase, gives it sorted in alphabetical order by last name.
    When the last names are the same, sort them by first name. Last name and first name of a guest
    come in the result between parentheses separated by a comma.

    So the result of function meeting(s) will be:
        "(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"

    It can happen that in two distinct families with the same family name two people have the same first name too.
---------------------------------------------------> */

public class K57_Meeting_UPGRADED {

    public static void main(String[] args) {

        System.out.println(meeting("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;" +
                "Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn"));
        System.out.println(meeting("Alex:Arno;Alissa:Cornwell;Sarah:Bell;Andrew:Dorries;Ann:Kern;Haley:Arno;Paul:Dorny;Madison:Kern"));

        System.out.println("---------------");

        System.out.println(meetingUpgraded("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;" +
                "Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn"));
        System.out.println(meetingUpgraded("Alex:Arno;Alissa:Cornwell;Sarah:Bell;Andrew:Dorries;Ann:Kern;Haley:Arno;Paul:Dorny;Madison:Kern"));
    }

    public static String meeting(String s) {

        ArrayList<String[]> list = new ArrayList<>();
        String[] array = s.split(";");
        for (String x : array) list.add(x.toUpperCase().split(":"));

        list.sort((o1, o2) -> {
            if (o1[1].compareTo(o2[1]) == 0) return o1[0].compareTo(o2[0]);
            return o1[1].compareTo(o2[1]);
        });

        StringBuilder sb = new StringBuilder();
        for (String[] x : list) sb.append("(").append(x[1]).append(", ").append(x[0]).append(")");

        return sb.toString();
    }

    public static String meetingUpgraded(String s){

        return Arrays.stream(s.toUpperCase().split(";")).
                map(x -> x.replaceAll("(\\w+):(\\w+)", "($2, $1)")).
                sorted().
                collect(Collectors.joining());
    }
}
