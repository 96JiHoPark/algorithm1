//https://codeup.kr/problem.php?id=1012
//실수 1개 입력받아 그대로 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        System.out.println(String.format("%.6f",f));
    }
}
