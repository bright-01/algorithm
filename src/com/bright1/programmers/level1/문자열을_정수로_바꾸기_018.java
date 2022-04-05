package com.bright1.programmers.level1;

import java.util.Scanner;

/**
 * 문제 설명
 * 문자열 s를 숫자로 변환한 결과를 반환 하는 함수, solution을 완성 하세요.
 *
 * 제한 조건
 * s의 길이는 1 이상 5이하입니다.
 * s의 맨앞에는 부호(+, -)가 올 수 있습니다.
 * s는 부호와 숫자로만 이루어져있습니다.
 * s는 "0"으로 시작하지 않습니다.
 *
 * 입출력 예
 * 예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
 * str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
 *
 * */
public class 문자열을_정수로_바꾸기_018 {
    public static void main(String[] args) {
        System.out.println(new Solution_018().solution(new Scanner(System.in).next()));
    }

}
class Solution_018 {
    public int solution(String s) {
        int answer = 0;
        char[] chars = s.toCharArray();

        boolean isMinus = false;
        if(chars[0] == '-'){
            isMinus = true;
        }

        String str = "";
        for(int i =0; i<chars.length; i++){
            char c = chars[i];
            if(c != '-' && c != '+'){
                str += c;
            }
        }

        if(isMinus){
            answer = Integer.parseInt(str) * -1;
        }else {
            answer = Integer.parseInt(str);
        }
        return answer;
    }

    public int solution2(String s) {
        boolean sign = true;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '-')
                sign = false;
            else if(ch != '+')
                result = result * 10 + (ch - '0');
        }
        return ( sign ? 1 : -1 ) * result;
    }
}

