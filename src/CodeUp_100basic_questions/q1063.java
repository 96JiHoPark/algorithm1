//https://codeup.kr/problem.php?id=1063
//두 정수 입력받아 큰 수 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a > b ? a : b);
    }
}
