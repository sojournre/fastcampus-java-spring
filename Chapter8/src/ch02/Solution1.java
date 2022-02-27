package ch02;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {

/*        문제 설명
        0 이상 255 이하인 정수로 이루어진 배열 arr가 매개변수로 주어집니다. "임계값 이상"인 숫자의 개수를 a, "임계값 미만"인 숫자의 개수를 b라고 할 때
        a와 b의 차이가 최소가 되는 임계값(Threshold)을 return 하도록 solution 함수를 완성해주세요.

                단, a와 b의 차이가 최소가 되는 임계값이 여러 개라면 그중 가장 작은 값을 선택합니다.

        제한사항
        arr의 길이는 1 이상 1,000 이하입니다.
                arr의 원소는 0 이상 255 이하인 정수입니다.

[1,52,125,10,25,201,244,192,128,23,203,98,154,255]	126
                [0,0,255,255,0,0,255,255,255]	1
                [100,50,100,200]	51
      */

        int[] arr = {100,50,100,200};

        int answer = -1;

        Arrays.sort(arr);
        System.out.println(arr[arr.length/2 - 1] + 1);

        System.out.println(answer);

        }
}
