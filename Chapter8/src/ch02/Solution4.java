package ch02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Solution4 {
    public static int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int aIndex = 0, bIndex = 0;
        int answer = 0;

        for (int i = 0; i < A.length; i++) {
            if (B[bIndex] > A[aIndex]) {
                answer++;
                aIndex++;
            }
            bIndex++;
        }
        return answer;
    }

    public static void main(String[] args) throws ParseException {
        int[] A = {1,3,5,7}; //1 3 5 7
        int[] B = {2,2,6,8}; //2 2 6 8

        // result 3

        String[][] C= {{"09:00", "kim"}, {"09:05", "bae"}};
        int sol = solution(A, B);
        System.out.println("sol = " + sol);


        System.out.println("C = " + (C[0][0].compareTo(C[1][0])));
        System.out.println("C = " + (C[1][0].compareTo(C[0][0])));

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        Date to = simpleDateFormat.parse(C[0][0]);

        System.out.println("to = " + to);

    }

}

