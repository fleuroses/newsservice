package pack2;

public class Program4 {





    public static void main(String[] args) {
        // 4칙 연산을 하는 클래스를 만들자!!!
        int num1 = 10;
        int num2 = 5;

        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();
        Calculator cal3 = new Calculator();

        // int result = cal.add(num1, num2);
        int result = Calculator.add(num1, num2);
        System.out.println("test");




        // result = cal.subtract(num1, num2);



    }
}
