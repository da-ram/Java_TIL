package chap_01;

public class Else {
    public static void main(String[] args) {
        //오후 2시 이전이면 아이스 아메리카노+1 그렇지 않으면 디카페인+1
        int hour = 15;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
        } else {
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }

        // 오후 2시 이후이거나 모닝커피를 마신 경우에 디카페인 그렇지 않으면 아메리카노
        hour = 11;
        boolean morningCoffee = true;
        if (hour > 14 || morningCoffee) {
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }

    }
}
