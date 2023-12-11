package programmers.day2;

public class OverlapString {
    public static void main(String[] args) {
        String result = Solution.solution("He11oWor1d", "lloWorl", 2);

        System.out.println(result);
    }
}

/*
 * 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
 * 문자열 overwrite_string으로 바꾼 문자열을
 * return 하는 solution 함수를 작성해 주세요.
 *
 * == 제한사항 ==
 *  my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
 * 1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
 * 0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
 *
 * == 입력 예 ==
 * my_string = "He11oWor1d"
 * overwrite_string = "lloWorl"
 * s = 2
 *
 * == 출력 예 ==
 * "HelloWorld"
 * */
class Solution {
    public static String solution(String my_string, String overwrite_string, int s) {
        String part_string = my_string.substring(0, s);
        String remaining_string = my_string.substring(s + overwrite_string.length());

        String result = part_string + overwrite_string + remaining_string;
        return result;
    }
}
