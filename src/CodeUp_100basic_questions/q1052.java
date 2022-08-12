//https://codeup.kr/problem.php?id=1052
//두 정수 입력받아 비교하기4

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a != b ? 1 : 0);
    }
}
