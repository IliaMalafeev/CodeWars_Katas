package CodeWarsKatas6KYU;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

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
        for (String[] x : list) sb.append("(" + x[1] + ", " + x[0] + ")");

        return sb.toString();
    }

    public static String meetingUpgraded(String s){
        return Arrays.stream(s.toUpperCase().split(";")).
                map(x -> x.replaceAll("(\\w+):(\\w+)", "($2, $1)")).
                sorted().
                collect(Collectors.joining());
    }
}
