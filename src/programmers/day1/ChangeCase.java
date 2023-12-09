package programmers.day1;

public class ChangeCase {
    public static void main(String[] args) {

        String str = "aBcDeFg";

        String result = "AbCdEfG";

        String myResult =  Solution.solution(str);

        if (result.equals(myResult)) {
            System.out.printf("실행 결과 > 테스트를 통과하였습니다.");
        } else {
            System.out.print("테스트 실패");
        }
    }
}

/*
 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
 * 각 알파벳을 대문자는 소문자로 소문자는 대문자로
 * 변환해서 출력하는 코드를 작성해 보세요.
 *
 * == 제한사항 ==
 * 1 ≤ str의 길이 ≤ 20
 * str은 알파벳으로 이루어진 문자열입니다.
 *
 * == 입력 예 ==
 * aBcDeFg
 *
 * == 출력 예 ==
 * AbCdEfG
 * */
class Solution {
    public static String solution(String str) {

        char tmp;
        String result="";

        for(int i = 0; i<str.length(); i++) {
            tmp=str.charAt(i);

            if((65<=tmp)&&(tmp<=90)){
                result+=str.valueOf(tmp).toLowerCase();

            } else if((97<=tmp)&&(tmp<=122)){
                result+=str.valueOf(tmp).toUpperCase();
            }
        }

        System.out.println(result);

        return result;
    }
}
