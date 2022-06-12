package study.exampletutorial.이프와엘스;

public class IfElse {
    public static void main(String[] args) {

        int a = 4;
        if (a == 4){
            System.out.println("실행");
        } else {
            System.out.println("미실행");
        }

        if (a % 4 == 1){
            System.out.println("미실행");
        } else {
            System.out.println("실행");
        }
    }
}
