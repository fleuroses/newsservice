public class Person {

    private String name;

    private int age;

    private String address;

    private String job;

    public Person(String name, int age, String address, String job) {


    }

    public Person(Builder build) {
        this.name = build.name;
        this.address = build.address;
        this.age = build.age;
        this.job = build.job;
    }

    public static Builder Build() { return new Builder(); }

    public static class Builder {

        private String name;

        private int age;

        private String address;

        private String job;


        public Builder() {} // 생성자
        public Builder name(String name) {  // 접근제어자 반환형 메소드이름(파라미터=Builder내부클래스의 메소드)
            this.name = name;
            return this; // Builder 자기자신 반환
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }


        public Person build() {
            return new Person(this);
        }
    }



}
