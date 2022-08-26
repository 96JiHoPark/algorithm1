//https://codeup.kr/problem.php?id=1078
//짝수 합 구하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        for(int i = 2; i <= a; i+=2){
            sum += i;
        }
        System.out.println(sum);

    }
}
