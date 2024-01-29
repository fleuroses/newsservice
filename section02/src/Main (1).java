public class Main {
    public static void main(String[] args) {
        //
        // 제어문
        /*
        * if (조건) {
        *   statement_1;
        *   statement_2;
        *   ...
        *   statement_n;
        * }
        * */
        int num1 = 10;
        int num2 = 3;
        boolean bOk = num1 > num2;
        if ( bOk )
            System.out.println("num1은 num2보다 큽니다");

        if ( !bOk )
            System.out.println("num1은 num2보다 크지 않습니다");

        if ( bOk ) {
            System.out.println("num1은 num2보다 큽니다");
            System.out.println("num1은 num2보다 큽니다");
            System.out.println("num1은 num2보다 큽니다");
        }

        if ( num1 > num2 ) {       //잘 알고 있기!
            System.out.println("num1은 num2보다 큽니다");
            System.out.println("num1은 num2보다 큽니다");
            System.out.println("num1은 num2보다 큽니다");
        }

        // 지양코드1
        /*
        * if (조건식)
        *   statement_1; // 조건식이 참일 때 수행되는 명령
        * else
        *   statement_1; // 조건식이 거짓일 때 수행되는 명령
        *
        * 지양코드2
        * if (조건식1)
        *   statement_1;
        * else if (조건식2)
        *   statement_2;
        * else if (조건식3)
        *   statement_3;
        * else if (조건식4)
        *   statement_4;
        * ...
        * else
        *   statement_n;
        *
        *
        * */

        // ctrl + / : 드래그한 주석 전체

        int age = 0;
        Scanner sc = new Scanner(Syetem.in);

        System.out.println("나이를 입력하세요>>> ");
        age = sc.nextInt();

        sc.close();

        if ( age < 13 )
            System.out.println("당신은 어린이 입니다");
        else if ( age >= 13 && age <= 18) // >= 13 -> > 12
            System.out.println("당신은 청소년입니다");
        else if ( age > 18 && age < 65 )
            System.out.println("당신은 성인입니다.");
        else
            System.out.println("당신은 어르신입니다");



    }
}
