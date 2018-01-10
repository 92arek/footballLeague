package footballTeam;

import java.util.HashSet;
import java.util.Set;

public class Team {

    private final String teamName;
    private final Set<Player> players = new HashSet<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player){
        players.add(player);
    }
}
