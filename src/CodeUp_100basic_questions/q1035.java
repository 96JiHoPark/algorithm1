//https://codeup.kr/problem.php?id=1035
//16진 정수 1개 입력받아 8진수로 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hex = scanner.next();
        int dec = Integer.parseInt(hex, 16);
        String oct = Integer.toOctalString(dec);
        System.out.println(oct);
    }
}
