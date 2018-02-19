package jeevsspring.wildfly.poker.manager.engine.hand;

import java.util.List;
import java.util.UUID;

/**
 * @author Marco Romagnolo
 */
public class Pot {

    private String id;
    private long value;
    private List<String> players;

    public Pot(String id) {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public List<String> getPlayers() {
        return players;
    }

    public void setPlayers(List<String> players) {
        this.players = players;
    }
}
