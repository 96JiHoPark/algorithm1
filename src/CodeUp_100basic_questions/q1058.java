//https://codeup.kr/problem.php?id=1058
//둘 다 거짓일 경우만 참 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println( (a == 0 && b == 0) ? 1 : 0);
    }
}
