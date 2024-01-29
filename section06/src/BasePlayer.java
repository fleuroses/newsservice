
// 현재 Player에 있는 모든 기능(메소드)들을 갖는 인터페이스를 만드세요 (플레이어를 인터페이스로 만들기)
// Player 인터페이스를 구현하는 BasePlayer 클래스를 만들고, 각각의 기능들을 똑같이 구현하세요
// Player 인터페이스는 Athletic과 Person 인터페이스로부터 상속받습니다.
// Player 인터페이스에서는 getNumber() 메소드가 있어야합니다.

// soccer Player에 Forward, Midfielder, Defender 추가로 만들기
public class BasePlayer implements Player{

    @Override
    public void run(int x, int y) {

    }

    @Override
    public void walk(int x, int y) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void showInfo() {

    }

    @Override
    public int getNumber() {
        return 0;
    }
}
