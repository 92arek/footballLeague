package model;

import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static model.MatchResult.DRAW;
import static model.MatchResult.GUESTS_WIN;
import static model.MatchResult.HOST_WIN;

public class Match {

    private final Team hostTeam;
    private final List<Player> hostGoalScorer;
    private final Team guestTeam;
    private final List<Player> guestGoalScorer;
    private final MatchResult result;

    public Match(Team hostTeam, List<Player> hostGoalScorer, Team guestTeam, List<Player> guestGoalScorer) {
        this.hostTeam = checkNotNull(hostTeam, "hostTeam == null");
        this.hostGoalScorer = checkNotNull(hostGoalScorer, "hostGoalScorer == null");
        checkArgument(hostTeam.getPlayers()
                .containsAll(hostGoalScorer), "Host players only",
                hostTeam.getPlayers(), getHostGoalScorer());

        this.guestTeam = checkNotNull(guestTeam, "guestTeam == null");
        this.guestGoalScorer = checkNotNull(guestGoalScorer, "guestGoalScorer == null");
        checkArgument(guestTeam.getPlayers()
                .containsAll(guestGoalScorer), "Guest players only",
                guestTeam.getPlayers(), getGuestGoalScorer());

        result = hostGoalScorer == guestGoalScorer ? DRAW
                : (hostGoalScorer.size() > guestGoalScorer.size() ? HOST_WIN : GUESTS_WIN);
    }

    public Team getHostTeam() {
        return hostTeam;
    }

    public List<Player> getHostGoalScorer() {
        return hostGoalScorer;
    }

    public Team getGuestTeam() {
        return guestTeam;
    }

    public List<Player> getGuestGoalScorer() {
        return guestGoalScorer;
    }

    public MatchResult getResult() {
        return result;
    }
}
