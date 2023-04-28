package week2.day5;

import java.util.Scanner;

public class SwitchCaseClinic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        String time1 = "09:00~19:00";
        String time2 = "09:00~13:00";
        String restTime = "12:50~14:00";

        switch (day) {
            case "월", "화", "수", "목", "금":
                System.out.printf("%s요일 %s\n", day, time1);
                System.out.printf("휴게시간 %s\n", restTime); break;
            case "토":
                System.out.printf("%s요일 %s\n", day, time2); break;
            case "일":
                System.out.printf("%s요일 휴무일 입니다.\n", day); break;
            default:
                System.out.printf("요일을 잘못 입력했습니다.\n"); break;
        }


    }
}
