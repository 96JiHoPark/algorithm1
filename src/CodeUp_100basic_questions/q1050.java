//https://codeup.kr/problem.php?id=1050
//두 정수 입력받아 비교하기2

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a == b ? 1 : 0);
    }
}
