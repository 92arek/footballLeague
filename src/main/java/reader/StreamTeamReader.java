package reader;

import model.Team;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamTeamReader extends AbstractTeamReader {

    public Team readTeamFromFile(String path) throws IOException {
        Path pathToFile = Paths.get(path);
        Team team = createTeam(getFile(path));

        Stream<String> linesStream = Files.lines(pathToFile);
        linesStream.map(this::lineToPlayer)
                .forEach(team::addPlayer);

        return team;
    }
}
