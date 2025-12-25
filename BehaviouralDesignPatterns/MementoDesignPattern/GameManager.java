package BehaviouralDesignPatterns.MementoDesignPattern;

public class GameManager {

    TicTacToe tictactoe;
    GameHistory gameHistory;
    int index;

    GameManager(TicTacToe tictactoe, GameHistory gamehistory){
        this.tictactoe = tictactoe;
        this.gameHistory = gamehistory;
        index = gamehistory.gamesize();
    }

    void save(){
        this.gameHistory.save(new GameMemento(tictactoe.board, tictactoe.currentPlayer));
        index++;
    }

    void displayGame(GameMemento gamestate){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(gamestate.board[i][j]+" ");
            }
            System.out.println();
        }
    }


    GameMemento undoState(){
        if(index<=0){
            System.out.println("This is the beginning of the game");
            return null;
        }
        // index--;
        return gameHistory.gameHistory.get(index - 1);
    }

    GameMemento redoState(){
        if(index >= gameHistory.gamesize()){
            System.out.println("Can't redo state!");
            return null;
        }
        // index++;
        return gameHistory.gameHistory.get(index +1);
    }

    boolean isWin(int x, int y){
        char check = tictactoe.currentPlayer;
        int t =0;
        if(tictactoe.board[x][0]==check && tictactoe.board[x][1]==check && tictactoe.board[x][2]==check) return true;
        if(tictactoe.board[0][y]==check && tictactoe.board[1][y]==check && tictactoe.board[2][y]==check) return true;
        return false;
    }

    boolean playGame(int x,int y){
        // if(tictactoe.board[x][y] != 'U'){
        //     System.out.println("Cell is already occupied");
        //     return false;
        // }
        tictactoe.board[x][y] = tictactoe.getCurrentPlayer();
        tictactoe.currentPlayer = (tictactoe.currentPlayer == 'X')?'O':'X';
        save();
        
        return false;
    }

}
