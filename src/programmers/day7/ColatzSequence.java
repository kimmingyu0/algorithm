package programmers.day7;

import java.util.ArrayList;
import java.util.List;

public class ColatzSequence {
    public static void main(String[] args) {
        int[] solution = Solution4.solution(10);

        for (int el:solution) {
            System.out.print(el + " ");
        }
    }
}

/*
 * == 콜라츠 수열 만들기 ==
 * 모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고,
 * x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 계속해서 반복하면
 * 언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.
 * 그리고 위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라고 부릅니다.
 * 계산 결과 1,000 보다 작거나 같은 수에 대해서는 전부 언젠가 1에 도달한다는 것이 알려져 있습니다.
 * 임의의 1,000 보다 작거나 같은 양의 정수 n이 주어질 때
 * 초기값이 n인 콜라츠 수열을 return 하는 solution 함수를 완성해 주세요.
 *
 * == 제한사항 ==
 * 1 ≤ n ≤ 1,000
 *
 * == 입출력 예 ==
 * n	  result
 * 10	  [10, 5, 16, 8, 4, 2, 1]
 *
 */
class Solution4 {
    public static int[] solution(int n) {
        int num = n;
        List<Integer> arrList = new ArrayList<>();
        int count = 0;

        while(true) {
            if(num==n) {
                arrList.add(count, num);
                count++;
            }

            if(num%2==0) {
                num/=2;
            } else if (num%2==1){
                if(num==1) {
                    break;
                }
                num=num*3+1;
            }

            arrList.add(count, num);
            count++;
        }

        return arrList.stream().mapToInt(Integer::intValue).toArray();

    }
}

