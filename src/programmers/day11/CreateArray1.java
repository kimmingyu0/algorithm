package programmers.day11;

import java.util.ArrayList;
import java.util.List;

public class CreateArray1 {
    public static void main(String[] args) {
        int[] solution = Solution2.solution(10, 3);
        for (int el : solution) {
            System.out.print(el + " ");
        }

    }
}

/*
 * == 배열 만들기 1 ==
 * 정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를
 * 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * == 제한사항 ==
 * 1 ≤ n ≤ 1,000,000
 * 1 ≤ k ≤ min(1,000, n)
 *
 * == 입출력 예 ==
 * n    k   result
 * 10   3   [3, 6, 9]
 * 15   5   [5, 10, 15]
 *
 */
class Solution2 {
    public static int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i<=n; i++) {
            if(i%k == 0) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}