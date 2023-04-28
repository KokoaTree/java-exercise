package week2.day5;

public class SwitchCaseWithUser {
    public static void main(String[] args) {
        Student student = new Student();
        student.role = Role.STUDENT;

        switch (student.role) {
            case ADMIN:
                System.out.println("접근 가능합니다.");
                break;
            case MENTOR:
                System.out.println("접근 가능합니다.");
                break;
            case STUDENT:
                System.out.println("접근 불가합니다.");
                break;
            default:
                System.out.println("접근 불가합니다.");
        }
    }
}
