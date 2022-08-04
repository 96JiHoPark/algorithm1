//https://codeup.kr/problem.php?id=1019
//연월일 입력받아 그대로 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] arr = s.split("\\.");
        int a = Integer.valueOf(arr[0]);
        int b = Integer.valueOf(arr[1]);
        int c = Integer.valueOf(arr[2]);
        System.out.printf("%04d, %02d, %02d", a, b, c);
    }
}
