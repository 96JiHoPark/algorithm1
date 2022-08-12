//https://codeup.kr/problem.php?id=1056
//참/거짓이 서로 다를 때에만 참 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a!=b ? 1 : 0);
    }
}
