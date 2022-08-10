//https://codeup.kr/problem.php?id=1045
//정수 2개 입력받아 자동 계산하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        a = Math.max(a,b);
        b = Math.min(a,b);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        double c = a, d = b;
        System.out.println(String.format("%.2f",c/d));
    }
}
