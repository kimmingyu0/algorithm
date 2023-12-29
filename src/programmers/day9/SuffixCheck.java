package programmers.day9;

import java.util.ArrayList;
import java.util.List;

public class SuffixCheck {
    public static void main(String[] args) {
        int result = Solution5.solution("banana", "ana");

        System.out.println(result);
    }
}

/*
 * == 접미사인지 확인하기 ==
 * 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
 * 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
 *
 * 문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을,
 * 아니면 0을 return 하는 solution 함수를 작성해 주세요.
 *
 * == 제한사항 ==
 * 1 ≤ my_string의 길이 ≤ 100
 * 1 ≤ is_suffix의 길이 ≤ 100
 * my_string과 is_suffix는 영소문자로만 이루어져 있습니다.
 *
 * == 입출력 예 ==
 * my_string	is_suffix	 result
 * "banana"	    "ana"	     1
 * "banana"	    "nan"	     0
 * "banana"	    "wxyz"	     0
 * "banana"	    "abanana"	 0
 *
 */
class Solution5 {
    public static int solution(String my_string, String is_suffix) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i<my_string.length(); i++) {
            list.add(my_string.substring(i));
        }

        return list.contains(is_suffix) ? 1 : 0;
    }
}