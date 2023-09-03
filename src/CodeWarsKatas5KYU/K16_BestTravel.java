package CodeWarsKatas5KYU;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* <------------------------------------------------
    DESCRIPTION:
---------------------------------------------------> */

public class K16_BestTravel {

    public static void main(String[] args) {

        test();
    }

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        if (k > ls.size()) return null;
        ls.sort(Comparator.comparingInt(x -> x));
        if (ls.stream().mapToInt(x -> x).limit(k).sum() > t) return null;

        ArrayList<Integer> results = new ArrayList<>();
        findCombinations(ls, k, t, 0, new int[k], results);
        results.sort(Comparator.comparingInt(x -> x));
        return results.size() == 0 ? null : results.get(results.size() - 1);
    }
    public static void findCombinations(List<Integer> ls, int k, int sumLimit, int startPosition, int[] combination, ArrayList<Integer> results) {
        int sum = 0;
        if (k == 0) {
            for (int i : combination) sum += i;
            if (sum <= sumLimit && !results.contains(sum)) results.add(sum);
        } else {
            for (int i = startPosition; i <= ls.size() - k; i++) {
                combination[combination.length - k] = ls.get(i);
                findCombinations(ls, k - 1, sumLimit, i + 1, combination, results);
            }
        }
    }

    public static void test() {

        List<Integer> list6 = new ArrayList<>();
        list6.add(0); list6.add(0); list6.add(0); list6.add(73); list6.add(85); list6.add(0); list6.add(0);
        System.out.println(chooseBestSum(331, 4, list6)); // 331

        List<Integer> list = new ArrayList<>();
        list.add(91); list.add(74); list.add(73); list.add(85); list.add(73); list.add(81); list.add(87);
        System.out.println(chooseBestSum(230, 3, list)); // 228

        List<Integer> list1 = new ArrayList<>();
        list1.add(91); list1.add(74); list1.add(73); list1.add(85); list1.add(73); list1.add(81); list1.add(87);
        System.out.println(chooseBestSum(331, 2, list1)); // 178

        List<Integer> list2 = new ArrayList<>();
        list.add(50);
        System.out.println(chooseBestSum(163, 3, list2)); // null

        List<Integer> list3 = new ArrayList<>();
        list3.add(50); list3.add(55); list3.add(56); list3.add(57); list3.add(58);
        System.out.println(chooseBestSum(163, 3, list3)); // 163

        List<Integer> list4 = new ArrayList<>();
        list4.add(100); list4.add(76); list4.add(56); list4.add(44); list4.add(89); list4.add(73); list4.add(68); list4.add(56);
        list4.add(64); list4.add(123); list4.add(2333); list4.add(144); list4.add(50); list4.add(132); list4.add(123); list4.add(34); list4.add(89);
        System.out.println(chooseBestSum(230, 4, list4)); // 230

        List<Integer> list5 = new ArrayList<>();
        list5.add(213); list5.add(47); list5.add(256); list5.add(463); list5.add(392); list5.add(442); list5.add(85); list5.add(470);list5.add(186);
        list5.add(31); list5.add(376); list5.add(424); list5.add(447); list5.add(63); list5.add(24); list5.add(195); list5.add(95); list5.add(65);
        list5.add(96); list5.add(10);
        System.out.println(chooseBestSum(170, 2, list5)); // 161

        List<Integer> list7 = new ArrayList<>();
        list7.add(34); list7.add(44); list7.add(50); list7.add(56); list7.add(56); list7.add(64); list7.add(68); list7.add(73); list7.add(76);
        list7.add(89); list7.add(89); list7.add(100); list7.add(123); list7.add(123); list7.add(132); list7.add(144); list7.add(2333);
        System.out.println(chooseBestSum(880, 8, list7)); // 876
    }
}
