package programmers.day20;

import java.util.Arrays;

public class StringTie {
    public static void main(String[] args) {
        String[] strArr = {"a", "bc", "d", "efg", "hi"};

        int solution = Solution3.solution(strArr);
        System.out.println(solution);
    }
}

/*
 * == 문자열 묶기 ==
 * 문자열 배열 strArr이 주어집니다.
 * strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때
 * 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
 *
 * == 제한사항 ==
 * 1 ≤ strArr의 길이 ≤ 100,000
 * 1 ≤ strArr의 원소의 길이 ≤ 30
 * strArr의 원소들은 알파벳 소문자로 이루어진 문자열입니다.
 *
 * == 입출력 예 ==
 * strArr                        result
 * ["a","bc","d","efg","hi"]     2
 *
 */
class Solution3 {
    public static int solution(String[] strArr) {
        int[] count = new int[100000];

        for(int i = 0 ; i < strArr.length; i++) {
            count[strArr[i].length()]++;
        }

        return Arrays.stream(count).max().getAsInt();
    }
}