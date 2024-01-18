package programmers.day19;

import java.util.ArrayList;
import java.util.List;

public class AddElementsInArray {
    public static void main(String[] args) {
        int[] solution = Solution2.solution(new int[]{5, 1, 4});

        for (int el : solution) {
            System.out.print(el + " ");
        }
    }
}

/*
 * == 배열의 원소만큼 추가하기 ==
 * 아무 원소도 들어있지 않은 빈 배열 X가 있습니다.
 * 양의 정수 배열 arr가 매개변수로 주어질 때,
 * arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에
 * a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.
 *
 * == 제한사항 ==
 * 1 ≤ arr의 길이 ≤ 100
 * 1 ≤ arr의 원소 ≤ 100
 *
 * == 입출력 예 ==
 * arr                  result
 * [5, 1, 4]            [5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
 * [6, 6]               [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
 * [1]                  [1]
 *
 */
class Solution2 {
    public static int[] solution(int[] arr) {
        int[] answer;

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                list.add(arr[i]);
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}