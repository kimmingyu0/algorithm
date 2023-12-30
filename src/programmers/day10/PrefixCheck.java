package programmers.day10;

import java.util.ArrayList;
import java.util.List;

public class PrefixCheck {
    public static void main(String[] args) {
        int test1 = Solution2.solution("banana", "ban");
        System.out.println(test1);

        int test2 = Solution2.solution("banana", "monkey");
        System.out.println(test2);
    }
}

/*
 * == 접두사인지 확인하기 ==
 * 어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다.
 * 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
 *
 * 문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을,
 * 아니면 0을 return 하는 solution 함수를 작성해 주세요.
 *
 * == 제한사항 ==
 * 1 ≤ my_string의 길이 ≤ 100
 * 1 ≤ is_prefix의 길이 ≤ 100
 * my_string과 is_prefix는 영소문자로만 이루어져 있습니다.
 *
 * == 입출력 예 ==
 * my_string	is_prefix	result
 * "banana"	    "ban"	    1
 * "banana"	    "nan"	    0
 * "banana"	    "abcd"	    0
 * "banana"	    "bananan"	0
 *
 */
class Solution2 {
    public static int solution(String my_string, String is_prefix) {
        String prefix = "";
        List<String> list = new ArrayList<>();

        for (int i = 0; i<my_string.length(); i++) {
            prefix = my_string.substring(0, i);
            list.add(prefix);
        }

        return list.contains(is_prefix) ? 1 : 0;
    }
}