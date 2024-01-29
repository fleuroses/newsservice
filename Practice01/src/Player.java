public class Player {
    private int number;
    private String name;

    public Player() {
        number = 35;
        name = "유재석";
    }

    public void showInfo() {

        System.out.printf("이 플레이어의 이름은 %s이고, 번호는 %d이다.\n", name, number);

        }

    public String toString() {
        return String.format(name, "(", number, ")");
    }

//    public boolean equals(Object obj) {
//
//        if (obj instanceof Player) {
//
//
//        }
//    }
    }


