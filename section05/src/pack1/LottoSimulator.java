package pack1;

import java.util.Arrays;
import java.util.Random;

public class LottoSimulator {
    // 속성 : 멤버변수, 필드, 프로퍼티
    // 메소드 : 행위, 멤버함수
    // 이벤트 : 함수의 형태로 나타난다. (Interface) ===> 스윙, 스프링(?)

    // 요구 사항
    // 자동인지 수동인 선택
    // 몇 게임을 살건지???
    // 당첨 결과에 따라 등수와 금액
    // 실전인지 연습인지 구별?

    // 속성(들)
    // 당첨 번호
    // 시뮬레이션할 구매자 번호(들)
    // 자동, 수동
    // 게임수?
    // 등수?
    // 금액?

    // 기능(Function) ===> Method
    // 당첨번호 생성
    // 구매자 번호 자동 생성
    // 구매자 번호 수동 입력
    // 당첨번호와 매칭
    // (당첨번호와 매칭하여)등수 결정

    // 속성
    // 접근제어자 [정적, 인스턴스] 데이터 타입 속성이름;
    private short[] wins; // = new short[6];    // wins라는 이름의 배열을 속성(필드)로 정의
    private short[][] lottos;// = new short[5][6];  // 구매자 번호

    // public : 외부에서 접근할때 모두 허용, 제한이 없음, 상속 가능하다.
    // protected : 같은 패키지안의 오브젝트들에서 접근이 가능, 상속 가능하다.
    // private : 모두 불가, 내부에서만 사용가능
    // byte, short, int, long, float, boolean


    // 생성자도 메소드이다.
    // 생성자는 객체를 만들때 무조건 한번은 호출된다.
    // 생성자는 다른 메소드들과 마찬가지로 매개변수(파라미터)를 갖을 수 있다.

    public LottoSimulator() {
        wins = new short[6];
        lottos = new short[5][6];
    }

    public LottoSimulator(int row) {
        wins = new short[6];
        lottos = new short[row][6];
    }


    // 요구사항 : 당첨번호를 재생성 가능하도록 해주세요
    // initWins()라는 메소드를 정의하여 외부에 노출시킴 ===> 기능
    public void initWins(/*매개변수들*/) {

        for(int i=0; i<wins.length; i++) {
            // 중복없이 랜덤값을 i번째 위치에 입력함
            insertRandomValue(wins,i);
        }

        // 당첨번호를 오름차순으로 정렬하여 보여질 수 있게 해주세요!!!
        Arrays.sort( wins );
    }

    // 수동 기능은 추후에 구현...
    // 자동 기능만 구현
    public void initUserNumbers() {
        for(int i=0; i<lottos.length; i++) {    // 행갯수 - 1
            for(int j=0; j<lottos[i].length; j++) { // 열갯수 - 1
                insertRandomValue(lottos[i],j);
            }

            // 한줄 정렬
            Arrays.sort(lottos[i]);
        }
    }

    // 당첨번호를 눈으로 확인할 수 있게 해주세요!!!
    public void showWins() {
        System.out.println( Arrays.toString(wins) );
    }

    // 사용자 구매 번호를 줄단위로 출력하기
    public void showUserNumbers() {
        for(int i=0; i<lottos.length; i++) {
            System.out.println( Arrays.toString(lottos[i]) );
        }
    }

    // 당첨번호와 로또 구매자 번호는 그들간의 중복된 숫자가 있으면 안됨!!!
    private int searchValue(short[] tmpArr, short toFind) {
        // 순차 탐색 : 첫번째 요소부터 마지막 요소까지 순차적으로 진행하면서
        // 모든 값들을 비교함
        for(int i=0; i<tmpArr.length; i++) {
            if ( tmpArr[i]==toFind ) {

                // 해당 인덱스에서 값을 찾음
//                System.out.println("중복값 찾음");
                return i;   // 중복 상황 발생
            }
        }

        return -1;  // 값을 찾지 못함
    }

    private int binarySearch(short[] tmpArr, short toFind) {
        // 바이너리 탐색
        // 정렬이된 배열을 기준으로 가운데 요소부터 검색하여
        // 찾을 값이 가운데 요소의 값보다 크면 인덱싱의 시작을 가운데 인덱스 + 1로 시작하고,
        // 찾을 값이 가운데 요소의 값보다 작으면 인덱싱의 끝을 가운데 인덱스 - 1로 변경한다.
        int start = 0;  // 시작 인덱스
        int end = tmpArr.length - 1;    // 끝 인덱스 : 길이-1
        int mid = 0;  // 끝 인덱스 / 2
        while(start <= end) {
            mid = (start + end) / 2;

            if (tmpArr[mid] == toFind )
                return mid;
            else if ( tmpArr[mid] > toFind ) {
                end = mid - 1;
            }
            else if ( tmpArr[mid] < toFind ) {
                start = mid + 1;
            }
        }

        return -1;
    }

    private void insertRandomValue(short[] tmpArr, int index) {

        // 깊은 복사 : 동일한 배열 객체를 하나 더 생성
        // 얕은 복사 : 배열 객체를 그대로 유지하고 참조만 하나 더 생성
        // 참조변수
//        short [] tmpArr = wins;
//        tmpArr = lottos[0];
//        tmpArr = lottos[1];
//        tmpArr = lottos[2];
//        tmpArr = lottos[3];

        Random rand = new Random();
        short tmp = 0;
        do {
            // 랜덤값을 생성하여 tmp에 임시 저장
            tmp = (short) (rand.nextInt(45) + 1);

            // 인덱스(searchValue의 반환값)값이 0보다 크거나 같으면
            // 중복상황이어서 다른 값을 생성하기 위해 반복을 계속함
            // } while( searchValue(tmpArr, tmp) >= 0 );
        } while( binarySearch(tmpArr, tmp) >= 0 );

        tmpArr[index] = tmp;
    }

    private short getRank(int count) {

        switch( count )
        {
            case 6: return 1;

            case 5: return 2;

            case 4: return 3;

            case 3: return 4;

            default: return 0;  // 꽝
        }
    }

    public void showResult() {
        // 당첨번호 wins[]
        // 구매자번호 lottos[][]
        int count = 0;
        for(int i=0; i< lottos.length; i++) {
            count = 0;
            for(int j=0; j<lottos[i].length; j++) {
                // 구매자 번호의 모든것들과 당첨번호를 비교!!!
                if (searchValue(wins, lottos[i][j]) >= 0 ) { // 당첨
                    count++;
                }
            }
            short rank = getRank(count);
            if ( rank > 0 )
                System.out.println(Arrays.toString(lottos[i]) + " ===> " + count + "개 맞음," + rank + "등!!!" );
            else
                System.out.println(Arrays.toString(lottos[i]) + " ===> " + count + "개 맞음," + " 꽝");
        }
    }
}
