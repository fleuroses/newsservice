public class SoccerPlayer extends BasePlayer {

    private final String subject = "축구선수"; //subject는 더이상 변경할 수 없는 값

    public SoccerPlayer() {
        super();
    }

    public SoccerPlayer(String name, int number, int age) {
        super(name, number, age);
    }

    @Override
    public String toString() {
        return String.format("축구선수 : %s(%d). %d살", getName(),  getNumber(), getAge());
    }

    @Override
    public void run(int x, int y) {

    }

    @Override
    public int getAge() {
        return 0;
    }
}
