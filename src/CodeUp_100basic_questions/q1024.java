//https://codeup.kr/problem.php?id=1024
//단어 1개 입력받아 나누어 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] arr = s.toCharArray();

        for(char c : arr){
            System.out.println("\'" + c + "\'");
        }
    }
}
