package chap_02;

public class Operator {
    public static void main(String[] args) {
        System.out.println(5 % 2); // 1

        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8

        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11

        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 대기 인원 : 3

        int num = 10;

        num = num + 2;
        System.out.println(num); // 12

        num = num / 2;
        System.out.println(num); // 6

        num = num%2;
        System.out.println(num); // 0

        num = 10;

        num += 2; // num = num + 2;
        System.out.println(num); // 12

        num -= 2; // num = num - 2;
        System.out.println(num); // 10

        System.out.println((5 > 3) && (3 > 1)); //true
        System.out.println((5 > 3) && (3 < 1)); //false

        System.out.println((5 > 3) || (3 > 1)); // true
        System.out.println((5 > 3) || (3 < 1)); // true
        System.out.println((5 < 3) || (3 < 1)); // false

        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true

        int x = 3;
        int y = 5;

        int max = (x > y) ? x : y;
        System.out.println(max); // 5

        int min = (x < y) ? x : y;
        System.out.println(min); // 3

        boolean b = (x == y) ? true : false;
        System.out.println(b); // false

        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s); // 달라요​
    }
}
