package programmers.day19;

import java.util.ArrayList;
import java.util.List;

public class ThreeDifferentiators {
    public static void main(String[] args) {
        String myStr = "baconlettucetomato";

        String[] solution = Solution1.solution(myStr);
        for (String el : solution) {
            System.out.print(el + " ");
        }
    }
}

/*
 * == 세 개의 구분자 ==
 * 임의의 문자열이 주어졌을 때 문자 "a", "b", "c"를
 * 구분자로 사용해 문자열을 나누고자 합니다.
 *
 * 예를 들어 주어진 문자열이 "baconlettucetomato"라면
 * 나눠진 문자열 목록은 ["onlettu", "etom", "to"] 가 됩니다.
 *
 * 문자열 myStr이 주어졌을 때 위 예시와 같이 "a", "b", "c"를 사용해
 * 나눠진 문자열을 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 단, 두 구분자 사이에 다른 문자가 없을 경우에는 아무것도 저장하지 않으며,
 * return할 배열이 빈 배열이라면 ["EMPTY"]를 return 합니다.
 *
 * == 제한사항 ==
 * 1 ≤ myStr의 길이 ≤ 1,000,000
 * myStr은 알파벳 소문자로 이루어진 문자열 입니다.
 *
 * == 입출력 예 ==
 * myStr                      result
 * "baconlettucetomato"       ["onlettu", "etom", "to"]
 * "abcd"                     ["d"]
 * "cabab"                    ["EMPTY"]
 *
 */
class Solution1 {
    public static String[] solution(String myStr) {
        List<String> list = new ArrayList<>();

        String temp = "";

        for(int i = 0 ; i<myStr.length(); i++){
            char value = myStr.charAt(i);

            if(value == 'a' || value == 'b' || value == 'c'){
                if(temp != ""){
                    list.add(temp);
                    temp = "";
                }
            } else {
                temp += value;
            }
        }

        if(temp != ""){
            list.add(temp);
        }

        if(list.size() == 0) {
            list.add("EMPTY");
        }

        return list.toArray(new String[0]);
    }
}