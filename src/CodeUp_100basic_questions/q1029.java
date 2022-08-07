//https://codeup.kr/problem.php?id=1029
//실수 1개 입력받아 그대로 출력하기2

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        String s = String.format("%.11f",d);
        System.out.println(s);
    }
}