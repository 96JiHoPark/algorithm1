//https://codeup.kr/problem.php?id=1023
//실수 1개 입력받아 부분별로 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] arr = s.split("\\.");
        System.out.printf("%s\n%s", arr[0], arr[1]);
    }
}
