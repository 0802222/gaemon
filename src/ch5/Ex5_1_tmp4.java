package ch5;

import java.util.Arrays;

public class Ex5_1_tmp4 {
    public static void main(String[] args) {
        int[] iArr = {100, 95, 80, 70, 60}; //길이가 5인 int배열
        for(int i=0; i<iArr.length; i++) {
            System.out.println(iArr[i]);
        }
        System.out.println(Arrays.toString(iArr)); //int배열 출력
    }
}
