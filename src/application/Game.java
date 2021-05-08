package application;



//
//Class: Game
//
//Description:
//This class is for misc game functionality
//Might be removed due to the controller existing but who knows
public class Game {
	//an array of players and the chessboard is stored in here
	private Player[] players;
	private Board board;
	
	
	
	
	
	//constructor
	public Game(Player[] players, Board board) {
		super();
		this.players = players;
		this.board = board;
	}

	
///////////////////////////////////////////////////////////////////
/// startGame ///
/// Input : the players ///
/// Output: ///
/// This will start the game
/// 
/// ///
///////////////////////////////////////////////////////////////////
	private void startGame(Player playerOne, Player playerTwo) {
		
		players[0] = playerOne;
		players[1] = playerTwo;
		
		
		
		
		
		
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
	
	
	
	
	

}
