package week2.day5;

public class SwitchCaseClinic {
    public static void main(String[] args) {
        String day = "토";
        String time1 = "09:30~18:30";
        String time2 = "09:30~13:00";

        switch (day) {
            case "월", "화", "목", "금", "토":
                if (day == "토") {
                    System.out.printf("%s요일 %s\n", day, time2);
                } else {
                    System.out.printf("%s요일 %s\n", day, time1);
                }
                break;
            case "수", "일":
                System.out.printf("%s요일 휴진", day); break;
        }
    }
}
