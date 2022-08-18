//https://codeup.kr/problem.php?id=1067
//정수 1개 입력받아 분석하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a >= 0){
            System.out.println("plus");
        }else{
            System.out.println("minus");
        }

        if (a % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
