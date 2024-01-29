public class BaseballPlayer extends Player01 implements Athletic, Person {

    public BaseballPlayer(String name, int number) {
        super(name, number);
    }

    public void hitTheBall() {
        System.out.printf("%s가 공을 쳤습니다.\n", getName());
    }

    @Override
    public void showInfo() {
        System.out.printf("야구선수 : %s\n", this);
    }

    // 추상메소드로 인해 run 재정의
    @Override
    public void run(int x, int y) {

    }

    @Override
    public void walk(int x, int y) {

    }
}

