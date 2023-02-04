package chap_01;

public class _07_TypeCasting {
    int score=93;

    public static void main(String[] args) {
        float score=93.5f;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((int)score);
        String S1;
                S1=Integer.toString(93);
        System.out.println("S1");
        int i = Integer.parseInt("22     ");
        System.out.println(i);
    }
}
