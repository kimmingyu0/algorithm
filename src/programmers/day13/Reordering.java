package programmers.day13;

import java.util.ArrayList;
import java.util.List;

public class Reordering {
    public static void main(String[] args) {
        int[] solution = Solution2.solution(new int[] {2, 1, 6}, 1);

        for (int el : solution){
            System.out.print(el + " ");
        }
    }
}

/*
 * == 순서 바꾸기 ==
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠
 * n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를
 * return하도록 solution 함수를 완성해주세요.
 *
 * == 제한사항 ==
 * 2 ≤ num_list의 길이 ≤ 30
 * 1 ≤ num_list의 원소 ≤ 9
 * 1 ≤ n ≤ num_list의 길이
 *
 * == 입출력 예 ==
 * num_list          n       result
 * [2, 1, 6]	     1       [1, 6, 2]
 * [5, 2, 1, 7, 5]   3       [7, 5, 5, 2, 1]
 *
 */
class Solution2 {
    public static int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = n; i<num_list.length; i++) {
            list.add(num_list[i]);
        }

        for (int i = 0; i<n; i++ ){
            list.add(num_list[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}


