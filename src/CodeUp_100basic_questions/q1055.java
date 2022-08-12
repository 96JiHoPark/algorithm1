//https://codeup.kr/problem.php?id=1055
//하나라도 참이면 참 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a == 1 || b == 1) ? 1 : 0);
    }
}
