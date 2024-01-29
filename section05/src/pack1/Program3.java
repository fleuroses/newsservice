package pack1;

import java.util.Scanner;

public class Program3 {

    // Entry Point(진입점)
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] refArr = arr; // 얕은 복사

        int num1 = 10;
        int num2 = num1;

        // String str = "Hello Java!!!";
        String str = new String("Hello Java");  // 객체를 생성, 인스턴스화 한다!!!
        // Scanner sc = new Scanner(System.in);    sc.close();



        // package : class들의 묶음(클래스들을 서로 구분)

        // class : 객체(Object, Instance)의 설계도

        LottoSimulator myLotto = new LottoSimulator();
        // LottoSimulator yourLotto = myLotto;

        myLotto.initWins(); // 당첨 번호를 생성

        // 당첨번호를 눈으로 확인할 수 있게 해주세요!!!
        myLotto.showWins();

        // 사용자 구매 번호 생성
        myLotto.initUserNumbers();

        // 결과 보기
        myLotto.showResult();

        // 사용자 구매 번호 출력
        // myLotto.showUserNumbers();
    }
}
