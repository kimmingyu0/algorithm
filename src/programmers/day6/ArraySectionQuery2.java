package programmers.day6;

public class ArraySectionQuery2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0,3,2}, {0,2,2}};

        int[] result = Solution5.solution(arr, queries);

        for (int value : result) {
            System.out.println(value);
        }
    }
}

/*
 * == 수열과 구간 쿼리2 ==
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
 * queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
 * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서
 * 가장 작은 arr[i]를 찾습니다.
 * 각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
 * 단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
 *
 * == 제한사항 ==
 * 1 ≤ arr의 길이 ≤ 1,000
 * 0 ≤ arr의 원소 ≤ 1,000,000
 * 1 ≤ queries의 길이 ≤ 1,000
 * 0 ≤ s ≤ e < arr의 길이
 * 0 ≤ k ≤ 1,000,000
 *
 * == 입출력 예 ==
 * arr	            queries	                          result
 * [0, 1, 2, 4, 3]	[[0, 4, 2],[0, 3, 2],[0, 2, 2]]	  [3, 4, -1]
 *
 */
class Solution5 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        int[] tmp;

        int standard = 0; // k
        int small = 0; // s
        int lazy = 0; // e
        // queries => {{s,e,k}, {s,e,k}...}
        // query => {s,e,k}

        for(int i = 0; i<queries.length; i++) {
            tmp=queries[i];
            //tmp = {s,e,k}

            small = tmp[0];
            lazy = tmp[1];
            standard = tmp[2];

            int minGreaterValue = Integer.MAX_VALUE;

            for (int j = small; j <= lazy; j++) {
                if (arr[j] > standard && arr[j] < minGreaterValue) {
                    minGreaterValue = arr[j];
                }
            }

            answer[i] = (minGreaterValue == Integer.MAX_VALUE) ? -1 : minGreaterValue;
        }

        return answer;
    }
}
