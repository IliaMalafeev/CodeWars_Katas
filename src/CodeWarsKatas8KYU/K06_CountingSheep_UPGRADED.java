package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Consider an array/list of sheep where some sheep may be missing from their place.
    We need a function that counts the number of sheep present in the array (true means present).
    Hint: Don't forget to check for bad values like null/undefined
---------------------------------------------------> */

public class K06_CountingSheep_UPGRADED {

    public static void main(String[] args) {

        System.out.println(countSheep(new Boolean[] {true, true, true, false, true, true,
                true, true, true, false, true, false, true, false, false, true , true,
                true,  true, true, false, false, true, true }));

        System.out.println(countSheepUpgraded(new Boolean[] {true, true, true, false, true, true,
                true, true, true, false, true, false, true, false, false, true , true,
                true,  true, true, false, false, true, true }));
    }

    public static int countSheep(Boolean[] arrayOfSheep) {
        int count = 0;
        for (int i = 0; i < arrayOfSheep.length; i++){
            if (arrayOfSheep[i] == null) continue;
            count = (arrayOfSheep[i] == true)? ++count : count;
        }
        return count;
    }

    public static int countSheepUpgraded(Boolean[] arrayOfSheep) {
        int count = 0;
        for (Boolean sheep : arrayOfSheep) {
            if (sheep == null) continue;
            if (sheep) ++count;
        }
        return count;
    }
}
