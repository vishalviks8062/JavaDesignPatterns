package BehaviouralDesignPatterns.MementoDesignPattern;
import java.util.*;

public class GameHistory {

    List<GameMemento> gameHistory;

    GameHistory(){
        gameHistory = new ArrayList<>();
    }

    void save(GameMemento gameMemento){
        gameHistory.add(gameMemento);
    }

    int gamesize(){
        return gameHistory.size();
    }

}
