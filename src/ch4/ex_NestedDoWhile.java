package ch4;

public class ex_NestedDoWhile {
    public static void main(String[] args) {
        int rows = 5;
        int i = 1;

        do {
            int j = 1;
            do {
                System.out.print(j + " ");
                j++;
            } while (j <= i); // 안쪽 do-while문: 현재 행 번호까지 숫자 출력
            System.out.println(); // 줄 바꿈
            i++;
        } while (i <= rows); // 바깥쪽 do-while문: 행을 증가시키며 반복
    }
}