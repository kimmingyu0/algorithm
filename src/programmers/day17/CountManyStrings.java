package programmers.day17;

public class CountManyStrings {
    public static void main(String[] args) {
        int solution = Solution2.solution("banana", "ana");

        System.out.println(solution);
    }
}


/*
 * == 문자열이 몇 번 등장하는지 세기 ==
 * 문자열 myString과 pat이 주어집니다.
 * myString에서 pat이 등장하는 횟수를
 * return 하는 solution 함수를 완성해 주세요.
 *
 * == 제한사항 ==
 * 1 ≤ myString ≤ 1000
 * 1 ≤ pat ≤ 10
 *
 * == 입출력 예 ==
 * myString      pat     result
 * "banana"      "ana"   2
 * "aaaa"        "aa"    3
 *
 */
class Solution2 {
    public static int solution(String myString, String pat) {
        int answer = 0;

        for(int i = myString.length()-1; i>=0; i--){
            String subStr = myString.substring(0, i+1);
            if(subStr.endsWith(pat)){
                answer++;
            }
        }

        return answer;
    }
}