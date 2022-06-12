package study.exampletutorial.practiceexample;

import java.util.Scanner;
import java.util.Arrays;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----성적 계산기-----");
        System.out.println("몇 과목을 듣나요?");
        int subject = scanner.nextInt();
        int[] arr = new int[subject];
        for (int i=0; i<subject; i++){
            System.out.println((i+1)+"번째 과목 점수: ");
            arr[i] = scanner.nextInt();
            if (arr[i]<0 || arr[i]>100){
                System.out.println("형식에 맞지 않는 점수입니다.");
                i--;
                continue;
            }
        }
        double average = (double)(Arrays.stream(arr).sum())/(double)(arr.length);
        System.out.println("과목별 평균은 "+average+ " 입니다.");
        if ((double)average>90 || (double)average<=100){
            System.out.println("당신의 성적은 A 입니다.");
        } else if ((double)average>70 || (double)average<=90){
            System.out.println("당신의 성적은 B 입니다.");
        } else if ((double)average>50 || (double)average<=70){
            System.out.println("당신의 성적은 C 입니다.");
        } else if ((double)average>30 || (double)average<=50){
            System.out.println("당신의 성적은 D 입니다.");
        } else{
            System.out.println("당신의 성적은 F 입니다.");
        }
    }
}
