package CodeWarsKatas5KYU;

import java.util.ArrayList;

public class K09_Scramblies {
    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw","world"));
        System.out.println(scramble("scriptjavx","javascript"));

    }

    public static boolean scramble(String str1, String str2) {
        ArrayList<String> list = new ArrayList<>();
        for (char x : str1.toCharArray()) list.add(String.valueOf(x));
        for (char y : str2.toCharArray()){
            if (!list.contains(String.valueOf(y))) return false;
            else list.remove(String.valueOf(y));
        }
        return true;
    }
}
