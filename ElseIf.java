package chap_01;

public class ElseIf {
    public static void main(String[] args) {
        boolean hallabongAde = false;
        boolean mangoJuice = false;
        boolean orangeJuice = true;

        if (hallabongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
    }
}
