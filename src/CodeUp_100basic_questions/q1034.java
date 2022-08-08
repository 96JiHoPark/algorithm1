//https://codeup.kr/problem.php?id=1034
//8진 정수 1개 입력받아 10진수로 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oct = scanner.next();
        int dec = Integer.parseInt(oct, 8);
        System.out.println(dec);
    }
}
