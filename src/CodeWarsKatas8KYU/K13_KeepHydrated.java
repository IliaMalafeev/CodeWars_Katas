package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Nathan loves cycling. Because Nathan knows it is important to stay hydrated,
    he drinks 0.5 litres of water per hour of cycling. You get given the time in hours,
    and you need to return the number of litres Nathan will drink, rounded to the smallest value.
---------------------------------------------------> */

public class K13_KeepHydrated {

    public static void main(String[] args) {
        System.out.println(liters(0.82));
        System.out.println(liters(1802.44));
    }

    public static int liters(double time)  {
        return (int) (time / 2);
    }
}
