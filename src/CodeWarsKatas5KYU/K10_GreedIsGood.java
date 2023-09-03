package CodeWarsKatas5KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Greed is a dice game played with five six-sided dice.
    Your mission, should you choose to accept it, is to score a throw according to these rules.
    You will always be given an array with five six-sided dice values.

    Three 1's => 1000 points
    Three 6's =>  600 points
    Three 5's =>  500 points
    Three 4's =>  400 points
    Three 3's =>  300 points
    Three 2's =>  200 points
    One   1   =>  100 points
    One   5   =>   50 point

    A single die can only be counted once in each roll.
    For example, a given "5" can only count as part of a triplet (contributing to the 500 points)
    or as a single 50 points, but not both in the same roll.

    Example scoring

        Throw       Score
        ---------   ------------------
        5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
        1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
        2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)

---------------------------------------------------> */

public class K10_GreedIsGood {

    public static void main(String[] args) {

        System.out.println(greedy(new int[]{2,4,4,5,4}));
    }

    public static int greedy(int[] dice){

        int oneCount = 0, twoCount = 0, threeCount = 0, fourCount = 0, fiveCount = 0, sixCount = 0;
        int score = 0;
        for (int x : dice) {
            switch (x) {
                case 1 -> {
                    ++oneCount;
                    if (oneCount == 3) {
                        score += 1000;
                        oneCount = 0;
                    }
                }
                case 2 -> {
                    ++twoCount;
                    if (twoCount == 3) {
                        score += 200;
                        twoCount = 0;
                    }
                }
                case 3 -> {
                    ++threeCount;
                    if (threeCount == 3) {
                        score += 300;
                        threeCount = 0;
                    }
                }
                case 4 -> {
                    ++fourCount;
                    if (fourCount == 3) {
                        score += 400;
                        fourCount = 0;
                    }
                }
                case 5 -> {
                    ++fiveCount;
                    if (fiveCount == 3) {
                        score += 500;
                        fiveCount = 0;
                    }
                }
                case 6 -> {
                    ++sixCount;
                    if (sixCount == 3) {
                        score += 600;
                        sixCount = 0;
                    }
                }
            }
        }
        score += oneCount * 100 + fiveCount * 50;
        return score;
    }
}
