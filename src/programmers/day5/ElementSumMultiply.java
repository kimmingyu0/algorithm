package programmers.day5;

public class ElementSumMultiply {
    public static void main(String[] args) {
        int solution = Solution4.solution(new int[]{5, 7, 8, 3});
        System.out.println(solution);
    }
}

/*
 * 정수가 담긴 리스트 num_list가 주어질 때,
 * 모든 원소들의 곱이 모든 원소들의 합의
 * 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
 *
 * == 제한사항 ==
 * 2 ≤ num_list의 길이 ≤ 10
 * 1 ≤ num_list의 원소 ≤ 9
 *
 * == 입출력 예 ==
 * num_list	         result
 * [3, 4, 5, 2, 1]	 1
 * [5, 7, 8, 3]	     0
 *
 */

class Solution4 {
    public static int solution(int[] num_list) {
        int answer = 0;

        int sum = 0;
        int mul = 1;

        for(int el : num_list) {
            sum += el;
            mul *= el;
        }

        answer = sum*sum > mul ? 1 : 0;

        return answer;
    }
}
