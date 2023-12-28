package programmers.day8;

public class DiceGame3 {
    public static void main(String[] args) {
        int solution = Solution5.solution(2, 2, 2, 2);
        System.out.println(solution);
    }
}

/*
 * == 주사위 게임 3 ==
 * 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다.
 * 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
 * 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
 * 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가
 * q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
 *
 * 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를
 * 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
 *
 * 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서
 * 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
 * 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
 * 네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때,
 * 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 *
 * == 제한사항 ==
 * a, b, c, d는 1 이상 6 이하의 정수입니다.
 *
 * == 입출력 예 ==
 * a	b	c	d	result
 * 2	2	2	2	2222
 * 4	1	4	4	1681
 * 6	3	3	6	27
 * 2	5	2	6	30
 * 6	4	2	5	2
 *
 */
class Solution5 {
    public static int solution(int a, int b, int c, int d) {
        if (a == b && b == c && c == d) { // abcd 모두 같다면
            return 1111 * a;
        } else if (a == b && b == c) { // abc만 같다면
            return ((10 * a + d) * (10 * a + d));
        } else if (a == c && c == d) { // acd만 같다면
            return ((10 * a + b) * (10 * a + b));
        } else if (a == b && b == d) { // abd만 같다면
            return ((10 * a + c) * (10 * a + c));
        } else if (b == c && c == d) { // bcd만 같다면
            return ((10 * b + a) * (10 * b + a));
        } else if (a == b && c == d) { // ab가 같고 cd가 같다면
            return ((a + c) * (Math.abs(a - c)));
        } else if (a == c && b == d) { // ac가 같고 bd가 같다면
            return ((a + b) * (Math.abs(a - b)));
        } else if (a == d && b == c) { // ad가 같고 bc가 같다면
            return ((a + b) * (Math.abs(a - b)));
        } else if (a == b && c != d) { // ab가 같고 cd가 다르다면
            return (c * d);
        } else if (a == c && b != d) { // ac가 같고 bd가 다르다면
            return (b * d);
        } else if (a == d && b != c) { // ad가 같고 bc가 다르다면
            return (b * c);
        } else if (b == c && a != d) { // bc가 같고 ad가 다르다면
            return (a * d);
        } else if (b == d && a != c) { // bd가 같고 ac가 다르다면
            return (a * c);
        } else if (c == d && a != b) { // cd가 같고 ab가 다르다면
            return (a * b);
        } else {
            return Math.min(Math.min(a, b), Math.min(c, d));
        }
    }
}
