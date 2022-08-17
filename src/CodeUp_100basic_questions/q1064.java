//https://codeup.kr/problem.php?id=1064
//정수 3개 입력받아 가장 작은 수 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = a < b ? a : b;
        min = min < c ? min : c;
        System.out.println(min);
    }
}
