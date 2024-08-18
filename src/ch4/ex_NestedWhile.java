package ch4;
import java.util.Scanner;

public class ex_NestedWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepOrdering = true;

        while (keepOrdering) { // 바깥쪽 while문: 계속 주문을 받는 반복문
            System.out.println("새로운 주문을 받습니다.");

            boolean orderComplete = false;
            while (!orderComplete) { // 안쪽 while문: 각 주문의 메뉴를 처리하는 반복문
                System.out.print("메뉴를 입력하세요 (종료: 'exit'): ");
                String menu = scanner.nextLine();

                if (menu.equalsIgnoreCase("exit")) { // 'exit'을 입력하면 주문 종료
                    orderComplete = true;
                } else {
                    System.out.println(menu + " 메뉴를 추가했습니다.");
                }
            }

            System.out.print("다른 고객의 주문을 받으시겠습니까? (y/n): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("n")) {
                keepOrdering = false; // 'n'을 입력하면 전체 주문 시스템 종료
            }
        }

        System.out.println("주문이 완료되었습니다. 감사합니다!");
        scanner.close();
    }
}