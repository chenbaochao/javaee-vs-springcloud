package jeevsspring.wildfly.poker.manager.game.engine;

import jeevsspring.wildfly.poker.manager.game.hand.Card;
import jeevsspring.wildfly.poker.manager.game.hand.Pot;
import jeevsspring.wildfly.poker.manager.game.player.Player;
import org.jboss.logging.Logger;

import java.util.List;
import java.util.Map;

/**
 * @author Marco Romagnolo
 */
public abstract class GameAction {

    // JBoss Logger
    private final Logger logger = Logger.getLogger(getClass());

    private long id;
    private String handId;
    private List<String> visitors;
    private Map<String, Player> players;
    private String[] seats;
    private List<Card> communityCards;
    private List<Pot> pots;
    private int turn;
    private Map<String, Long> winnings;

    public GameAction(String handId) {
        logger.debug("GameAction(" + handId + ")");
        this.id = System.nanoTime();
        this.handId = handId;
    }

    public long getId() {
        return id;
    }

    public String getHandId() {
        return handId;
    }

    public List<String> getVisitors() {
        return visitors;
    }

    public void setVisitors(List<String> visitors) {
        this.visitors = visitors;
    }

    public Map<String, Player> getPlayers() {
        return players;
    }

    public void setPlayers(Map<String, Player> players) {
        this.players = players;
    }

    public String[] getSeats() {
        return seats;
    }

    public void setSeats(String[] seats) {
        this.seats = seats;
    }

    public List<Card> getCommunityCards() {
        return communityCards;
    }

    public void setCommunityCards(List<Card> communityCards) {
        this.communityCards = communityCards;
    }

    public List<Pot> getPots() {
        return pots;
    }

    public void setPots(List<Pot> pots) {
        this.pots = pots;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public Map<String, Long> getWinnings() {
        return winnings;
    }

    public void setWinnings(Map<String, Long> winnings) {
        this.winnings = winnings;
    }

}
