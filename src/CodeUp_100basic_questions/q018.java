//https://codeup.kr/problem.php?id=1020
//주민번호 입력받아 형태 바꿔 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        s = s.replace("-","");
        System.out.println(s);
    }
}
