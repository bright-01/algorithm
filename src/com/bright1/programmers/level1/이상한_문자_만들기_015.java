package com.bright1.programmers.level1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 문제 설명
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 *
 * 제한 사항
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 * 입출력 예
 * s	                return
 * "try hello world"	"TrY HeLlO WoRlD"
 * 입출력 예 설명
 * "try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다. 각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 "TrY", "HeLlO", "WoRlD"입니다. 따라서 "TrY HeLlO WoRlD" 를 리턴합니다.
 *
 * */
public class 이상한_문자_만들기_015 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        String solution = new Solution_015().solution2(next);
        System.out.println("solution = " + solution);
    }
}


class Solution_015 {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");
        for(String ss : array){
            cnt = ss.contains(" ") ? 0 : cnt +1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }

    public String solution2(String s) {
        String answer = "";
        int idx = 0;

        String[] strArr = s.split("");

        for(int i=0; i<strArr.length; i++) {
            if((" ").equals(strArr[i])){
                idx = 0;
            } else {
                if(idx%2==0) {
                    idx++;
                    strArr[i] = strArr[i].toUpperCase();
                }else {
                    idx++;
                    strArr[i] = strArr[i].toLowerCase();
                }
            }
            answer += strArr[i];
        }

        return answer;

    }

    public String solution3(String s) {
        String answer = "";
        String[] arr = s.split(" ", 1);

        for ( int i = 0; i<arr.length; i++){
            String str = arr[i];
            for(int j = 0; j<str.length(); j++){
                if( j%2 == 0) {
                    answer +=  Character.toString(str.charAt(j)).toLowerCase();
                }else{
                    answer +=  Character.toString(str.charAt(j)).toUpperCase();
                }
            }
            if ( i == str.length() -1) break;
            answer += "";
        }
        return answer;
    }
}