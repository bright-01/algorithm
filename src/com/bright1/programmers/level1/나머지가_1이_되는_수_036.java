package com.bright1.programmers.level1;

import java.util.Scanner;

/**
 *
 * 문제 설명
 * 자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
 * 답이 항상 존재함은 증명될 수 있습니다.
 *
 * 제한사항
 * 3 ≤ n ≤ 1,000,000
 * 입출력 예
 * n	        result
 * 10	        3
 * 12	        11
 *
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 10을 3으로 나눈 나머지가 1이고, 3보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 3을 return 해야 합니다.
 * 입출력 예 #2
 *
 * 12를 11로 나눈 나머지가 1이고, 11보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 11을 return 해야 합니다.
 * */
public class 나머지가_1이_되는_수_036 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis();
        System.out.println(new Solution_036().solution(new Scanner(System.in).nextInt()));
        long etime = System.currentTimeMillis();
        System.out.println("=============== :: " + (etime - stime));
    }
}

class Solution_036 {
    public int solution(int n) {
        int i = 2;
        while(n % i != 1){
            i++;
        }
        return i;
    }
}