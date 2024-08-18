package ch4;
import java.util.Scanner; // Scanner 클래스를 사용하기 위해 import

public class ex_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt(); // 사용자로부터 정수를 입력받아 num에 저장

        if (num == 1) {
            System.out.println("SK");
        } else if (num == 6) {
            System.out.println("KTF");
        } else {
            System.out.println("UNKNOWN");
        }

        scanner.close(); // Scanner 자원을 해제 (필수는 아니지만 좋은 습관)
    }
}