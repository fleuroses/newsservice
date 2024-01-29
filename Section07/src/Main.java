public class Main {

    public static void main(String[] args) {
        Forward fw = new Forward("이동국", 10, 20);
        //fw.showInfo();

        Forward fw2 = new Forward("손흥민", 7, 18);
        //fw.showInfo();


        // 함수형 프로그래밍이다. 람다식형 -> 단순화, 아래 1번이나 익명 클래스를 생략 가능
        // fw.signAgent(player -> {
        //    System.out.printf("%s 선수가 추가되었습니다.", player);
        // });

        fw.signAgent(myAgent -> {
            //Agent 인터페이스의 addPlayer() 메소드를 구현한다.
            System.out.printf("%s가 추가되었습니다.", fw);
        });

        //예시 : 버튼 누르기
//        JButton btn1 = new JButton("test1"); // 출력 : 안녕하세요
//        btn1.setAction(// 버튼 클릭 이벤트 핸들러);
//
//        JButton btn2 = new JButton("test1"); // 반갑습니다
//        JButton btn3 = new JButton("test1"); // 안녕히가세요

        // 인스턴스 내부 클래스를 객체로 생성
//        BasePlayer.Ball ball = fw.new Ball("축구공");
//        ball.bound();


        // 1번
        //PlayerAgent myAgent = new PlayerAgent("");
        //signAgent(myAgent);

        // 2번 익명 클래스
//        fw.signAgent(new Agent() {
//
//            private Player[] player = new Player[3];
//            public int i = 0;
//            @Override
//            public void addPlayer(Player player) {
//               this.player[i] = player;
//                System.out.printf("%s 선수가 추가되었습니다.", player);
//
//            }
//        });

        PlayerAgent agent = new PlayerAgent("스캇 보라스");
        // agent.addPlayer(fw); // fw : 인스턴스
        // agent.addPlayer(fw2); // fw2 : 인스턴스

        fw.signAgent(agent);
        fw.getAgent().showPlayers();


        //인스턴스를 생성하면서 파라미터로 전달
        agent.addPlayer(new Forward("이강인", 11, 17));

        // 익명클래스
        agent.addPlayer(new Player() {
            @Override
            public void showInfo() {
                System.out.println("발야구 선수 : 유재석, 40살");
            }

            //사용 안해도 없애면 안됨
            @Override
            public void run(int x, int y) {}

            @Override
            public void walk(int x, int y) {

            }

            @Override
            public int getNumber() {
                return 0;
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public int getAge() {
                return 0;
            }
        });


        //명품호세 개발  = new 안쓰는 예시
        //1. BasePlayer bp = new BasePlayer("이동국", 10, 20);
        //2. BasePlayer bp = new BasePlayer.Builder()
        BasePlayer bp = BasePlayer.Build()
                .name("이동국")
                .number(10)
                .age(20)
                .build();
        bp.showInfo();

        agent.showPlayers();

    }
}
