//https://codeup.kr/problem.php?id=1060
//비트단위로 AND 하여 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a & b);
    }
}
