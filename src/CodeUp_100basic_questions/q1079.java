//https://codeup.kr/problem.php?id=1079
//원하는 문자가 입력될 때까지 반복 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr = a.split(" ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            if(arr[i].equals("q"))
                break;
        }
    }
}
