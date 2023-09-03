package CodeWarsKatas5KYU;

/* <------------------------------------------------
    DESCRIPTION:
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
                case 1 : ++oneCount;
                    if (oneCount == 3){
                        score += 1000;
                        oneCount = 0;
                    }
                    break;
                case 2 : ++twoCount;
                    if (twoCount == 3){
                        score += 200;
                        twoCount = 0;
                    }
                    break;
                case 3: ++threeCount;
                    if (threeCount == 3){
                        score += 300;
                        threeCount = 0;
                    }
                    break;
                case 4 : ++fourCount;
                    if (fourCount == 3){
                        score += 400;
                        fourCount = 0;
                    }
                    break;
                case 5 : ++fiveCount;
                    if (fiveCount == 3){
                        score += 500;
                        fiveCount = 0;
                    }
                    break;
                case 6 : ++sixCount;
                    if (sixCount == 3){
                        score += 600;
                        sixCount = 0;
                    }
                    break;
            }
        }
        score += oneCount * 100 + fiveCount * 50;
        return score;
    }
}
