package programmers.day11;

public class CountDown {
    public static void main(String[] args) {
        int[] solution = Solution4.solution(10, 3);

        for (int el : solution) {
            System.out.print(el + " ");
        }
    }
}

/*
 * == 카운트 다운 ==
 * 정수 start_num와 end_num가 주어질 때,
 * start_num에서 end_num까지 1씩 감소하는 수들을
 * 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * == 제한사항 ==
 * 0 ≤ end_num ≤ start_num ≤ 50
 *
 * == 입출력 예 ==
 * start_num     end_num	result
 * 10            3          [10, 9, 8, 7, 6, 5, 4, 3]
 *
 */
class Solution4 {
    public static int[] solution(int start, int end_num) {
        int diff = start-end_num;

        int[] answer = new int[start-end_num+1];

        int el = start;
        for (int i = 0; i<=diff; i++) {
            answer[i] = el;
            el--;
        }

        return answer;
    }
}