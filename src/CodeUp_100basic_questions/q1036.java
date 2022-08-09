//https://codeup.kr/problem.php?id=1036
//영문자 1개 입력받아 10진수로 출력하기

package CodeUp_100basic_questions;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class q1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        System.out.println(((int)c));
    }
}
