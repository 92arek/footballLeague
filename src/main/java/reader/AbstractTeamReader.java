package reader;


import model.Player;
import model.Team;

import java.io.File;

abstract class AbstractTeamReader implements TeamReader {

    protected File getFile(String path) {
        if (path == null) throw new IllegalArgumentException("Path cannot be null!");

        return new File(path);
    }

    protected Team createTeam(File file) {
        return new Team(file.getName().replace(".txt", ""));
    }

    protected Player lineToPlayer(String fileLine){
        String[] splitPlayerName = fileLine.split(";");
        return new Player(splitPlayerName[0], splitPlayerName[1]);
    }
}
