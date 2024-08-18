package ch5;

public class Ex5_15_1 {
    public static void main(String[] args) {
        //            01234
        String str = "ABCDE";

        /*//chatAr메서드로 "C"를 뽑아오려면 인덱스2번 추출
        char ch = str.charAt(2);
        System.out.println(ch);*/

        //substring메서드로 1~4번째 인덱스 뽑아오기
        String str2 = str.substring(1,4);
        System.out.println(str2); //결과 : BCD

        //substring메서드로 1~끝 인덱스 뽑아오기
        String str3 = str.substring(1);
        //이건 length로도 치환가능
        String str4 = str.substring(1, str.length());
        System.out.println(str3); //결과 : BCDE
        System.out.println(str4); //결과 : BCDE
    }
}
