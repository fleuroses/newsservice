public abstract class Player01 implements Athletic, Person {   //implements : 다중 구현 가능
    private String name;
    private int number;

    public Player01() {
        name = "없음";
        number = 0;
    }

    public Player01(String name, int number) {
        this.name = name;
        this.number = number;
    }

    //Getter
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }

    //Setter
    public void setName(String name) {
        // 제한적인 허용 또는 시스템적인 Write(쓰기)
        if (name.length() > 20)
            return;

        this.name = name;
    }


    public void showInfo() {
        System.out.println( this );
    }

    public abstract void run(int x, int y); // 추상 메소드
//    {
//        System.out.printf("%s가 (%d, %d) 위치로 달립니다.\n", getName(), x, y);
//    }


    @Override
    public String toString() {
        return String.format("%s(%d)", name, number);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if ( obj  instanceof Player01)
//        {
//            Player tmp = (Player) obj;
//            if (tmp.name.equals((name)) && tmp.number==number)
//                return true;
//        }
//
//        return false;
//    }

}