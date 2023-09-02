package CodeWarsKatas8KYU;

/* <------------------------------------------------
    DESCRIPTION:

    Write function bmi that calculates body mass index (bmi = weight / (height * height)).
    if bmi <= 18.5 return "Underweight"
    if bmi <= 25.0 return "Normal"
    if bmi <= 30.0 return "Overweight"
    if bmi > 30 return "Obese"
---------------------------------------------------> */

public class K07_CalculateBMI {

    public static void main(String[] args) {
        System.out.println(bmi(1, 1));
        System.out.println(bmi(200, 2));
    }

    public static String bmi(double weight, double height) {

        double bMi = weight / (height * height);

        if (bMi <= 18.5) return "Underweight";
        else if (bMi <= 25.0) return "Normal";
        else if (bMi <= 30.0) return "Overweight";

        return "Obese";
    }
}
