public final class Pitcher extends BaseballPlayer {
    public Pitcher(String name, int number) {
        super(name, number);
    }

    public void pitch()  {
        System.out.printf("%s가 공을 던집니다.", getName());
    }

}

