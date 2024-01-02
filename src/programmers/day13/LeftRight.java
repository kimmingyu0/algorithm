package programmers.day13;

public class LeftRight {
    public static void main(String[] args) {
        String[] solution = Solution3.solution(new String[]{"u", "u", "l", "r"});

        for (String el : solution) {
            System.out.print(el + " ");
        }
    }
}

/*
 * == 왼쪽 오른쪽 ==
 * 문자열 리스트 str_list에는 "u", "d", "l", "r"
 * 네 개의 문자열이 여러 개 저장되어 있습니다.
 * str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면
 * 해당 문자열을 기준으로 왼쪽에 있는 문자열들을
 * 순서대로 담은 리스트를, 먼저 나오는 문자열이 "r"이라면
 * 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은
 * 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * "l"이나 "r"이 없다면 빈 리스트를 return합니다.
 *
 * == 제한사항 ==
 * 1 ≤ str_list의 길이 ≤ 20
 * str_list는 "u", "d", "l", "r" 네 개의 문자열로 이루어져 있습니다.
 *
 * == 입출력 예 ==
 * str_list                 result
 * ["u", "u", "l", "r"]     ["u", "u"]
 * ["l"]                    []
 *
 */
class Solution3 {
    public static String[] solution(String[] str_list) {

        String[] tmp = new String[str_list.length];
        int count=0;

        for (int i=0; i<str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for (int j=0;j<i;j++) {
                    tmp[count]=str_list[j];
                    count++;
                }
                break;
            } else if (str_list[i].equals("r")) {
                for (int j=i+1;j<str_list.length;j++) {
                    tmp[count]=str_list[j];
                    count++;
                }
                break;
            }
        }

        String[] answer=new String[count];

        for (int i=0; i<count; i++) {
            answer[i]=tmp[i];
        }

        return answer;
    }
}