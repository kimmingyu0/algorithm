package programmers.day16;

import java.util.ArrayList;
import java.util.List;

public class TransferStringCaseArray {
    public static void main(String[] args) {
        String[] strArr = {"AAA", "BBB", "CCC", "DDD"};

        String[] solution = Solution3.solution(strArr);
        for (String el : solution) {
            System.out.print(el + " ");
        }
    }
}

/*
 * == 배열에서 문자열 대소문자 변환하기 ==
 * 문자열 배열 strArr가 주어집니다.
 * 모든 원소가 알파벳으로만 이루어져 있을 때,
 * 배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로,
 * 짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서
 * 반환하는 solution 함수를 완성해 주세요.
 *
 * == 제한사항 ==
 * 1 ≤ strArr ≤ 20
 * 1 ≤ strArr의 원소의 길이 ≤ 20
 * strArr의 원소는 알파벳으로 이루어진 문자열 입니다.
 *
 * == 입출력 예 ==
 * strArr                          result
 * ["AAA","BBB","CCC","DDD"]       ["aaa","BBB","ccc","DDD"]
 * ["aBc","AbC"]                   ["abc","ABC"]
 *
 */
class Solution3 {
    public static String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i<strArr.length; i++) {
            if (i%2==0) {
                list.add(strArr[i].toLowerCase());
            } else {
                list.add(strArr[i].toUpperCase());
            }
        }

        return list.toArray(new String[0]);
    }
}