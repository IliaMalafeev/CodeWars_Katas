package CodeWarsKatas5KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Write a function, which takes a non-negative integer (seconds) as input and
    returns the time in a human-readable format (HH:MM:SS)

    HH = hours, padded to 2 digits, range: 00 - 99
    MM = minutes, padded to 2 digits, range: 00 - 59
    SS = seconds, padded to 2 digits, range: 00 - 59
    The maximum time never exceeds 359999 (99:59:59)

    You can find some examples in the test fixtures.
---------------------------------------------------> */

public class K02_HumanReadableTime_UPGRADED {

    public static void main(String[] args) {

        System.out.println(makeReadable(0));
        System.out.println(makeReadable(5));
        System.out.println(makeReadable(60));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(359999));
        System.out.println(makeReadableUpgrade(0));
        System.out.println(makeReadableUpgrade(5));
        System.out.println(makeReadableUpgrade(60));
        System.out.println(makeReadableUpgrade(86399));
        System.out.println(makeReadableUpgrade(359999));
    }

    public static String makeReadable(int seconds) {

        int hours = seconds / 3600;
        int minutes = (seconds / 60) % 60;
        int newSeconds = seconds % 60;

        String strSeconds, strMinutes, strHours;
        if (newSeconds > 9) strSeconds = "" + newSeconds;
        else strSeconds = "0" + newSeconds;
        if (minutes > 9) strMinutes = "" + minutes;
        else strMinutes = "0" + minutes;
        if (hours > 9) strHours = "" + hours;
        else strHours = "0" + hours;

        return String.format("%s:%s:%s", strHours, strMinutes, strSeconds);
    }

    public static String makeReadableUpgrade(int seconds) {

        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }
}
