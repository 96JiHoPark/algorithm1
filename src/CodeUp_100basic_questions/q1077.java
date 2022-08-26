//https://codeup.kr/problem.php?id=1077
//정수 1개 입력받아 그 수까지 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1077 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i = 0; i <= a; i++){
            System.out.println(i);
        }
    }
}
