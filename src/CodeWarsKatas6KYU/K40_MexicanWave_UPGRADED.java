package CodeWarsKatas6KYU;

import java.util.ArrayList;
import java.util.Arrays;

/* <------------------------------------------------
    DESCRIPTION:

    Introduction:
        The wave (known as the Mexican wave in the English-speaking world outside North America) is an example of
        metachronal rhythm achieved in a packed stadium when successive groups of spectators briefly stand, yell, and
        raise their arms. Immediately upon stretching to full height, the spectator returns to the usual seated position.
        The result is a wave of standing spectators that travels through the crowd, even though individual spectators
        never move away from their seats. In many large arenas the crowd is seated in a contiguous circuit all the way
        around the sport field, and so the wave is able to travel continuously around the arena; in discontiguous
        seating arrangements, the wave can instead reflect back and forth through the crowd. When the gap in seating
        is narrow, the wave can sometimes pass through it. Usually only one wave crest will be present at any given
        time in an arena, although simultaneous, counter-rotating waves have been produced.

    Task:
        In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
        You will be passed a string, and you must return that string in an array where an uppercase letter is a person standing up.

    Rules:
         1. The input string will always be lower case but maybe empty.
         2. If the character in the string is whitespace then pass over it as if it was an empty seat.

    Example: wave("hello") => {"Hello", "hEllo", "heLlo", "helLo", "hellO"}
---------------------------------------------------> */

public class K40_MexicanWave_UPGRADED {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(wave("hello")));
        System.out.println(Arrays.toString(wave(" fss ejxz w bkarmpctm tgmvdjmmaqeql")));

        System.out.println(Arrays.toString(waveUpgraded("hello")));
        System.out.println(Arrays.toString(waveUpgraded(" fss ejxz w bkarmpctm tgmvdjmmaqeql")));
    }

    public static String[] wave(String str) {

        String noSpaces = str.replaceAll(" ", "");
        String[] result = new String[noSpaces.length()];
        String strCopy = str;
        String resultPart = "";
        for (int i = 0; i < result.length; i++) {
            for (int j = i; j < str.length(); j++) {
                if (strCopy.charAt(j) == noSpaces.charAt(i)) {
                    resultPart = str.substring(0, j) + Character.toUpperCase(noSpaces.charAt(i)) + str.substring(j + 1);
                    strCopy = ".".repeat(j) + "." + str.substring(j + 1);
                    break;
                }
            }
            result[i] = resultPart;
            resultPart = "";
        }
        return result;
    }

    public static String[] waveUpgraded(String str) {

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') continue;
            result.add(str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1));
        }

        return result.toArray(new String[0]);
    }
}
