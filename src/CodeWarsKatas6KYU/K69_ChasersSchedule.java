package CodeWarsKatas6KYU;

public class K69_ChasersSchedule {
    public static void main(String[] args) {
        System.out.println(solution(2, 4));
    }

    public static int solution(int speed, int time) {
        int min = Math.min((time + 1) / 2, (speed / 3) + 1);
        return ((time + min) * speed) - (min * 3 * (min - 1) / 2);
    }
}
