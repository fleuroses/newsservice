

public class Main
{
    public static void main(String[] args)
    {
        // 콘솔화면에 데이터를 출력하는 메소드
        //System.out.print("Hello and welcome!");
        //System.out.printf("print 테스트입니다.");
        //System.out.println("println 테스트입니다.");

        // Primitive Type
        // 정수형(논리형) , 부호와 절대값, 1의 보수, 2의보수
        // byte  1 byte
        // char  2  -> 자바는 유니코드를 지원  : c에서는 2 byte   // 문자형
        // short 2
        // int   4
        // long  8
        // boolean(논리형) 1
        byte my_var = 0;  // 변수 할당

        // 실수형(부동소숫점 형 방식으로 저장)
        // float  4
        // double 8

        float f = 100.0f; //f를 넣어주는 것의 차이가 생김(없을 시 상수로 잡힐 때 double로)
        double d = 100.0;
        // f = d; // 그냥 쓸 경우 오류발생
        f = (float)d; // 밑줄은 데이터 손실 가능성


        char ch = 'A';
        char ch2 = 65;
        System.out.println(ch2);   // sout + enter
        System.out.printf("%d", (short)ch2); //형변환

        String hi = "Hello"; // hi 와 같은 것은 객체
        String nice = "만나서 반갑습니다.";

        //ctrl + / 전체주석, ctrl + s : 라인하나씩 없어짐]

//        for (int i = 1; i <= 5; i++) {
//
//            System.out.println("i = " + i);
//        }
    }
}