package chap_04;

public class For {
    public static void main(String[] args) {
        // 반복문 사용 For
        //for ( 선언 ; 조건 ; 증감 )
//..수행 명령..
//->조건이 맞으면->수행명령->증감 순으로 작동

        for (int i = 0; i < 10; i+=1) {
            System.out.println("어서오세요. 나코입니다. " +i);
        }

//->결과물 : 어서오세요. 나코입니다. 0
//        어서오세요. 나코입니다. 1
//       .
//        .
//     어서오세요. 나코입니다. 9

// 짝수만 출력 (fori 만 적고 엔터)
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
//->결과물 : 02468
//        println에서 ln을 빼고 print만 쓰면 줄바꿈을 하지 않는다

// 홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }
//->결과물 : 13579
//
//※중간에 System.out.println(); 을 넣어주면 줄바꿈만 해줌

//거꾸로 숫자 출력하기
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }
 //->결과물 : 54321
    }
}
