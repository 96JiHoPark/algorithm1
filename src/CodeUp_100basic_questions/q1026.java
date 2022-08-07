//https://codeup.kr/problem.php?id=1026
//시분초 입력받아 분만 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;
import java.util.StringTokenizer;

public class q1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        StringTokenizer st = new StringTokenizer(s, ":");
        String hour = st.nextToken();
        String minute = st.nextToken();
        String second = st.nextToken();

        System.out.print(minute.equals("00") ? 0 : minute);
    }
}
