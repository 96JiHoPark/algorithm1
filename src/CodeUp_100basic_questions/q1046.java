//https://codeup.kr/problem.php?id=1046
//정수 3개 입력받아 합과 평균 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        long sum = a + b + c;
        double avg = Double.parseDouble(sum+"")/3;
        System.out.println(sum + "\n" + String.format("%.1f",avg));
    }
}
