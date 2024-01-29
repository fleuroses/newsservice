import java.util.Scanner;

public class Program {

    public static void section1() {
        int num1 = Integer.MAX_VALUE; // 4byte
        short num2 = 0; // 2byte
        num2 = (short) num1; // 강제 형변환, 데이터의 손실이 발생할 수 있다.

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        float f = num1;
        num1 = (int)f; // 강제 형변환,

        double d1 = 3.14;

        //f = d1; // 데이터오류 발생

        // Java에서 키보드로부터 데이터 입력
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 >>> ");
        num1 = sc.nextInt();
        sc.nextByte();
        boolean bOk = sc.nextBoolean(); // true, false

        System.out.print("문자열 1을 입력하세요 >>> ");
        String str1 = sc.nextLine();

        sc.next(); // 입력 버퍼를 클리어해준다.-> 정상적인 문자열을 입력받을 수 있음

        System.out.print("문자열 1을 입력하세요 >>> ");
        String str2 = sc.next();


        System.out.println("입력한 정수는 " + num1 + "입니다.");
        System.out.printf("입력한 정수는 %d입니다.", num1); // souf + enter, &d는 정수표현 : 갯수(num1)맞아야함

        // Scanner 클래스로부터 객체를 생성하였다면 무조건 달아주어야 한다!!
        sc.close();

    }

    // psvm + enter
    public static void main(String[] args) {
        // 연산자
        // 산술 연산자(부호, 증감)
              // 부호 연산자 : +, -
        int num1 = 100;
        int num2 = -num1;
             // 증감 연산자 : ++, --, 변수의 값을 1씩 증가(감소)
        num1++; // num1 = num1 + 1;
        ++num1; // num1 = num1 + 1;  // 위와 같지만 아래처럼 차이가 있어서 후에 결과값 알아낼 때 중요
        System.out.println("num1 = " + ++num1); //num1 먼저 증가 후 문자 실행 // 출력 전에 num1 값을 증가시킴
        System.out.println("num1 = " + num1++); //문자 실행 후 num1 증가 // 출력 후에 num1 값을 증가시킴

        // +, -, *, /, %(나머지 연산 : 정수와 정수, 실수와 정수, 실수와 실수)

        // 1 / 0 : (분모에 0 들어갈 시 허용 안함 - 반드시 전에 체크), 런타임 에러(Exception)

        // 대입 연산자, 복합 대입 연산자
        num1 = 100;
        num1 += 10; // num1 = num1 + 10;
        num1 -= 10; // num1 = num1 - 10;
        num1 *= 10; // num1 = num1 * 10;
        num1 /= 10; // num1 = num1 / 10;
        num1 %= 10; // num1 = num1 % 10;

        // 관계(비교) 연산자 : ==, !=, >, >=, <, <=
        num1  = 10;
        num2 = 5;
        boolean bOk1 = num1 == num2; // false
        boolean bOk2 = num1 != num2; // true

        // 논리 연산자 : &&(and), ||(or), !(not)
        boolean bOk3 = bOk1 && bOk2;
        // &&(and)
        // true && true = true;
        // true && false = false;
        // false && true = false;
        // false && false = false;

        // ||(or)
        // true || true = true;
        // true || false = ture;
        // false || ture = ture;
        // false || false = false;

        // !(not) : 반전
        // true = false;
        // false = true;

        // (1 <= num1 < 100)
        // 위를 아래와 같이 표현해야함-> (1<=num1) && (num1<100) : 연습 많이 하기!!

        // 비트 연산자 : &(and), |(or), ~(not), ^(xor)
        //int num3 = num1  & num2;

        num1 = 10; // 0000 1010
        num2 = 3;  // 0000 0011  -> 각 비트자리끼리 연산
                 // & 0000 0010 = 2
                 // | 0000 1011 = 11
        System.out.println("num1 & num2 = " + (num1&num2));
        System.out.println("num1 & num2 = " + (num1|num2));
        System.out.println("num1 = " + ~num1); // 부호가 바뀜

        // 1000 0001 = -1 : 부호와 절대값으로 표현
        // 1000 0000  -> +0과 -0은 쓰지 않음
        // : 1의 보수
        // : 2의 보수 1000 0000 -> 0111 1111 -> 1000 0000 -128

        // ^(xor) : 양변이 다르면 참이고, 같으면 거짓
        // 0000 1010
        // 0000 0011
        // 0000 1001
        System.out.println("num1 ^ num2 = " + (num1^num2));

        // 8-4-2-1코드
        // 0000 0
        // 0001 1
        // 0010 2
        // 0011 3
        // 0100 4
        // 0101 5
        // 0110 6
        // 0111 7
        // 1000 8

        // 삼항 연산자 : (조건식) ? 참일 때 명령 : 거짓일 때 명령; // ex) 참일 때 ?를 조건식에 넣음
        // 조건식 : 관계 또는 논리 연산자로 구성

        int num3 = (num1 > num2) ? num1 : num2;

        // 연산자의 우선순위
        // num3 = num1 + -num2 * 100; // 부호-산술-대입 순(*100제외 시), 단항이 우선
        // 가독성 좋은 표현법 -> num3 = num1 + (-num2 * 100);

    }
}
