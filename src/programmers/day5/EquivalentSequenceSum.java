package programmers.day5;

public class EquivalentSequenceSum {
    public static void main(String[] args) {
        int solution = Solution2.solution(3, 4, new boolean[]{true, false, false, true, true});
        System.out.println(solution);
    }
}

/*
 * 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
 * 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
 * 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을
 * return 하는 solution 함수를 작성해 주세요.
 *
 * == 제한사항 ==
 * 1 ≤ a ≤ 100
 * 1 ≤ d ≤ 100
 * 1 ≤ included의 길이 ≤ 100
 * included에는 true가 적어도 하나 존재합니다.
 *
 * == 입력 예 ==
 * a=3
 * b=4
 * included = [true, false, false, true, true]
 * == 출력 예 ==
 * 37
 */
class Solution2 {
    public static int solution (int a, int d, boolean[] included) {
        int answer=0;
        int tmp = 0;

        for(int i=0; i<included.length; i++) {
            tmp=a+d*i;

            if(included[i] == true) {
               answer+=tmp;
            }
        }

        return answer;
    }
}