package programmers.day7;

import java.util.ArrayList;
import java.util.List;

public class CountUp {
    public static void main(String[] args) {
        int[] solution = Solution2.solution(3, 10);
        for(int el : solution) {
            System.out.println(el);
        }
    }
}

/*
 * == 카운트 업 ==
 * 정수 start_num와 end_num가 주어질 때,
 * start_num부터 end_num까지의 숫자를
 * 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * == 제한사항 ==
 * 0 ≤ start_num ≤ end_num ≤ 50
 *
 * == 입출력 예 ==
 * start_num	end_num	   result
 * 3	        10	       [3, 4, 5, 6, 7, 8, 9, 10]
 *
 */
class Solution2 {
    public static int[] solution (int start_num, int end_num) {
        List<Integer> list = new ArrayList<>();

        for (int i = start_num; i <= end_num; i++) {
            list.add(i);
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}