package jeevsspring.wildfly.poker.manager.game.hand;

import org.jboss.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Marco Romagnolo
 */
@Singleton
@LocalBean
public class HandActions {

    // JBoss Logger
    private final Logger logger = Logger.getLogger(getClass());

    private Map<String, Map<String, HandAction>> map;

    @PostConstruct
    public void init() {
        map = new HashMap<>();
    }

    public void insert(HandActionType actionType, String tableId, String handId, String playerId, String option) {
        logger.debug("insert(" + actionType + ", " + tableId + ", " + handId + ", " + playerId + ", "
                + option + ")");
        if (!map.containsKey(tableId)) {
            map.put(tableId, new HashMap<>());
        }
        HandAction hand = new HandAction(actionType, tableId, handId, playerId, option);
        map.get(tableId).put(playerId, hand);
    }

    public Map<String, HandAction> pop(String tableId) {
        logger.debug("pop(" + tableId + ")");
        return map.remove(tableId);
    }

    public boolean contains(String tableId) {
        logger.trace("contains(" + tableId + ")");
        return map.containsKey(tableId);
    }

}
