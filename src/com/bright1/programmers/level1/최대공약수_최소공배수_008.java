package com.bright1.programmers.level1;

import java.util.Arrays;
import java.util.Scanner;

/**
문제 설명
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

제한 사항
두 수는 1이상 1000000이하의 자연수입니다.
입출력 예
n	m	return
3	12	[3, 12]
2	5	[1, 10]
입출력 예 설명
입출력 예 #1
위의 설명과 같습니다.

입출력 예 #2
자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.
* */
public class 최대공약수_최소공배수_008 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int[] solution = new Solution_008().solution(num1, num2);
        System.out.println(Arrays.toString(solution));
    }

}

class Solution_008 {
    public int[] solution(int a, int b) {
        int[] answer = new int[2];
        answer[0] = GCD(a,b);
        answer[1] = LCM(a,b);
        return answer;
    }

    public int GCD(int a, int b){
        int r = 0;
        while(b != 0){
            r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    public int LCM(int a , int b){
        return (a * b) / GCD(a, b);
    }
}
