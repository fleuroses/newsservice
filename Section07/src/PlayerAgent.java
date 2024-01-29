import java.util.ArrayList;

public class PlayerAgent implements Agent {

    private String name;



    private ArrayList<Player> players = new ArrayList<>();

    public PlayerAgent(String name) {
        this.name = name;

    }

    public void addPlayer(Player player) {
        players.add( player );

    }

    public void showPlayers() {
        for(Player player : players) {
            player.showInfo();
        }
    }

}
