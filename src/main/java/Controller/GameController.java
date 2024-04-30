package Controller;

import java.util.List;

import Exceptions.InvalidMoveException;
import Models.Game;
import Models.Player;
import Models.CustomStates.GameState;

public class GameController {
    public Game startGame(int dimension, List<Player> playerList) {
        // TODO
        // if two player have same symbol throw a new Exception
        return new Game(dimension, playerList);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }

}
