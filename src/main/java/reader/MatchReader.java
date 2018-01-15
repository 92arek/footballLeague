package reader;

import model.Match;
import model.Team;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class MatchReader {

    public Match read(String path, Map<String, Team> teams)throws IOException{
        checkNotNull(path, "Path cannot be null");
        checkNotNull(teams, "Teams cannot be null");
        checkArgument(teams.size()>=2, "There must be two teams to play the match");

        List<String>
    }

}
