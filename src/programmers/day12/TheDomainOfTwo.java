package programmers.day12;

import java.util.ArrayList;
import java.util.List;

public class TheDomainOfTwo {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 1, 4, 5, 2, 9};

        int[] solution = Solution4.solution(arr);
        for (int el : solution) {
            System.out.print(el + " ");
        }
    }
}

/*
 * == 2의 영역 ==
 * 정수 배열 arr가 주어집니다.
 * 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을
 * return 하는 solution 함수를 완성해 주세요.
 *
 * 단, arr에 2가 없는 경우 [-1]을 return 합니다.
 *
 * == 제한사항 ==
 * 1 ≤ arr의 길이 ≤ 100,000
 * 1 ≤ arr의 원소 ≤ 10
 *
 * == 입출력 예 ==
 * arr                         result
 * [1, 2, 1, 4, 5, 2, 9]       [2, 1, 4, 5, 2]
 * [1, 2, 1]                   [2]
 * [1, 1, 1]                   [-1]
 * [1, 2, 1, 2, 1, 10, 2, 1]   [2, 1, 2, 1, 10, 2]
 *
 */
class Solution4 {
    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int startIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (startIndex == -1) {
                    startIndex = i;
                }
                lastIndex = i;
            }
        }

        if (startIndex == -1) {
            list.add(-1);
        } else {
            for (int i = startIndex; i <= lastIndex; i++) {
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}