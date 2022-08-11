//https://codeup.kr/problem.php?id=1048
//한 번에 2의 거듭제곱 배로 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a<<b);
    }
}
