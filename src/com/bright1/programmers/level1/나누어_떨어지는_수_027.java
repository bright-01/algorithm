package com.bright1.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 문제 설명
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 * <p>
 * 제한사항
 * arr은 자연수를 담은 배열입니다.
 * 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
 * divisor는 자연수입니다.
 * array는 길이 1 이상인 배열입니다.
 * 입출력 예
 * arr	            divisor	    return
 * [5, 9, 7, 10]	5	        [5, 10]
 * [2, 36, 1, 3]	1	        [1, 2, 3, 36]
 * [3,2,6]	        10	        [-1]
 * 입출력 예 설명
 * 입출력 예#1
 * arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.
 * <p>
 * 입출력 예#2
 * arr의 모든 원소는 1으로 나누어 떨어집니다. 원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.
 * <p>
 * 입출력 예#3
 * 3, 2, 6은 10으로 나누어 떨어지지 않습니다. 나누어 떨어지는 원소가 없으므로 [-1]을 리턴합니다.
 */

public class 나누어_떨어지는_수_027 {
    public static void main(String[] args) {

        int[] arr = {	3, 2, 6};
        int divisor = 10;

        long stime = System.currentTimeMillis();
        System.out.println(Arrays.toString(new Solution_027().solution3(arr, divisor)));
        long etime = System.currentTimeMillis();
        System.out.println("=============== :: " + (etime - stime));

    }

}

class Solution_027 {

    public int[] solution1(int[] arr, int divisor) {
        int[] ints = Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();
        if(ints.length == 0 ) return new int[]{ -1 };
        Arrays.sort(ints);
        return ints;
    }


    public int[] solution3(int[] arr, int divisor) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i : arr) {
            boolean div = i % divisor == 0;
            if (div) {
                arrayList.add(i);
            }
        }

        if(arrayList.isEmpty()){
            return new int[]{ -1 };
        }

        arrayList.sort(Comparator.naturalOrder());

        int [] answer = new int[arrayList.size()];

        for(int i =0; i<arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

//    public List<Integer> solution2(int[] arr, int divisor) {
//        return IntStream.of(arr).boxed().filter( i -> i % divisor == 0).collect(Collectors.toList());
//    }




}
