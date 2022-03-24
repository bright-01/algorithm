package com.bright1.programmers.level1;

import java.util.Scanner;

/**
 * 문제 설명
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 * <p>
 * 제한 사항
 * n은 1이상, 50000000000000 이하인 양의 정수입니다.
 * 입출력 예
 * n	return
 * 121	144
 * 3	-1
 * 입출력 예 설명
 * 입출력 예#1
 * 121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.
 * <p>
 * 입출력 예#2
 * 3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.
 */
public class 정수_제곱근_판별_011 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        System.out.println(new Solution_011().solution(num));

    }
}

class Solution_011 {
    public long solution(long n) {
        if (n == 1) {
            return 4;
        }

        for (long i = 2; i < (n / 2) + 1; i++) {
            if (n / i == i && n % i == 0) {
                return (i + 1) * (i + 1);
            }
        }

        return -1;
    }

    public long solution2(long n) {
        if( Math.pow( (int) Math.sqrt(n), 2 ) == n){
            return (long) Math.pow( Math.sqrt(n)+1, 2);
        }
        return -1;
    }

    public long solution3(long n) {
       double i = Math.sqrt(n);
       return Math.floor(i) == i ? (long) Math.pow(i +1 , 2) : -1;
    }


}
