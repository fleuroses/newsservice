import java.util.ArrayList;
import java.util.Arrays;
// 24. 01. 03
public class Main {
    public static void main(String[] args) {

//        Player player = new Player("강호동", 0);
//        player.showInfo();
//        player.run(5, 5);

        BaseballPlayer bp = new BaseballPlayer("강호동", 34);
        bp.showInfo();
        bp.run(10, 10);
        bp.hitTheBall();

        Pitcher pc = new Pitcher("선동렬", 10);
        pc.run(10, 10);
        pc.hitTheBall();


        SoccerPlayer sp = new SoccerPlayer("손흥민", 7);
        sp.run(20, 30);
        sp.kickTheBall();

        // 다형성
        Player01 p1 = new BaseballPlayer("이승엽", 13);
        Player01 p2 = new SoccerPlayer("이강인", 10);
        Player01 p3 = new Pitcher("최동원", 1);
        Player01 p4 = new Better("추은호", 2, "유격수");

//        p1.showInfo();
//        p2.showInfo();
//        p3.showInfo();

        ArrayList<Player01> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);


//        for(Player p : list) {
//            p.run(10, 10);
//        }

        for(Player01 p : list) {
            // p = (Player)p1;
            // p = (Player)p2;
            // p = (Player)p3;
            p.showInfo();
        }

        // BaseballPlayer로부터 상속받는 타자 클래스를 만드세요
        // 타자 클래스는 더 이상 상속 받을 수 없는 클래스 입니다.
        // 타자 클래스는 포지션(스트링) 정보를 갖습니다.
        // 타자 클래스의 생성자는 포지션을 받을 수 있는 생성자가 있어야 합니다.
        // 타자 클래스의 showInfo를 재정의하여 '야구선수 : 이름(포지션, 등번호)'로 출력하게 재정의하세요
        // main()메소드에서 새로운 객체를 생성하여 list에 추가하고
        // showInfo()의 결과를 확인하세요


        //
//        if ( p instanceof Pitcher )
//        {
//            pitcher ptc = (Pitcher) p;
//            ptc.pitch();
//        }

//        if ( p instanceof Player)
//            System.out.printf("%s는 운동선수 입니다.\n", p.getName());

    }



}
