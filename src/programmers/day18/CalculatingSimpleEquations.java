package programmers.day18;

public class CalculatingSimpleEquations {
    public static void main(String[] args) {
        int solution = Solution3.solution("40000 * 40000");

        System.out.println(solution);
    }
}

/*
 * == 간단한 식 계산하기 ==
 * 문자열 binomial이 매개변수로 주어집니다.
 * binomial은 "a op b" 형태의 이항식이고
 * a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다.
 * 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
 *
 * == 제한사항 ==
 * 0 ≤ a, b ≤ 40,000
 * 0을 제외하고 a, b는 0으로 시작하지 않습니다.
 *
 * == 입출력 예 ==
 * binomial            result
 * "43 + 12"           55
 * "0 - 7777"          -7777
 * "40000 * 40000"     1600000000
 *
 */
class Solution3 {
    public static int solution(String binomial) {
        int answer = 0;

        String[] argArr = binomial.split(" ");

        int first = Integer.parseInt(argArr[0]);
        int second = Integer.parseInt(argArr[2]);

        if (argArr[1].charAt(0) == '+') {
            answer=first+second;
        } else if (argArr[1].charAt(0) == '-') {
            answer=first-second;
        } else {
            answer=first*second;
        }


        return answer;
    }
}