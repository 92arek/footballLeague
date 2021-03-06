package model;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Team {
    private final String name;
    private final Set<Player> players;

    public Team(String name, Collection<Player> players) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException(String.format("Name cannot be empty, but %s given.", name));
        }
        if (players == null) {
            throw new IllegalArgumentException("Players cannot be null.");
        }
        this.name = name;
        this.players = new HashSet<>(players);
    }

    public Team(String name) {
        this(name, Collections.emptySet());
    }

    public String getName() {
        return name;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}