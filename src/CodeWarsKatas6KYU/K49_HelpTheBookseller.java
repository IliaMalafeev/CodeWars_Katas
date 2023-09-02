package CodeWarsKatas6KYU;

import java.util.LinkedHashMap;
import java.util.Map;

/* <------------------------------------------------
    DESCRIPTION:
---------------------------------------------------> */

public class K49_HelpTheBookseller {

    public static void main(String[] args) {

        // "(A : 200) - (B : 1140)"
        System.out.println(stockSummary(new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"}, new String[] {"A", "B"}));
    }

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String letter : lstOf1stLetter) map.put(letter, 0);

        for (String art : lstOfArt) {
            for (String letter : lstOf1stLetter) {
                if (art.startsWith(letter)) {
                    map.put(letter, map.get(letter) + Integer.parseInt(art.replaceAll("\\D", "")));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append("(" + entry.getKey() + " : " + entry.getValue() + ")").append(" - ");
        }

        return sb.toString().replaceAll(" - $", "");
    }
}
