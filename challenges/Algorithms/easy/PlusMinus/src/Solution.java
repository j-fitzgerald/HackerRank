import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i=0; i < arr.length; i++){
            if (arr[i] < 0) negative ++;
            else if (arr[i] > 0) positive++;
            else zero ++;

        }
        System.out.printf("%.6f\n", (double)positive/arr.length);
        System.out.printf("%.6f\n", (double)negative/arr.length);
        System.out.printf("%.6f\n", (double)zero/arr.length);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = {-4, 3, -9, 0, 4, 1};

        plusMinus(arr);

    }
}
