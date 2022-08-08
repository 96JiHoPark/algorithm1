//https://codeup.kr/problem.php?id=1032
//10진 정수 입력받아 16진수로 출력하기1

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(Integer.toHexString(i));
    }
}
