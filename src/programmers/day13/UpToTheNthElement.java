package programmers.day13;

import java.util.Arrays;

public class UpToTheNthElement {
    public static void main(String[] args) {
        int[] solution = Solution4.solution(new int[]{5, 2, 1, 7, 5}, 3);

        for (int el : solution) {
            System.out.print(el + " ");
        }
    }
}

/*
 * == n 번째 원소까지 ==
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list의 첫 번째 원소부터 n 번째 원소까지의
 * 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * == 제한사항 ==
 * 2 ≤ num_list의 길이 ≤ 30
 * 1 ≤ num_list의 원소 ≤ 9
 * 1 ≤ n ≤ num_list의 길이 ___
 *
 * == 입출력 예 ==
 * num_list          n     result
 * [2, 1, 6]         1     [2]
 * [5, 2, 1, 7, 5]   3     [5, 2, 1]
 *
 */
class Solution4 {
    public static int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }
}

