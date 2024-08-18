package ch4;
import java.util.Scanner; // Scanner 클래스를 사용하기 위해 import

public class ex_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt(); // 사용자로부터 정수를 입력받아 num에 저장

        switch (num) {
            case 1:
                System.out.println("SK");
                break;
            case 6:
                System.out.println("KTF");
                break;
            case 9:
                System.out.println("LG");
                break;
            default:
                System.out.println("UNKNOWN");
                break;
        }
        scanner.close(); // Scanner 자원을 해제 (필수는 아니지만 좋은 습관)
    }
}