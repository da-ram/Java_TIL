package chap_01;

public class If {
    public static void main(String[] args) {
        //오후 두시 이전, 모닝 커피를 마시지 않은 경우 커피를 주문

        int hour = 10;
        boolean morningCoffe = false;

        if (hour < 14 && morningCoffe == false);
        System.out.println("아이스 아메리카노 +1"); // if (hour < 14 && !morningCoffe) 로도 가능
        System.out.println("커피 주문 완료");
    }
}
