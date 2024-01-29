public final class Better extends BaseballPlayer {

    private String position;

    public Better(String name, int number, String position) {
        super(name, number);
        this.position = position;
    }

    @Override
    public void showInfo() {
        System.out.printf("야구선수 : %s(%s, %d)", getName(), position, getNumber());


    }
}