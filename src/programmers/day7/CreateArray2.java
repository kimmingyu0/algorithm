package programmers.day7;

import java.util.ArrayList;
import java.util.List;

public class CreateArray2 {
    public static void main(String[] args) {
        int[] solution = Solution3.solution(5, 555);

        for (int el:solution) {
            System.out.print(el + " ");
        }
    }
}

/*
 * == 배열 만들기 2 ==
 * 정수 l과 r이 주어졌을 때,
 * l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만
 * 이루어진 모든 정수를 오름차순으로 저장한 배열을
 * return 하는 solution 함수를 완성해 주세요.
 * 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
 *
 * == 제한사항 ==
 * 1 ≤ l ≤ r ≤ 1,000,000
 *
 * == 입출력 예 ==
 * l	r	    result
 * 5    555	    [5, 50, 55, 500, 505, 550, 555]
 * 10	20	    [-1]
 *
 */
class Solution3 {
    public static int[] solution(int l, int r) {
        List<Integer> arr = new ArrayList<>();

        for(int i = l; i<=r; i++) {
            if(String.valueOf(i).matches("[05]+")) {
                arr.add(i);
            }
        }

        if(arr.isEmpty()) {
            return new int[]{-1};
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}