package reader;

import model.Team;

import java.io.IOException;

public interface TeamReader {
    public Team readTeamFromFile(String path) throws IOException;
}
