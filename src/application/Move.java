package application;


//
//Class: Move
//
//Description:
//This class stores how the players moves

public class Move {
	
	//the player that is moving
	private Player player;
	//beginning and end area
	private Square begin;
	private Square end;
	//which piece is being moved and maybe killed
	private Figure figureMoved;
	private Figure figureKilled;
	//status of the game
	private String gameStatus;
	
	


//constructor
	public Move(Player player, Square begin, Square end) {
		
		super();
		this.player = player;
		this.begin = begin;
		this.end = end;
		this.figureMoved = begin.getFigure();
	}

	
	
	public Player getPlayer() {
		return player;
	}



	public void setPlayer(Player player) {
		this.player = player;
	}



	public Square getBegin() {
		return begin;
	}



	public void setBegin(Square begin) {
		this.begin = begin;
	}



	public Square getEnd() {
		return end;
	}



	public void setEnd(Square end) {
		this.end = end;
	}



	public Figure getFigureMoved() {
		return figureMoved;
	}



	public void setFigureMoved(Figure figureMoved) {
		this.figureMoved = figureMoved;
	}



	public Figure getFigureKiller() {
		return figureKilled;
	}



	public void setFigureKiller(Figure figureKiller) {
		this.figureKilled = figureKiller;
	}
	
	
	
	public String getGameStatus() {
		return gameStatus;
	}



	public void setGameStatus(String gameStatus) {
		this.gameStatus = gameStatus;
	}

	
	
	
	
	

}
