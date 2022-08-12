//https://codeup.kr/problem.php?id=1051
//두 정수 입력받아 비교하기3

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a <= b ? 1 : 0);
    }
}
