package BehaviouralDesignPatterns.MementoDesignPattern;

public class Client {
    

    public static void main(String[] args) {

        TicTacToe tictactoe = new TicTacToe('X');
        GameHistory gameHis = new GameHistory();
        GameManager gameManager = new GameManager(tictactoe, gameHis);
        gameManager.playGame(0, 0);
        gameManager.displayGame(gameHis.gameHistory.get(gameManager.index-1));
        System.out.println();
        gameManager.playGame(0, 1);
        gameManager.displayGame(gameHis.gameHistory.get(gameManager.index-1));
        System.out.println();
        gameManager.playGame(1, 1);
        gameManager.displayGame(gameHis.gameHistory.get(gameManager.index-1));
        System.out.println();
        gameManager.playGame(2, 2);
        gameManager.displayGame(gameHis.gameHistory.get(gameManager.index-1));
        System.out.println();
        gameManager.playGame(0, 2);
        gameManager.displayGame(gameHis.gameHistory.get(gameManager.index-1));
        System.out.println();
        gameManager.playGame(2, 0);
        gameManager.displayGame(gameHis.gameHistory.get(gameManager.index-1));
        System.out.println();
        gameManager.displayGame(gameManager.undoState());
        System.out.println();
        gameManager.displayGame(gameManager.undoState());
        System.out.println();
        gameManager.displayGame(gameManager.redoState());
        System.out.println();
        
    }
}
