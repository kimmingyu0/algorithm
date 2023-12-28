package programmers.day8;

public class FlipStringMultiple {
    public static void main(String[] args) {
        String solution = Solution4.solution("rermgorpsam", new int[][]{{2,3},{0,7},{5,9},{6,10}});
        System.out.println(solution);
    }
}

/*
 * == 문자열 여러 번 뒤집기 ==
 * 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
 * queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터
 * 인덱스 e까지를 뒤집으라는 의미입니다. my_string에 queries의 명령을
 * 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
 *
 * == 제한사항 ==
 * my_string은 영소문자로만 이루어져 있습니다.
 * 1 ≤ my_string의 길이 ≤ 1,000
 * queries의 원소는 [s, e]의 형태로 0 ≤ s ≤ e < my_string의 길이를 만족합니다.
 * 1 ≤ queries의 길이 ≤ 1,000
 *
 * == 입출력 예 ==
 * my_string	     queries	                          result
 * "rermgorpsam"	 [[2, 3], [0, 7], [5, 9], [6, 10]]	  "programmers"
 *
 */
class Solution4 {
    public static String solution(String my_string, int[][] queries) {
        String answer = my_string;

        int startIdx = 0;
        int endIdx = 0;
        char tmp;

        for (int i = 0; i<queries.length; i++) {
            String exchange = "";
            String firstStr = "";
            String lastStr = "";

            startIdx = queries[i][0];
            endIdx = queries[i][1];
            firstStr=answer.substring(0, startIdx);
            lastStr=answer.substring(endIdx+1);

            for(int j = endIdx; startIdx<=j; j--) {
                tmp = answer.charAt(j);
                exchange+=tmp;
            }

            answer=firstStr+exchange+lastStr;
        }
        return answer;
    }
}
