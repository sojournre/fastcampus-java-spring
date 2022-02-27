package ch02;

import java.util.Arrays;

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

    public static void main(String[] args) {
        int[] A = {2,2,2,2}; //1 3 5 7
        int[] B = {1,1,1,1}; //2 2 6 8
        // result 3

        int sol = solution(A, B);
        System.out.println("sol = " + sol);
    }
}

