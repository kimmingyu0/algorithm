package programmers.day7;

import java.util.ArrayList;
import java.util.List;

public class CreateArray4 {
    public static void main(String[] args) {
        int[] solution = Solution5.solution(new int[]{1, 4, 2, 5, 3});

        for (int el : solution) {
            System.out.print(el + " ");
        }
    }
}

/*
 * == 배열 만들기 4 ==
 * 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.
 * 변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
 * 만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
 * stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
 * stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
 * 위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.
 *
 * == 제한사항 ==
 * 1 ≤ arr의 길이 ≤ 100,000
 * 1 ≤ arr의 원소 ≤ 100,000
 *
 * == 입출력 예 ==
 * larr	             result
 * [1, 4, 2, 5, 3]	 [1, 2, 3]
 *
 */
class Solution5 {
    public static int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();

        for (int i = 0; i < arr.length; ) {
            if (stkList.size() == 0) {
                stkList.add(arr[i]);
                i++;
            } else if (stkList.get(stkList.size() - 1) < arr[i]) {
                stkList.add(arr[i]);
                i++;
            } else if (stkList.get(stkList.size() - 1) >= arr[i]) {
                stkList.remove(stkList.size() - 1);
            }
        }

        return stkList.stream().mapToInt(Integer:: intValue).toArray();
    }
}
