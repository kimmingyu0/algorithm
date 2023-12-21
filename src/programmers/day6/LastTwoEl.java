package programmers.day6;

import java.util.Arrays;

public class LastTwoEl {
    public static void main(String[] args) {
        int[] solution = Solution1.solution(new int[]{2, 1, 6});

        for(int el : solution) {
            System.out.println(el);
        }
    }
}

/*
 * 정수 리스트 num_list가 주어질 때,
 * 마지막 원소가 그전 원소보다 크면 마지막 원소에서
 * 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다
 * 크지 않다면 마지막 원소를 두 배한 값을 추가하여
 * return하도록 solution 함수를 완성해주세요.
 *
 * == 제한사항 ==
 * 2 ≤ num_list의 길이 ≤ 10
 * 1 ≤ num_list의 원소 ≤ 9
 *
 * == 입출력 예 ==
 * num_list	        result
 * [2, 1, 6]	    [2, 1, 6, 5]
 * [5, 2, 1, 7, 5]	[5, 2, 1, 7, 5, 10]
 *
 */

class Solution1 {
    public static int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length+1);

        for(int i = 0; i<num_list.length-1; i++){
            if (num_list[i]<num_list[i+1]) {
                answer[num_list.length] = num_list[i+1]-num_list[i];
            } else {
                answer[num_list.length] = num_list[i+1]*2;
            }
        }

        return answer;
    }
}
