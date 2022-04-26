package com.bright1.programmers.level1;

import java.util.Arrays;

/**
 *
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 *
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 * 입출력 예
 * s	    return
 * "abcde"	"c"
 * "qwer"	"we"
 *
 * */
public class 가운데_숫자_가져오기_032 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis();
        System.out.println(new Solution_032().solution2("qweerf"));
        long etime = System.currentTimeMillis();
        System.out.println("=============== :: " + (etime - stime));
    }
}

class Solution_032 {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int i = length / 2 ;
        if( length % 2 == 1){
            answer = s.substring(i, i+1);
        } else {
            answer = s.substring(i-1, i+1);
        }
        return answer;
    }

    public String solution2(String word) {
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }
}