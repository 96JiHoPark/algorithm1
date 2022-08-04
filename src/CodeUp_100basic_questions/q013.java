//https://codeup.kr/problem.php?id=1014
//문자 2개 입력받아 순서 바꿔 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.printf("%s %s", b, a);
    }
}
