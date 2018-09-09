import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        result.add(0, 0);
        result.add(1,0);
        for (int i =0; i < a.size(); i++){
            if (a.get(i) < b.get(i))
                result.set(1, result.get(1) +1);
            else if (a.get(i) > b.get(i))
                result.set(0, result.get(0) + 1);
        }
        return result;

    }

    public static void main(String[] args) throws IOException {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        //17 28 30
        //99 16 8
        a.add(17);
        a.add(28);
        a.add(30);
        b.add(99);
        b.add(16);
        b.add(8);


        List<Integer> result = compareTriplets(a, b);
        for (int i : result){
            System.out.print(i + ",");
        }
    }
}
