package reader;

import model.Player;
import model.Team;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LinesTeamReader extends AbstractTeamReader{

    @Override
    public Team readTeamFromFile(String path) throws IOException {
        Path pathToFile = Paths.get(path);
        List<String> playerNameList = Files.readAllLines(pathToFile);
        Team team = createTeam(getFile(path));

        for (String fileLine : playerNameList) {
            Player player = lineToPlayer(fileLine);
            team.addPlayer(player);
        }

        return team;
    }
}
