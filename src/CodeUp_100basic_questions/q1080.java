//https://codeup.kr/problem.php?id=1080
//언제까지 더해야 할까?

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        int i = 0;
        while(sum < a){
            i++;
            sum += i;
        }
        System.out.println(i);
    }
}
