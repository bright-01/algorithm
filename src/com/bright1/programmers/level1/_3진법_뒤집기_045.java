package com.bright1.programmers.level1;

import java.util.Arrays;

/**
 * 문제 설명
 * 자연수 n이 매개변수로 주어집니다.
 * n을 3진법 상에서 앞뒤로 뒤집은 후,
 * 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * n은 1 이상 100,000,000 이하인 자연수입니다.
 * 입출력 예
 * n	result
 * 45	7
 * 125	229
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 답을 도출하는 과정은 다음과 같습니다.
 * n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
 * 45	        1200	    0021	        7
 * 따라서 7을 return 해야 합니다.
 * 입출력 예 #2
 *
 * 답을 도출하는 과정은 다음과 같습니다.
 * n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
 * 125	11122	22111	229
 * 따라서 229를 return 해야 합니다.
 *
**/
public class _3진법_뒤집기_045 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis();
        System.out.println(new Solution_045().solution(45));
        long etime = System.currentTimeMillis();
        System.out.println("=============== :: " + (etime - stime));

    }
}

class Solution_045 {
    public int solution(int n) {
        int answer = 0;
        StringBuffer sb = new StringBuffer();
        // 10진 -> 3진
        while(n > 0){
            sb.append(n%3);
            n /= 3;
        }

        for(int i =0;i<sb.length();i++){
            int anInt = Integer.parseInt(String.valueOf(sb.charAt(i)));
            int value = 1;
            for(int j = 1; j < sb.length()-i ; j++){
                value *= 3;
            }

            answer += anInt * value;


        }

        return answer;

    }



    public int solution2(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();


        return Integer.parseInt(a,3);
    }


}
