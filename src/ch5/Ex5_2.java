package ch5;

public class Ex5_2 {
    public static void main(String[] args) {
        int sum = 0;        //총합을 저장할 변수 생성
        float average = 0f; //평균을 저장할 변수 생성

        int[] score = {100, 88, 100, 100, 90};

        for(int i=0; i<score.length; i++) {
            sum += score[i]; //반복문을 잉뇨ㅗㅇ해서 배열에 저장된 값을 모두 더한다
        }

        average = sum / (float)score.length; //계산결과를 실수로 얻으려 형변환

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);
    }
}
