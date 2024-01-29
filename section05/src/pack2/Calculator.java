package pack2;

public class Calculator {

    private int myNumber;   // 인스턴스 변수

    private static int code = 0;


    public Calculator() {
        myNumber = 0;   // 인스턴스 변수
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        // * 연산자를 사용하지 말고 구현하시오!!!

        return 0;
    }



    // 몫 구하기(연산자 X)
    // 나머지 구하기(연산자 X)

    public void showMessage() {
        Calculator.code = 10;
    }




}
