package BehaviouralDesignPatterns.MementoDesignPattern;

public class TicTacToe {

    char[][] board = new char[3][3];
    char currentPlayer;

    TicTacToe(char currentPlayer){
        this.currentPlayer = currentPlayer;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                board[i][j] = 'U';
            }
        }
    }

    char getCurrentPlayer(){
        return this.currentPlayer;
    }
    
    char[][] getBoardStatus(){
        return this.board;
    }

    GameMemento save(){
        return new GameMemento(this.board, this.currentPlayer);
    }
}
