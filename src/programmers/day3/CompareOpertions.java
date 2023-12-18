package programmers.day3;

public class CompareOpertions {
    public static void main(String[] args) {
        int solution = Solution4.solution(2, 91);
        System.out.println(solution);
    }
}

/*
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
 * 12 ⊕ 3 = 123
 * 3 ⊕ 12 = 312
 * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
 * 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
 *
 * == 제한사항 ==
 * 1 ≤ a, b < 10,000
 *
 * == 입력 예 ==
 * a = 2
 * b = 91
 *
 * == 출력 예 ==
 * a ⊕ b = 291 이고, 2 * a * b = 364 입니다.
 * 둘 중 더 큰 값은 364 이므로 364를 return 합니다.
 * */
class Solution4 {
    public static int solution (int a, int b) {
        int answer = 0;

        String transferString = String.valueOf(a) + String.valueOf(b);

        int plusInt = Integer.parseInt(transferString);
        int calInt = 2 * a * b;

        if(plusInt<calInt) {
            answer = calInt;
        } else {
            answer = plusInt;
        }

        return answer;
    }
}