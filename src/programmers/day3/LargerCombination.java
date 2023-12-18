package programmers.day3;

public class LargerCombination {
    public static void main(String[] args) {
        int solution = Solution3.solution(8, 89);
        System.out.println(solution);
    }
}


/*
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다.
 * 예를 들면 다음과 같습니다.
 * 12 ⊕ 3 = 123
 * 3 ⊕ 12 = 312
 * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중
 * 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
 * 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
 *
 * == 제한사항 ==
 * 1 ≤ a, b < 10,000
 *
 * == 입력 예 ==
 * a = 9
 * b = 91
 *
 * == 출력 예 ==
 * a ⊕ b = 991 이고, b ⊕ a = 919 입니다.
 * 둘 중 더 큰 값은 991 이므로 991을 return 합니다.
 * */
class Solution3 {
    public static int solution (int a, int b) {
        int answer = 0;

        String tmp1 = String.valueOf(a)+String.valueOf(b);
        String tmp2 = String.valueOf(b)+String.valueOf(a);

        int first = Integer.parseInt(tmp1);
        int second = Integer.parseInt(tmp2);

        if(first<second) {
            answer = second;
        } else if (second<first) {
            answer = first;
        } else if (first == second ){
            answer = first;
        }

        return answer;
    }
}