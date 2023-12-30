package programmers.day10;

public class VerticalRead {
    public static void main(String[] args) {
        String solution = Solution4.solution("ihrhbakrfpndopljhygc", 4, 2);
        System.out.println(solution);
    }
}

/*
 * == 세로 읽기 ==
 * 문자열 my_string과 두 정수 m, c가 주어집니다.
 * my_string을 한 줄에 m 글자씩 가로로 적었을 때
 * 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로
 * return 하는 solution 함수를 작성해 주세요.
 *
 * == 제한사항 ==
 * my_string은 영소문자로 이루어져 있습니다.
 * 1 ≤ m ≤ my_string의 길이 ≤ 1,000
 * m은 my_string 길이의 약수로만 주어집니다.
 * 1 ≤ c ≤ m
 *
 * == 입출력 예 ==
 * my_string	            m	  c	   result
 * "ihrhbakrfpndopljhygc"	4	  2	   "happy"
 * "programmers"	        1	  1	   "programmers"
 *
 */
class Solution4 {
    public static String solution(String my_string, int m, int c) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_string.length(); i += m) {
            int endIndex = Math.min(i + c, i + m);
            result.append(my_string, endIndex - 1, endIndex);
        }

        return result.toString();
    }
}