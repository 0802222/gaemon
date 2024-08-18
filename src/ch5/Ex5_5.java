package ch5;

import java.util.Arrays;

public class Ex5_5 {
    public static void main(String[] args) {

        //index는 0~44까지 생김 (배열에 1~45까지 저장됨)
        int[] ball = new int[45];

        for(int i=0; i < ball.length; i++)
            ball[i] = i+1;  //ball[0]에 1이 저장됨
        System.out.println("숫자 45개 생성 확인 : " + Arrays.toString(ball));

        int tmp = 0;  //두 값을 바꾸는데 사용할 임시 변수
        int j = 0;    //임의의 값을 얻어서 저장할 변수

        for(int i=0; i<6; i++) {   //index[0]~[5]까지, 즉 6개만 섞어줌
            j = (int)(Math.random() * 45);  //0~44범위의 임의의 값을 얻는다.
            tmp = ball[i];   //ball[i]와 ball[j]의 값을 바꾼다.
            ball[i] = ball[j];
            ball[j] = tmp;
        }
        for(int i=0; i<6; i++)
            System.out.printf("이번주 로또 번호 : " + "ball[%d]=%d%n", i, ball[i]);
    }
}
