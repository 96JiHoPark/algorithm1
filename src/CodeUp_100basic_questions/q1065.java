//https://codeup.kr/problem.php?id=1065
//정수 3개 입력받아 짝수만 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i : arr){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
