package CodeWarsKatas7KYU;

import java.util.ArrayList;

/* <------------------------------------------------
    DESCRIPTION:

    There is a bus moving in the city which takes and drops some people at each bus stop.
    You are provided with a list (or array) of integer pairs.
    Elements of each pair represent the number of people that get
    on the bus (the first item) and the number of people that get
    off the bus (the second item) at a bus stop.

    Your task is to return the number of people who are still
    on the bus after the last bus stop (after the last array).
    Even though it is the last bus stop, the bus might not be empty and some
    people might still be inside the bus, they are probably sleeping there :D

    Please keep in mind that the test cases ensure that the
    number of people in the bus is always >= 0.
    So the returned integer can't be negative.

    The second value in the first pair in the array is 0,
    since the bus is empty in the first bus stop.
---------------------------------------------------> */

public class K17_NumberOfPeopleInTheBus {

    public static void main(String[] args) {

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        System.out.println(countPassengers(list));
    }

    public static int countPassengers (ArrayList<int[]> stops){

        int remPas = 0;
        for (int[] nextStop : stops){
            remPas = remPas + nextStop[0] - nextStop[1];
        }
        return remPas;
    }
}
