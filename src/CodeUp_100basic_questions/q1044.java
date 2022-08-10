//https://codeup.kr/problem.php?id=1044
//정수 1개 입력받아 1 더해 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        System.out.println(++a);
    }
}
