package ch5;

public class Ex5_6 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"}; //String 배열 생성, 초기화

        for(int i=0; i < names.length; i++) //배열만큼 루프돌리기
            System.out.println("names[" + i + "] : " + names[i]);
            //배열의 '인덱스 : 값' 출력

        String tmp = names[2]; //tmp를 생성하고, names[2]번의 값 Yi로 변경
        System.out.println("tmp : " + tmp); //바뀐 tmp를 출력 (Yi)
        names[0] = "Yu"; //names[0]인 kim을 yu로 변경

        for(int i=0; i < names.length; i++) //배열만큼 루프돌리기
            System.out.println(names[i]); //names의 모든 인덱스 출력
    }
}
