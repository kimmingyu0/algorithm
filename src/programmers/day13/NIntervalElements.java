package programmers.day13;

import java.util.stream.IntStream;

public class NIntervalElements {
    public static void main(String[] args) {
        int[] solution = Solution5.solution(new int[]{4, 2, 6, 1, 7, 6}, 2);

        for (int el : solution) {
            System.out.print(el + " ");
        }
    }
}

/*
 * == n개 간격의 원소들 ==
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로
 * 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * == 제한사항 ==
 * 5 ≤ num_list의 길이 ≤ 20
 * 1 ≤ num_list의 원소 ≤ 9
 * 1 ≤ n ≤ 4
 *
 * == 입출력 예 ==
 * num_list                n     result
 * [4, 2, 6, 1, 7, 6]      2     [4, 6, 7]
 * [4, 2, 6, 1, 7, 6]      4     [4, 7]
 *
 */
class Solution5 {
    public static int[] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length)
                .filter(i -> i % n == 0)
                .map(i -> num_list[i])
                .toArray();
    }
}