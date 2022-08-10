//https://school.programmers.co.kr/learn/courses/30/lessons/1829
//카카오프렌즈 컬러링북

package programmers.level2;

import java.util.Arrays;

public class q1829 {
    public static void main(String[] args) {
        q1829 q1829 = new q1829();
        int m = 6;
        int n = 4;
        int[][] picture = {
                            {1, 1, 1, 0},
                            {1, 2, 2, 0},
                            {1, 0, 0, 1},
                            {0, 0, 0, 1},
                            {0, 0, 0, 3},
                            {0, 0, 0, 3}
                            };

        int[] result = q1829.solution(m, n, picture);

        System.out.println(Arrays.toString(result));
    }

    static boolean[][] check;
    static int cnt;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        check = new boolean[m][n];
        cnt = 0;

        for(int i = 0; i < picture.length; i++){
            for(int j = 0; j < picture[i].length; j++){
                //빈 칸이 아니고, 확인하지 않은 영역이라면? => 영역개수 +1
                if(picture[i][j] != 0 && !check[i][j]){
                    numberOfArea++;
                    dfs(i, j, picture);
                }

                // 가장 넓은 영역 저장
                maxSizeOfOneArea = Math.max(cnt, maxSizeOfOneArea);
                cnt = 0;
            }
        }

        int[] result = {numberOfArea, maxSizeOfOneArea};

        return result;
    }

    public void dfs(int x, int y, int[][] picture){
        check[x][y] = true;
        //최초 1 ~ 너비(재귀횟수)
        cnt++;
        for(int i = 0; i < 4; i++){
            //상하좌우 원소의 x, y 좌표 구하기
            int nx = x + dx[i];
            int ny = y + dy[i];

            //사진의 범위를 벗어나는 경우 continue
           if(nx < 0 || nx >= picture.length || ny < 0 || ny >= picture[0].length) continue;

           //값이 같고, 아직 확인 안 한 값이라면? => 그 좌표로 으로 다시 dfs
           if(picture[x][y] == picture[nx][ny] && !check[nx][ny]){
               dfs(nx, ny, picture);
           }
        }
    }

}
