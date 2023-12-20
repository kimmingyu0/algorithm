package programmers.day5;

public class ConcatNumber {
    public static void main(String[] args) {
        int solution = Solution5.solution(new int[]{3, 4, 5, 2, 1});
        System.out.println(solution);
    }
}

/*
 * 정수가 담긴 리스트 num_list가 주어집니다.
 * num_list의 홀수만 순서대로 이어 붙인 수와
 * 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * == 제한사항 ==
 * 2 ≤ num_list의 길이 ≤ 10
 * 1 ≤ num_list의 원소 ≤ 9
 * num_list에는 적어도 한 개씩의 짝수와 홀수가 있습니다.
 *
 * == 입출력 예 ==
 * num_list          result
 * [3, 4, 5, 2, 1]	 393
 * [5, 7, 8, 3]	     581
 *
 */
class Solution5 {
    public static int solution(int[] num_list) {
        int answer = 0;

        String odd = ""; // 홀수
        String even = ""; // 짝수

        for(int el : num_list) {
            if(el%2==1) {
                odd += String.valueOf(el);
            } else {
                even += String.valueOf(el);
            }
        }

        answer = Integer.parseInt(odd) + Integer.parseInt(even);

        return answer;
    }
}
