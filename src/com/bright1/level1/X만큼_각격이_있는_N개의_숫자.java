package com.bright1.level1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

/**
 *
 * 문제 설명
 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * x는 -10000000 이상, 10000000 이하인 정수입니다.
 * n은 1000 이하인 자연수입니다.
 *
 * 입출력 예
 * x	n	answer
 * 2	5	[2,4,6,8,10]
 * 4	3	[4,8,12]
 * -4	2	[-4, -8]
 *
 * */
public class X만큼_각격이_있는_N개의_숫자 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();

        long[] result = solution.solution(x, n);
        long[] result2 = solution.solution2(x, n);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }
}


class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        int acc = 0;
        for(int i =0; i<n; i++){
            acc = acc + x;
            answer[i] = acc;
        }
        return answer;
    }

    public long[] solution2(int x, int n) {
        return LongStream.iterate(x, value -> value+x).limit(n).toArray();
    }
}
