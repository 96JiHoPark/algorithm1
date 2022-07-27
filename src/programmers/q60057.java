// https://school.programmers.co.kr/learn/courses/30/lessons/60057
// 문자열 압축

package programmers;

public class q60057 {
    public static void main(String[] args) {
        String s = "abcabcabcabcdededededede";
//        String s = "abcabcdede";
//        String s = "xababcdcdababcdcd";

        int result = solution(s);
        System.out.println(result);
    }

    public static int solution(String s){

        int answer = Integer.MAX_VALUE;

        // 비교 기준 문자열의 길이가 절반을 넘어가면 같은 문자열이 2회이상 반복될 일이 없으므로 총 길이의 절반까지만 반복한다
        // 예) s = "aabbcc", i = 4 라고 가정하면, 길이가 4인 문자열 "aabb" 이외에는 "cc"만이 남게 된다.
        // 이 경우 남은 문자열의 길이가 더 짧기 때문에 반복 여부를 확인하는 것이 무의미하게 된다.
        for(int i = 1; i <= s.length() / 2 + 1; i++){

            // 비교 기준 문자열
            String subStr = s.substring(0,i);
            // 반복되는 수(초기값 : 1)
            int num = 1;
            // 압축 결과 문자열 저장
            StringBuilder sb = new StringBuilder();

            for(int j = i; j <= s.length(); j += i){
                // 비교될 문자열
                String compared = s.substring( j, Math.min(j + i, s.length()) );

                if (subStr.equals(compared)){
                    num++;
                } else {
                    sb.append( (num == 1 ? "" : num) + subStr);
                    subStr = compared;
                    num = 1;
                }
            }

            // 나머지 문자열 붙이기
            sb.append(subStr);
            // 결과 문자열 길이(최소값)
            answer = Math.min(answer, sb.length());
        }

        return answer;
    }

}
