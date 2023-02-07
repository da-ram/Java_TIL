package chap_01;

public class Switch_Case {
    public static void main(String[] args) {
        int ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        //break; 가 없으므로 case 1 + 2 + 3 이 된다

        int grade = 1;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;

        }
        System.out.println(grade + "등급 제품의 가격 : " + price +"원");
    }
}
