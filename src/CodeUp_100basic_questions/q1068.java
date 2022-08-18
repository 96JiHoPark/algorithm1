//https://codeup.kr/problem.php?id=1068
//정수 1개 입력받아 평가 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 90){
            System.out.println("A");
        }else if(a >= 70){
            System.out.println("B");
        }else if(a >= 40){
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }
}
