package test.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);
        players.forEach((player) -> System.out.print(player + "; "));
        players.forEach(System.out::println);
        final ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("");
        stringArrayList.add("");
        stringArrayList.add("");
        stringArrayList.add("");
        stringArrayList.add("");
        stringArrayList.add("");
        stringArrayList.add("");
        stringArrayList.add("");
        stringArrayList.add("");
        stringArrayList.add("");
        //----------------
        stringArrayList.add("");
        stringArrayList.add("");
        stringArrayList.add("");
        stringArrayList.add("");
        stringArrayList.add("");
        stringArrayList.add("");
        stringArrayList.add("");
        stringArrayList.add("");




    }
}
