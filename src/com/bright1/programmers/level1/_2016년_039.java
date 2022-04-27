package com.bright1.programmers.level1;

/**
 * 문제 설명
 * 2016년 1월 1일은 금요일입니다.
 * 2016년 a월 b일은 무슨 요일일까요?
 * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
 * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다.
 * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
 * <p>
 * 제한 조건
 * 2016년은 윤년입니다.
 * 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
 * 입출력 예
 * a	b	result
 * 5	24	"TUE"
 */
public class _2016년_039 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis();
        System.out.println(new Solution_039().solution(5, 2));
        long etime = System.currentTimeMillis();
        System.out.println("=============== :: " + (etime - stime));
    }
}

class Solution_039 {
    public String solution(int m, int d) {
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String [] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int totalDay = 0;

        //월마다 일수 더해줌
        for ( int i =1; i< m; i++){
            totalDay += months[i - 1];
        }

        totalDay += d-1; // 1월1일 부터 시작해서 1 빼줌

        return days[(totalDay+5) % 7]; // 1월 1일이 금요일이라서 초기값 + 5해줌
    }
}
