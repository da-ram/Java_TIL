package chap_01;

public class Variables {
    public static void main(String[] args) {
        String name = "정다람";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        // 정다람님, 배송이 시작됩니다. 15시에 방문 예정입니다.

        double score = 90.5;
        char grade = 'A';
        name = "정다람";

        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");
        // 정다람님의 평균 점수는 90.5점입니다.
        // 학점은 A입니다.
    }
}
