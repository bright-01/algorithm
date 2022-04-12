package com.bright1.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 *
 * 제한 사항
 * str은 길이 1 이상인 문자열입니다.
 * 입출력 예
 *  s	        return
 * "Zbcdefg"	"gfedcbZ"
 *
 * */
public class 문자열_내림차순으로_배치하기_023 {
    public static void main(String[] args) {
        System.out.println(new Solution_023().solution(new Scanner(System.in).nextLine()));
    }
}

class Solution_023 {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new StringBuffer(new String(chars)).reverse().toString();
    }

    public String solution2(String str){
        return Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }
}