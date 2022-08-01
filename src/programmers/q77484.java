//https://school.programmers.co.kr/learn/courses/30/lessons/77484#fn1
//로또의 최고 순위와 최저 순위

package programmers;

public class q77484 {
    public static void main(String[] args) {
//        int[] lottos = {44,1,0,0,31,25};
        int[] lottos = {45, 4, 35, 20, 3, 9};
//        int[] win_nums = {31,10,45,1,6,19};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        int[] result = solution(lottos,win_nums);

        System.out.println(result[0] + " " + result[1]);

    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int best = 0, worst = 0;
        for(int i = 0; i < win_nums.length; i++){
            for(int j = 0; j < lottos.length; j++){
                if(win_nums[i] == lottos[j]){
                    best++; worst++;
                    lottos = removeElement(lottos, j);
                    win_nums = removeElement(win_nums, i);
                    i = Math.max(i-1, -1);
                    j = Math.max(j-1, -1);
                    break;
                } else if(lottos[j] == 0){
                    best++;
                    lottos = removeElement(lottos, j);
                    j = Math.max(j-1, -1);
                }
            }
        }
        return new int[] {numToRank(best), numToRank(worst)};
    }

    public static int[] removeElement(int[] arr, int index){
        int[] copy = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++){
            if(i == index){
                continue;
            }
            copy[j++] = arr[i];
        }
        return copy;
    }

    public static int numToRank(int num){
        int rank = 0;
        switch(num) {
            case 6 : rank = 1; break;
            case 5 : rank = 2; break;
            case 4 : rank = 3; break;
            case 3 : rank = 4; break;
            case 2 : rank = 5; break;
            default: rank = 6; break;
        }
        return rank;
    }

}


