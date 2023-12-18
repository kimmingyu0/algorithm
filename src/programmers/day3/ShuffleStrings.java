package programmers.day3;

public class ShuffleStrings {
    public static void main(String[] args) {
        String solution = Solution1.solution("aaaaa", "bbbbb");
        System.out.println(solution);
    }
}

/*
 * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
 * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서
 * 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
 *
 * == 제한사항 ==
 * 1 ≤ str1의 길이 = str2의 길이 ≤ 10
 * str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
 *
 * == 입력 예 ==
 * str1	 = "aaaaa"
 * str2 = "bbbbb"
 *
 * == 출력 예 ==
 * "ababababab"
 * */
class Solution1 {
    public static String solution (String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int lenStr1 = str1.length();
        int lenStr2 = str2.length();
        int maxLength = Math.max(lenStr1, lenStr2);

        for (int i = 0; i < maxLength; i++) {
            if (i < lenStr1) {
                result.append(str1.charAt(i));
            }
            if (i < lenStr2) {
                result.append(str2.charAt(i));
            }
        }
        return result.toString();
    }

}
