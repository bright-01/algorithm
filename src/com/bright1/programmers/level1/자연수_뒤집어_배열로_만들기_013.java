package com.bright1.programmers.level1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 * 입출력 예
 * n	    return
 * 12345	[5,4,3,2,1]
 *
 * */
public class 자연수_뒤집어_배열로_만들기_013 {

    public static void main(String[] args) {
        Solution_013 solution = new Solution_013();
        Scanner s = new Scanner(System.in);
        long x = s.nextLong();
        long stime = System.currentTimeMillis();
        System.out.println(solution.solution(x));
        long etime = System.currentTimeMillis();
        System.out.println("=============== :: " + (etime-stime));
    }

}

class Solution_013 {
    public int[] solution(long n) {

        char[] arr = Long.toString(n).toCharArray();
        String s = new StringBuffer(new String(arr)).reverse().toString();
        return Stream.of(s.split("")).mapToInt(Integer::parseInt).toArray();
    }

    public int[] solution2(long n) {
        char[] arr = Long.toString(n).toCharArray();
        String s = new StringBuffer(new String(arr)).reverse().toString();
        int [] ints = new int [s.length()];
        for(int i = 0; i<s.length();i++){
            ints[i] = s.charAt(i)-'0';
        }
        return ints;
    }

    public int[] solution3(long n) {
       String a = String.valueOf(n);
       int [] answer = new int [a.length()];
       int cnt = 0;
       while (n > 0){
           answer[cnt] = (int) (n%10);
           n/=10;
           System.out.println(n);
           cnt++;
       }
       return answer;
    }

    public int[] solution4(long n) {
        return new StringBuffer().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
