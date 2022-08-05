//https://school.programmers.co.kr/learn/courses/30/lessons/42888
//오픈채팅방

package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class q42888 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] result = solution(record);

        for(String str : result){
            System.out.println(str);
        }
    }

    public static String[] solution(String[] record) {
        // 내용(뒷부분) 저장
        List<String> chat = new ArrayList<>();
        // 최신 닉네임(앞부분) 저장
        HashMap<String, String> nickNameMap = new HashMap<>();

        for(int i = 0; i<record.length; i++){
            StringTokenizer st = new StringTokenizer(record[i]);
            String cmd = st.nextToken();
            String id = st.nextToken();
            String nickName = "";

            if(cmd.equals("Enter") || cmd.equals("Change")){
                nickName = st.nextToken();
            }

            switch (cmd){
                case "Enter" :
                    nickNameMap.put(id, nickName);
                    chat.add(id + "님이 들어왔습니다.");
                    break;
                case "Leave" :
                    chat.add(id + "님이 나갔습니다.");
                    break;
                case "Change" :
                    nickNameMap.put(id, nickName);
                    break;
            }
        }

        String[] answer = new String[chat.size()];
        int i = 0;

        for(String str : chat){
            int index = str.indexOf("님");
            String id = str.substring(0,index);

            answer[i++] = str.replace(id, nickNameMap.get(id));
        }

        return answer;
    }

}


