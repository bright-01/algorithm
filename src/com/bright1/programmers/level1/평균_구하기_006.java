package com.bright1.programmers.level1;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * 문제 설명
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 *
 * 제한사항
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 * 입출력 예
 * arr	        return
 * [1,2,3,4]	2.5
 * [5,5]	    5
 *
 * */
public class 평균_구하기_006 {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(new Solution_006().solution2(arr));
    }
}


class Solution_006 {
    public double solution(int[] arr) {
        return IntStream.of(arr).average().getAsDouble();
    }

    public double solution1_1(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }

    public double solution2(int[] arr) {
        double sum = 0;
        for(int i : arr){
            sum+=i;
        }
        return sum / arr.length;
    }
}
