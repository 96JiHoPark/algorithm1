//https://codeup.kr/problem.php?id=1071
//0 입력될 때까지 무한 출력하기1

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr = s.split(" ");
        for(String str : arr){
            if (str.equals("0")){
                break;
            }
            System.out.println(str);
        }
    }
}
