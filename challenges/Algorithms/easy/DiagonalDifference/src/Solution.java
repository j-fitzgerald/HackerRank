import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int forward = 0;
        int backward = 0;
        for (int i=0; i < arr.length; i++){
            backward += arr[i][i];
            forward += arr[arr.length - i - 1][i];
        }
        return Math.abs(forward - backward);
    }

    public static void main(String[] args) throws IOException {
        int arr[][] = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        int result = diagonalDifference(arr);

        System.out.println(result);
    }
}
