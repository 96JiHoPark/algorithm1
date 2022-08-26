//https://codeup.kr/problem.php?id=1076
//문자 1개 입력받아 알파벳 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        char b = a.charAt(0);
        char c = 'a';
        while(b >= c){
            System.out.print(c);
            if(b != c) System.out.print(" ");
            c++;
        }
    }
}
