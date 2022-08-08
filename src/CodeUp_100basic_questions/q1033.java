//https://codeup.kr/problem.php?id=1033
//10진 정수 입력받아 16진수로 출력하기2

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(Integer.toHexString(i).toUpperCase());
    }
}
