//https://codeup.kr/problem.php?id=1031
//10진 정수 1개 입력받아 8진수로 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(Integer.toOctalString(i));
    }
}
