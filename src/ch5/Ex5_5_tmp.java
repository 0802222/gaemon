package ch5;
import java.util.Arrays;

//가위바위보 (랜덤) 10번 출력하기
public class Ex5_5_tmp {
    public static void main(String[] args) {

        String[] strArr = {"가위", "바위", "보"};
        System.out.println(Arrays.toString(strArr));

        for(int i=0; i<10; i++) {      //10번 루프돌리기
            int tmp = (int)(Math.random() * 3);    //tmp변수를 만들고 랜덤메소드를 통해 3을 곱해 0,1,2가 나오게함
            System.out.println(strArr[tmp]);  //0~2
        }
    }
}
