public class BasePlayer implements Player {

        private int number;
        private int age;
        private String name;

        private PlayerAgent agent;


        public BasePlayer() {
            name = "없음";
            number = 0;
            age = 0;
        }

        public BasePlayer(String name, int number, int age) {
            this.name = name;
            this.number = number;
            this.age = age;
        }

        public BasePlayer(Builder build) {
            this.name = build.name;
            this.number = build.number;
            this.age = build.age;
        }

        @Override
        public void run(int x, int y) {

        }

        @Override
        public void walk(int x, int y) {

        }

        @Override
        public int getNumber() {
            return number;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getAge() {
            return age;
        }

        @Override
        public void showInfo() {
            System.out.println(this);

        }

        @Override
        public String toString() {
            return String.format("운동선수 : %s(%d), %d살", name, number, age);
        }

        public void signAgent(Agent agent) {
            agent.addPlayer(this);
            this.agent = (PlayerAgent) agent;
        }

        public PlayerAgent getAgent() {

            // 메소드 안에 있는 내부 클래스
            class Miclass {

            }
            return agent;
        }

        public static Builder Build() {
            return new Builder();
        }

        // 정적 내부 클래스
        public static class Builder {

            private int number;
            private int age;
            private String name;

            public Builder() {} // 생성자
            public Builder name(String name) {  // 접근제어자 반환형 메소드이름(파라미터=Builder내부클래스의 메소드)
                this.name = name;
                return this; // Builder 자기자신 반환
            }

            public Builder number(int number) {
                this.number = number;
                return this;
            }

            public Builder age(int age) {
                this.age = age;
                return this;
            }

            public BasePlayer build() {
                return new BasePlayer(this);
            }




        }

//   public void add() {
//
//   }

        // 인스턴스 클래스 (클래스 안에 존재하는 내부 클래스)
        //protected : 패키지 안에서는 가능한 접근제어자
        //여기서는 private 불가능
//    public class Ball {
//        private String type;
//
//
//        public Ball() {
//            type = "그냥공";
//
//        }
//
//        public Ball(String type) {
//            this.type = type;
//        }
//
//
//    public void bound() {
//        System.out.println("공이 튕겼습니다.");
//    }
}
