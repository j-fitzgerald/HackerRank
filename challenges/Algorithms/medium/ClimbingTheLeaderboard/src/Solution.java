import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int scorePosition = 0;
    static int currentPlace = 1;
    static int currentValue = 0;

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int result[] = new int[alice.length];
        for (int i=0; i < alice.length; i++){
            result[i] = findNext(scores, alice[alice.length - i - 1]);
        }
        return result;
    }

    static int findNext(int scores[], int aliceScore){
        if (scorePosition < scores.length ){
            while (aliceScore < scores[scorePosition]) {
                if (scores[scorePosition] != currentValue) {
                    currentValue = scores[scorePosition];
                    currentPlace++;
                }
                scorePosition++;
                currentPlace++;
                if (scorePosition == scores.length )break;
            }
        }

        scorePosition++;
        if (scorePosition < scores.length ){currentValue = scores[scorePosition];}
        return currentPlace++;

    }

    /*
    static int[] findNext(int scores[], int alice[], int result[], int currentPlace,
                          int scorePosition, int alicePosition, int resultPosition){
        if (alicePosition >= alice.length)
            return result;
        if (scorePosition >= scores.length)
            fillResult(result, resultPosition, currentPlace);
        if (alice[alicePosition] >= scores[scorePosition]) {
            result[resultPosition] = currentPlace;
            return findNext()
        }

        return result;
    }
    */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int scores[] = {100, 90, 80, 75, 60};
        int alice[] = {50, 65, 77, 90, 102};
        int result[] = climbingLeaderboard(scores, alice);
        for (int i: result){
            System.out.println(i);
        }

        System.out.println();
        int scores2[] = {100, 100, 50, 40, 40, 20, 10};
        int alice2[] = {5, 25, 50, 120};
        int result2[] = climbingLeaderboard(scores2, alice2);
        for (int i: result2){
            System.out.println(i);
        }
    }
}
