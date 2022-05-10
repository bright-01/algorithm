package com.bright1.programmers.level1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 문제 설명
 * 정수 배열 numbers가 주어집니다.
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 * <p>
 * 제한사항
 * numbers의 길이는 2 이상 100 이하입니다.
 * numbers의 모든 수는 0 이상 100 이하입니다.
 * 입출력 예
 * numbers	result
 * [2,1,3,4,1]	[2,3,4,5,6,7]
 * [5,0,2,7]	[2,5,7,9,12]
 * 입출력 예 설명
 * 입출력 예 #1
 * <p>
 * 2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
 * 3 = 2 + 1 입니다.
 * 4 = 1 + 3 입니다.
 * 5 = 1 + 4 = 2 + 3 입니다.
 * 6 = 2 + 4 입니다.
 * 7 = 3 + 4 입니다.
 * 따라서 [2,3,4,5,6,7] 을 return 해야 합니다.
 * 입출력 예 #2
 * <p>
 * 2 = 0 + 2 입니다.
 * 5 = 5 + 0 입니다.
 * 7 = 0 + 7 = 5 + 2 입니다.
 * 9 = 2 + 7 입니다.
 * 12 = 5 + 7 입니다.
 * 따라서 [2,5,7,9,12] 를 return 해야 합니다.
 */

public class 두_개_뽑아서_더하기_041 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis();
        System.out.println(Arrays.toString(new Solution_041().solution2(new int[]{2, 1, 3, 4, 1})));
        System.out.println(Arrays.toString(new Solution_041().solution2(new int[]{5, 0, 2, 7})));
        long etime = System.currentTimeMillis();
        System.out.println("=============== :: " + (etime - stime));
    }

}
class Solution_041 {
    public int[] solution(int[] numbers) {
        HashSet hashSet = new HashSet();

        for (int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                hashSet.add(sum);
            }
        }

        List<Integer> list = new ArrayList(hashSet);
        Collections.sort(list);

        int[] answer = new int[list.size()];
        for(int i = 0; i< list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public int[] solution2(int[] numbers) {
        TreeSet treeSet = new TreeSet();

        for (int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                treeSet.add(sum);
            }
        }
        int[] answer = new int[treeSet.size()];

        int index = 0;
        Iterator iterator = treeSet.iterator();
        if(iterator.hasNext()){
            answer[index] = (int) iterator.next();
            index++;
        }

        return answer;
    }
}