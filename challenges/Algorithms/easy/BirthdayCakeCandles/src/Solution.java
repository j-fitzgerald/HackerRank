import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int tallest = 0;
        int count = 0;
        for (int candle : ar){
            if (candle > tallest){
                tallest = candle;
                count = 1;
            }
            else if (candle == tallest)
                count ++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] ar = {3,2,1,3};

        int result = birthdayCakeCandles(ar);
        System.out.print(result);

    }
}
