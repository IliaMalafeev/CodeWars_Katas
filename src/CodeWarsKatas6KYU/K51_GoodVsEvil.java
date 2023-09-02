package CodeWarsKatas6KYU;

public class K51_GoodVsEvil {
    public static void main(String[] args) {
        System.out.println(battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));    // Good wins
        System.out.println(battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));     // Evil wins
        System.out.println(battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));     // Tie
    }

    public static String battle(String goodAmounts, String evilAmounts) {

        int[] forcesOfGood = {1, 2, 3, 3, 4, 10};
        int[] forcesOfEvil = {1, 2, 2, 2, 3, 5, 10};
        String[] goodArray = goodAmounts.split(" ");
        String[] evilArray = evilAmounts.split(" ");

        int goodSum = 0, evilSum = 0;
        for (int i = 0; i < goodArray.length; i++) goodSum = goodSum + (Integer.parseInt(goodArray[i]) * forcesOfGood[i]);
        for (int j = 0; j < evilArray.length; j++) evilSum = evilSum + (Integer.parseInt(evilArray[j]) * forcesOfEvil[j]);

        return goodSum > evilSum ?  "Battle Result: Good triumphs over Evil" :
               goodSum == evilSum ? "Battle Result: No victor on this battle field" :
                                    "Battle Result: Evil eradicates all trace of Good";
    }
}
