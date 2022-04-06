package com.bright1.programmers.level1;

import java.util.Scanner;

/**
 *
 * 문제 설명
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 *
 * 제한 사항
 * s는 길이 1 이상, 길이 8 이하인 문자열입니다.
 * 입출력 예
 * s	    return
 * "a234"	false
 * "1234"	true
 *
 * */
public class 문자열_다루는_기본_022 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis();
        System.out.println(new Solution_022().solution(new Scanner(System.in).nextLine()));
        long etime = System.currentTimeMillis();
        System.out.println("=============== :: " + (etime-stime));

    }
}

class Solution_022 {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){ //3895
            return s.matches("[0-9]+");
        }else{
            return false;
        }
    }

    public boolean solution2(String s) { //3279
        boolean answer = true;

        char[] chars = s.toCharArray();
        int length = chars.length;
        if(length == 4 || length == 6){
            for(char c : chars){
                if(!Character.isDigit(c)){
                    return false;
                }
            }
        }else{
            return false;
        }
        return answer;
    }

    public boolean solution3(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }
}