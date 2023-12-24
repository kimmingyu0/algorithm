package programmers.day6;

public class ArraySectionQuery3 {
    public static void main(String[] args) {
        int[] solution = Solution4.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}});
        for(int el : solution) {
            System.out.println(el);
        }
    }
}

/*
 * == 수열과 구간 쿼리3 ==
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
 * queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
 * 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
 * 위 규칙에 따라 queries를 처리한 이후의 arr를
 * return 하는 solution 함수를 완성해 주세요.
 *
 * == 제한사항 ==
 * 1 ≤ arr의 길이 ≤ 1,000
 * 0 ≤ arr의 원소 ≤ 1,000,000
 * 1 ≤ queries의 길이 ≤ 1,000
 * 0 ≤ i < j < arr의 길이
 *
 * == 입출력 예 ==
 * arr	            queries	                result
 * [0, 1, 2, 3, 4]	[[0, 3],[1, 2],[1, 4]]	[3, 4, 1, 0, 2]
 *
 */
class Solution4 {
    public static int[] solution (int[] arr, int[][] queries) {
        int[] answer=arr;

        int[] tmpQuery;

        int preEl;
        int nextEl;

        for (int i=0; i<queries.length; i++) {
            tmpQuery=queries[i];

            preEl = answer[tmpQuery[0]];
            nextEl = answer[tmpQuery[1]];

            answer[tmpQuery[0]] = nextEl;
            answer[tmpQuery[1]] = preEl;
        }
        return answer;
    }
}
