//https://codeup.kr/problem.php?id=1072
//정수 입력받아 계속 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i : arr){
            System.out.println(i);
        }
    }
}
