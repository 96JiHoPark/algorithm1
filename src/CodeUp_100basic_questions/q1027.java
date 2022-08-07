//https://codeup.kr/problem.php?id=1027
//년월일 입력 받아 형식 바꿔 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;
import java.util.StringTokenizer;

public class q1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringTokenizer st = new StringTokenizer(s, ".");
        String year = st.nextToken();
        String month = st.nextToken();
        String day = st.nextToken();

        System.out.print(day + "-" + month + "-" + year);

    }
}
