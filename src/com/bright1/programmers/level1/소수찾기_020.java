package com.bright1.programmers.level1;

import java.util.Scanner;

/**
 * 문제 설명
 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
 *
 * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
 * (1은 소수가 아닙니다.)
 *
 * 제한 조건
 * n은 2이상 1000000이하의 자연수입니다.
 * 입출력 예
 * n	result
 * 10	4
 * 5	3
 * 입출력 예 설명
 * 입출력 예 #1
 * 1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환
 *
 * 입출력 예 #2
 * 1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
 *
 * */
public class 소수찾기_020 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis();
        System.out.println(new Solution_020().solution(new Scanner(System.in).nextInt()));
        long etime = System.currentTimeMillis();
        System.out.println("=============== :: " + (etime-stime));
    }
}

/**
 * 중요
 * 에라토스테네스의 체
 * 1. 2부터 소수를 구하고자 하는 구간의 모든 수를 나열한다. 그림에서 회색 사각형으로 두른 수들이 여기에 해당한다.
 * 2. 2는 소수이므로 오른쪽에 2를 쓴다. (빨간색)
 * 3. 자기 자신을 제외한 2의 배수를 모두 지운다.
 * 4. 남아있는 수 가운데 3은 소수이므로 오른쪽에 3을 쓴다. (초록색)
 * 5. 자기 자신을 제외한 3의 배수를 모두 지운다.
 * 6. 남아있는 수 가운데 5는 소수이므로 오른쪽에 5를 쓴다. (파란색)
 * 7. 자기 자신을 제외한 5의 배수를 모두 지운다.
 * 8. 남아있는 수 가운데 7은 소수이므로 오른쪽에 7을 쓴다. (노란색)
 * 9. 자기 자신을 제외한 7의 배수를 모두 지운다.
 * 10. 위의 과정을 반복하면 구하는 구간의 모든 소수가 남는다.
 * */

class Solution_020 {
    public int solution(int n) {
        int answer = 0;

        int[] temp = new int[n+1];

        for(int i = 0; i<=n ; i++){
            temp[i] = i;
        }
        temp[1] = 0;

        for(int i = 2; i <= n; i++){

            if(temp[i] == 0 ) continue;

            for(int j = i*2; j <=n; j+=i){
               temp[j] =0;
            }
        }

        for(int i =0; i<temp.length; i++){
            if(temp[i] != 0 ){
                answer++;
            }
        }

        return answer;
    }
}
