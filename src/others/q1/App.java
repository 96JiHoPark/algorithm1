package others.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<Student>();

        String select = "y";

        for(int i = 0; i < 10; i++){
            Student s = new Student("학생" + (i+1), Integer.toString(i+1));
            studentList.add(s);
        }

        System.out.print("학생 이름 입력 >> ");
        String search = scanner.nextLine();
        boolean is = false;

        for(Student s : studentList){
            if(s.name.equals(search)){
                is = true;
                System.out.println(s.name + "의 학번은 " + s.no + "입니다.");
                break;
            }
        }

        if (!is){
            System.out.println("없는 학생입니다.");
        }

        while(select.equals("y")){
            System.out.print("계속 검색 ? y 또는 n 입력 >> ");
            is = false;
            select = scanner.nextLine();

            switch (select){
                case "y" :{
                    System.out.print("학생 이름 입력 >> ");
                    search = scanner.nextLine();
                    for (Student s : studentList){
                        if(s.name.equals(search)){
                            is = true;
                            System.out.println(s.name + "의 학번은 " + s.no + "입니다.");
                            break;
                        }
                    }
                    if (!is){
                        System.out.println("없는 학생입니다.");
                    }
                    break;
                }
                case "n" :{
                    System.out.println("프로그램 종료");
                    break;
                }
                default : {
                    System.out.println("y 또는 n을 입력해주세요.");
                    select = "y";
                    continue;
                }
            }

        }

    }
}
