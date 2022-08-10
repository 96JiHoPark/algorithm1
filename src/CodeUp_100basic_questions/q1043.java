//https://codeup.kr/problem.php?id=1043
//정수 2개 입력받아 나눈 나머지 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a%b);
    }
}
