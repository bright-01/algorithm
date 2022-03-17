package com.bright1.programmers.level1;

import java.util.Scanner;

/**
 *
 * 문제 설명
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * s는 길이 4 이상, 20이하인 문자열입니다.
 * 입출력 예
 * phone_number	    return
 * "01033334444"	"*******4444"
 * "027778888"	    "*****8888"
 * */
public class 핸드폰_번호_가리기_004 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        String number = s1.next();
        System.out.println(new Solution_004().solution(number));
    }
}

class Solution_004 {
    public String solution(String phone_number) {
        String answer = "";
        int i1 = phone_number.length();
        int i2 = i1 - 4;
        for(int i=0; i < i1; i++){
            if(i < i2){
                answer += '*';
            }else{
                answer += phone_number.charAt(i);
            }
        }
        return answer;
    }

    public String solution2(String phone_number) {
       char[] ch = phone_number.toCharArray();
       for(int i =0; i < ch.length -4; i++){
           ch[i] = '*';
       }
       return String.valueOf(ch);
    }

    public String solution3(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}
