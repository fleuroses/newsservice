import java.util.Arrays;
import java.util.Random;

public class Program2 {

    public static void main(String[] args) {
//        int [] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 10;
        // int [][] arrDim2 = new int[3][5];
        int[][] arrDim2 = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
//        for(int i=0; i<arrDim2.length; i++) {
//            for(int j=0; j<arrDim2[i].length; j++) {
//            }
//        }

        // Jagged Arrary
//        short [][] arr = new short[5][];
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = new short[i+1];
//        }

//        int[] numbers = new int[] {1,2,3,4,5};
//        Arrays.sort(arr[0]);
//        Arrays.sort(arr[1]);
//        Arrays.sort(arr[2]);

        // 1차원 배열 6칸짜리 wins라는 이름의 배열을 만들고
        // wins 배열에 중복되지 않는 랜덤값으로 채우세요.
        // 당첨 번호 : xx, xx, xx, xx, xx, xx
        int[] wins = new int [6];
        for(int j=0; j<wins.length; j++ ) {
            insertRandomValue(wins, j);
        }
        Arrays.sort( wins );
        System.out.println("당첨번호 : " + Arrays.toString(wins));

        // 1.8버전 이후 나온 for-each
        for(int number : wins) {
            System.out.println(number);
        }


        // 2차원 배열 로또, 5 * 6 배열을 만들고
        // 각 요소에 로또 번호를 자동으로 입력하세요
        // 입력된 내용을 그대로 5줄의 형태로 출력하세요.
        // 정렬하여 출력도 해보세요
        int[][] lottos = new int[5][6];
        for(int i=0; i<lottos.length; i++) {
            for(int j=0; j<lottos[i].length; j++ ) {
                insertRandomValue(lottos[i], j);
            }

            Arrays.sort( lottos[i] );
            System.out.println( Arrays.toString(lottos[i]) );
        }


//        for(int[] arr : lottos) {
//            for(int number : arr) {
//                System.out.println( number );
//            }
//        }


//        String [] cars = new String[3];
//        cars[0] = "BMW";
//        cars[1] = "Benz";
//        cars[2] = "Audi";

        String [] cars = {"BMW", "Benz", "Audi"};



//        int res = searchValue(1);
//        System.out.println( res );
//
//        res = searchValue(2);
//        System.out.println( res );
//
//        res = searchValue(100);
//        System.out.println( res );
//
//        res = searchValue(20);
//        System.out.println( res );
//
//        res = searchValue(5000);
//        System.out.println( res );
    }


    // 함수(Function), 기능
    // 객체 지향형 프로그래밍 기법 : 함수 ----> 메소드(Method)
    // 메소드의 형식
    // 접근 제어자 메소드의 타입(void, int, short) 메소드의 이름(매개 변수들...(int var1))
    // {
    //      일반적인 코드들...
    // }

    public static int searchValue(int[] arr, int toFind) {
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == toFind ) {
                System.out.println("중복값 찾음 : " + toFind);
                return i;
            }
        }

        return -1;  // toFind값을 못찾음
    }

    public static void insertRandomValue(int[] arr, int j) {
        // arr의 j번째 요소에 랜덤값 대입
        // arr의 j번째 요소에 랜덤값을 대입하기전에 중복 검사를 하시오.
        Random rand = new Random();
        int temp;
        do {
            temp = rand.nextInt(45) + 1;
        } while(searchValue(arr, temp) > -1);

        arr[j] = temp;
    }


}











