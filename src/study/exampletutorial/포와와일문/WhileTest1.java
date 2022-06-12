package study.exampletutorial.포와와일문;

public class WhileTest1 {
    public static void main(String[] args) {
        int treehit = 0;
        while (treehit<10){
            treehit++;
            System.out.println("나무를 "+ treehit + "번 찍었습니다.");
            if (treehit == 10){
                System.out.println("나무 넘어갑니다.");
            }
        }
    }
}
