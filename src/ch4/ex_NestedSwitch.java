package ch4;

public class ex_NestedSwitch {
    public static void main(String[] args) {
        int category = 1; // 1: 전자제품, 2: 가전제품
        int item = 2; // 각 카테고리 내에서 선택한 항목

        switch (category) {
            case 1: // 전자제품 카테고리
                System.out.println("전자제품 카테고리 선택");
                switch (item) {
                    case 1:
                        System.out.println("노트북 선택");
                        break;
                    case 2:
                        System.out.println("스마트폰 선택");
                        break;
                    case 3:
                        System.out.println("태블릿 선택");
                        break;
                    default:
                        System.out.println("알 수 없는 전자제품 항목");
                }
                break;

            case 2: // 가전제품 카테고리
                System.out.println("가전제품 카테고리 선택");
                switch (item) {
                    case 1:
                        System.out.println("냉장고 선택");
                        break;
                    case 2:
                        System.out.println("세탁기 선택");
                        break;
                    case 3:
                        System.out.println("에어컨 선택");
                        break;
                    default:
                        System.out.println("알 수 없는 가전제품 항목");
                }
                break;

            default:
                System.out.println("알 수 없는 카테고리");
        }
    }
}