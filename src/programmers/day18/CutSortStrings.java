package programmers.day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CutSortStrings {
    public static void main(String[] args) {
        String[] solution = Solution2.solution("axbxcxdx");

        for (String el : solution) {
            System.out.print(el + " ");
        }
    }
}

/*
 * == 문자열 잘라서 정렬하기 ==
 * 문자열 myString이 주어집니다.
 * "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후
 * 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 단, 빈 문자열은 반환할 배열에 넣지 않습니다.
 *
 * == 제한사항 ==
 * 1 ≤ myString ≤ 100,000
 * myString은 알파벳 소문자로 이루어진 문자열입니다.
 *
 * == 입출력 예 ==
 * myString           result
 * "axbxcxdx"         ["a","b","c","d"]
 * "dxccxbbbxaaaa"    ["aaaa","bbb","cc","d"]
 *
 */
class Solution2 {
    public static String[] solution(String myString) {
        String[] parts = myString.split("x", -1);
        List<String> partList = new ArrayList<>();

        for (String part : parts) {
            if (!part.isEmpty()) {
                partList.add(part);
            }
        }

        Collections.sort(partList);

        return partList.toArray(new String[0]);
    }
}