//https://codeup.kr/problem.php?id=1041
//문자 1개 입력받아 다음 문자 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char c = s.charAt(0);
        System.out.println(++c);
    }
}
