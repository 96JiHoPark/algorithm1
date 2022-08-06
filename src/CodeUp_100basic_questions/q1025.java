//https://codeup.kr/problem.php?id=1025
//정수 1개 입력받아 나누어 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] arr = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            System.out.print("[" + arr[i]);
            for(int j = 1; j < s.length() - i; j++){
                System.out.print("0");
            }
            System.out.println("]");
        }
    }




}
