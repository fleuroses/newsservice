public class SoccerPlayer extends Player01{
    public SoccerPlayer(String name, int number) {
        super(name, number);  // 부모 클래스의 생성자를 호출!!

    }

    public void kickTheBall() {
        System.out.printf("%s가 공을 찹니다.\n", getName());
    }

    @Override
    public void run(int x, int y) {

    }

    @Override
    public void walk(int x, int y) {

    }
}

