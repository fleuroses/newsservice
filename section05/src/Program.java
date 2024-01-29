import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        // 변수를 선언(정의)한다.
        int number1 = 100; // 4 바이트
        int number2 = 101; // 4 바이트
        int number3;


        // 배열(Array)
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[9] = 10;

        for(int i=0; i<10; i++) {
            numbers[i] = i+1;
        } // 1,2,3,4,5,6,7,8,9,10

        // 여러가지 타입의 배열 선언(정의)하기
        // short[] arr1 = new short[5];
        double[] arr2 = new double[3];
        String[] strs = new String[10];

        short[] arr1 = new short[] {1,2,3};
        char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};
        String str = "1LO2V3E";

        /*
        short[] arr1 = new short[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        */
        for(int i=0; i<numbers.length; i++) {
            System.out.printf("%d,", numbers[i]);
        }

        System.out.println();

        System.out.println( Arrays.toString(numbers) );

        //
        Random rand = new Random();
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = rand.nextInt(100); // 0~99
        }

        // System.out.println( Arrays.toString(numbers) );

        // Arrays.sort( numbers ); // 오름차순 정렬

        System.out.println( Arrays.toString(numbers) );

        // 정렬을 하는 이유 : 탐색(Search)

        // 정렬(sort) : 순차정렬, 버블정렬, 퀵소트, 기수정렬, ...
        // 순차 정렬
        // 0, 1,  2,  3,  4,  5,  6,  7,  8,  9
        //[8, 72, 62, 94, 73, 82, 75, 74, 72, 0]

        int[] numbersCopy = new int[10];
        // 배열의 복사 ( 깊은 복사 )
        // int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.arraycopy(numbers, 0, numbersCopy, 0, numbers.length);

        // 얕은 복사
        //int[] numbersCopy = numbers;

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                if ( numbers[i] > numbers[j] ) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
            // System.out.println( Arrays.toString(numbers) );
        }

        System.out.println("정렬 전 ---> " + Arrays.toString(numbersCopy) ); // 정렬 전
        System.out.println("정렬 후 ---> " + Arrays.toString(numbers) );     // 정렬 후
    }
}
