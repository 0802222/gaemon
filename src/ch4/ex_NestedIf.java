package ch4;
import java.util.Scanner;

public class ex_NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
        System.out.print("점수를 입력하세요: ");

        int score = scanner.nextInt(); // 사용자로부터 정수를 입력받아 num에 저장
        String grade;

        if(score >= 90) {  //90점보다 크거나 같으면 "A" 학점
            grade = "A";
            if(score >= 98) { //그중에서도 98점보다 크거나 같으면 학점 + "+" => A+부여
                grade += "+";
            } else if (score < 94) { //그중에서도 94점보다 작거나 같으면 학점 + "-" => A-부여
                grade += "-";
            }
        } else if (score >= 80) {
            grade = "B";
            if(score >= 88) {
                grade += "+";
            } else if (score <84) {
                grade += "-";
            }
        } else {
            grade = "C";
        }
        System.out.println("학생의 학점은 " + grade + "입니다.");
    }
}
