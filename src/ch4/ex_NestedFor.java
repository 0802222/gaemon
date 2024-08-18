package ch4;

public class ex_NestedFor {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) { // 바깥쪽 for문: 2단부터 9단까지 반복
            for (int j = 1; j <= 9; j++) { // 안쪽 for문: 1부터 9까지 반복
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            System.out.println(); // 단 사이에 빈 줄 추가
        }
    }
}
