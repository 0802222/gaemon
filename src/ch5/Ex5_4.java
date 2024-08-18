package ch5;

import java.util.Arrays;

//배열 섞기
public class Ex5_4 {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("원래 배열 : " + Arrays.toString(numArr));

        for (int i=0; i<100; i++) {    //100번 반복
            int n = (int)(Math.random()*10);
            //0~9중 한 값을 임의로 얻음(랜덤함수는 0이상 1미만 실수를 생성하니까 *10해줌)
            int tmp = numArr[0];   //numArr[0]과 numArr[n]의 값을 바꾼다.
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println("섞인 배열 : " + Arrays.toString(numArr));
        //바뀔때마다 추적하고싶다면, 반복횟수를 배열의 길이만큼으로 잡고(i<numArr.length;), 출력문을 for문에 포함시키면됨
    } //main의 끝
}
