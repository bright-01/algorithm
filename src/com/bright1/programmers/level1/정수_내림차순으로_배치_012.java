package com.bright1.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 문제 설명
 * 함수 solution 은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 *
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 * 입출력 예
 * n	    return
 * 118372	873211
 * */
public class 정수_내림차순으로_배치_012 {
    public static void main(String[] args) {
        Solution_012 solution = new Solution_012();
        Scanner s = new Scanner(System.in);
        long x = s.nextLong();
        System.out.println(solution.solution(x));
    }
}


class Solution_012 {
    public long solution(long n) {
        char[] arr = Long.toString(n).toCharArray();
        Arrays.sort(arr);
//        String s = String.valueOf(arr);
//        StringBuffer sb = new StringBuffer();
//        sb.append(arr).reverse();
//        sb.toString();
        // 위에 주석이 밑에 한줄
        return Long.parseLong(new StringBuffer(new String(arr)).reverse().toString());
    }

    public long solution2(long n) {
        return Long.parseLong(String.valueOf(n).chars().mapToObj(ch -> (char) ch)
                .sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString());
    }
}