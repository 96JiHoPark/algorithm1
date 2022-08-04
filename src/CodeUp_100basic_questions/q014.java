//https://codeup.kr/problem.php?id=1015
//실수 입력받아 둘째 자리까지 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        System.out.printf("%.2f", f);
    }
}
