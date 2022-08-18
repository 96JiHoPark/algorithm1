//https://codeup.kr/problem.php?id=1070
//월 입력받아 계절 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int season = scanner.nextInt();
        switch (season){
            case 12: case 1: case 2:
                System.out.println("winter");
                break;
            case 3: case 4: case 5:
                System.out.println("spring");
                break;
            case 6: case 7: case 8:
                System.out.println("summer");
                break;
            default:
                System.out.println("fall");
                break;
        }
    }
}
