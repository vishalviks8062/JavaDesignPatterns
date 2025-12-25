package BehaviouralDesignPatterns.MementoDesignPattern;

public class GameMemento {

    char[][] board;
    char currentPlayer;

    GameMemento(char[][] board, char currentPlayer){
        this.board = board;
        this.currentPlayer = currentPlayer;
    }
}
