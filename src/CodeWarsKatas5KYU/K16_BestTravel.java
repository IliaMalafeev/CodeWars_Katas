package CodeWarsKatas5KYU;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* <------------------------------------------------
    DESCRIPTION:

    John and Mary want to travel between a few towns A, B, C ...
    Mary has on a sheet of paper a list of distances between these towns ls = [50, 55, 57, 58, 60].
    John is tired of driving, and he says to Mary that he doesn't want
    to drive more than t = 174 miles, and he will visit only 3 towns.

    Which distances, hence which towns, they will choose so that the
    sum of the distances is the biggest possible to please Mary and John?

    Example:

        With list ls and 3 towns to visit they can make a choice between:
        [50,55,57],[50,55,58],[50,55,60],[50,57,58],[50,57,60],[50,58,60],[55,57,58],[55,57,60],[55,58,60],[57,58,60].

        The sums of distances are then: 162, 163, 165, 165, 167, 168, 170, 172, 173, 175.

        The biggest possible sum taking a limit of 174 into account is then 173
        and the distances of the 3 corresponding towns is [55, 58, 60].

        The function chooseBestSum will take as parameters:
            t (maximum sum of distances, integer >= 0),
            k (number of towns to visit, k >= 1) and
            ls (list of distances, all distances are positive or zero integers and this list has at least one element).

        The function returns the "best" sum ie the biggest possible sum of k distances
        less than or equal to the given limit t, if that sum exists, or otherwise null.

    Examples:

        ts = [50, 55, 56, 57, 58] choose_best_sum(163, 3, ts) -> 163
        xs = [50] choose_best_sum(163, 3, xs) -> null
        ys = [91, 74, 73, 85, 73, 81, 87] choose_best_sum(230, 3, ys) -> 228

    Notes: try not to modify the input list of distances ls.
---------------------------------------------------> */

public class K16_BestTravel {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(91, 74, 73, 85, 73, 81, 87);
        List<Integer> list2 = List.of(50);
        List<Integer> list3 = List.of(50, 55, 56, 57, 58);
        List<Integer> list4 = List.of(100, 76, 56, 44, 89, 73, 68, 56, 64, 123, 2333, 144, 50, 132, 123, 34, 89);
        List<Integer> list5 = List.of(213, 47, 256, 463, 392, 442, 85, 470, 186, 31, 376, 424, 447, 63, 24, 195, 95, 65, 96, 10);
        List<Integer> list6 = List.of(0, 0, 0, 73, 85, 0, 0);
        List<Integer> list7 = List.of(34, 44, 50, 56, 56, 64, 68, 73, 76, 89, 89, 100, 123, 123, 132, 144, 2333);

        System.out.println(chooseBestSum(230, 3, list1)); // 228
        System.out.println(chooseBestSum(331, 2, list1)); // 178
        System.out.println(chooseBestSum(163, 3, list2)); // null
        System.out.println(chooseBestSum(163, 3, list3)); // 163
        System.out.println(chooseBestSum(230, 4, list4)); // 230
        System.out.println(chooseBestSum(170, 2, list5)); // 161
        System.out.println(chooseBestSum(331, 4, list6)); // 158
        System.out.println(chooseBestSum(880, 8, list7)); // 876
    }

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {

        if (k > ls.size()) return null;
        if (ls.stream().sorted().mapToInt(x -> x).limit(k).sum() > t) return null;

        ArrayList<Integer> results = new ArrayList<>();
        findCombinations(ls, k, t, 0, new int[k], results);
        results.sort(Comparator.comparingInt(x -> x));
        return results.isEmpty() ? null : results.get(results.size() - 1);
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
}