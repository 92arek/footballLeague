package reader;

import model.Player;
import model.Team;

import java.io.*;


public class BufferedTeamReader extends AbstractTeamReader{

    public Team readTeamFromFile(String path) throws IOException {
        File file = getFile(path);
        Team team = createTeam(file);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = bufferedReader.readLine();

        while (line != null) {
            Player player = lineToPlayer(line);
            team.addPlayer(player);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return team;
    }
}