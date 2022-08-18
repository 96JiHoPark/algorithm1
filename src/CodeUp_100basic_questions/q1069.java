//https://codeup.kr/problem.php?id=1069
//평가 입력받아 다르게 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        switch (a){
            case "A":
                System.out.println("best!!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
                break;
        }
    }
}
