//https://school.programmers.co.kr/learn/courses/30/lessons/86051
//없는 숫자 더하기

package programmers.level1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q86051 {
    public static void main(String[] args) {
        Solution86051 solution = new Solution86051();
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int result = solution.solution(numbers);
        System.out.println(result);
    }
}

class Solution86051 {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int number : numbers){
            answer -= number;
        }
        return answer;
    }
}


