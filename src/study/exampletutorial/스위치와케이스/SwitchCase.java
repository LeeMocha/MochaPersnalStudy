package study.exampletutorial.스위치와케이스;

public class SwitchCase {
    public static void main(String[] args) {

        int n = 2;

        switch (n) { //조건
            case 1:  // 값 불일치 (미실행)
                System.out.println("1");
                break;
            case 2:  // 값 일치
                System.out.println("2"); // 실행
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("4 이상");
        }
    }
}
