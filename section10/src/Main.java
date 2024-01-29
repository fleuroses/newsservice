import java.util.HashMap;
import java.util.TreeMap;

public class Main {

    public static void myFunc(String str) {
        // 엄청 복잡한 처리
    }

    public static void main(String[] args) {
        // byte Byte
        // char Character
        // short Short
        // int Integer
        // long Long
        // float Float
        // double Double
        // boolean Boolean


        // <> : 제네릭클래스  -> 교재 414
//        ArrayList<String> list= new ArrayList<>();
//        LinkedList<String> list2= new LinkedList<>();
//
//
//        list.add("안녕하세요"); // index : 0
//        list.add("반갑습니다"); // index : 1
//        list.add("자바입니다"); // index : 2
//        list.set(1, "안녕히가세요");
//        list.size();  // 현재 리스트내의 아이템 갯수를 반환
//        list.clear(); // 모든 데이터 삭제
//        list.get(0);  // 리스트내의 0번째 아이템을 반환
//        list.remove(1);
//
//
////        String[] arr = new String[10];
////        int[] arr2 = new int[10];
//
////        MyArray arr = new MyArray(); // 디폴트사이즈 10칸짜리 배열
////        MyArray arr2 = new MyArray(20); // 20칸짜리 배열 생성
////        MyArray<String> arr = new MyArray<>();
////        MyArray<Integer> arr2 = new MyArray<>();
////        arr.add("안녕하세요", 0);
////        arr2.add(1, 0);
//
//        // Linked List
//        list2.add("링크드 리스트입니다.");
//        list2.add("ArrayList하고는 좀 달라요");
//        list2.set(1, "안녕히가세요");
//        list2.get(1);
//
//        // 1
//        for(String str : list) {
//            myFunc(str);
//            System.out.println( str );  // 순차적으로 가져옴
//        }
//
//        // 2
//        list2.forEach( str -> {       // 파라미터 : 형식적인 내용없애고 간단하게 나타냄  // String와 list를 생략
//            System.out.println(//str 을 생략 가능
//            );
//        });
//        // 1과 2는 같은 것
//
//        //3
//        //3-1
//        for(String str : list2) {
//            System.out.println( str );
//        }
//
//        //3-2
//        list2.forEach( str -> {
//            System.out.println();
//        });

        //3-3 : // 더 생략가능
//        list2.forEach(System.out::println);
        //list2.forEach(Main::myFunc);


        // 3-1, 3-2, 3-3 은 다 같은 코드

        // Collection : 데이터들의 집합을 관리하는 클래스(객체)들
        // List(배열) : ArrayList, LinkedList, Vector
        // Map() : HashMap, TreeMap    -> 많이 쓰임
        // Set(집합) : HashSet. TreeSet



        // 교재 418
        // 제너릭선언 및 생성 타입 변수 : R

        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("spring", "봄");
        myMap.put("summer", "여름");
        myMap.forEach((str1, str2 ) -> {
            System.out.println(str1);
            System.out.println(str2);
        });

        System.out.println("===============");

        TreeMap<String, String> myMap2 = new TreeMap<>();   // 정렬되면서 집어넣어짐
        myMap2.put("spring", "봄");
        myMap2.put("summer", "여름");
        myMap2.forEach( (str1, str2 ) -> {
            System.out.println(str1);
            System.out.println(str2);
        });

        System.out.println( myMap2.get("summer") ); //여름


        //HashMap<String, Person> myMap3 = new HashMap<>();

        HashMap<String, HashMap<String, String>> myMap3 = new HashMap<>();
        myMap3.get("1").get("string");   // 최종적으로 value가 출력

        //newsAPI 사이트 T, V, K, 배열[ { K-V





    }
}
