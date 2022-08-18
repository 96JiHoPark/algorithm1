//https://codeup.kr/problem.php?id=1066
//정수 3개 입력받아 짝/홀 출력하기

package CodeUp_100basic_questions;

import java.util.Scanner;

public class q1066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i : arr){
            if(i % 2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }


    }
}
