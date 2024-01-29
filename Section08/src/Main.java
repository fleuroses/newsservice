public class Main {

    public static void main(String[] args) {
        Person ps = Person.Build()
                .name("이동국")
                .address("안양")
                .age(20)
                .job("학생")
                .build();
        ps.showInfo();

    }



}
