package application;

public class Move {
	
	
	private Player player;
	private Square begin;
	private Square end;
	private Figure figureMoved;
	private Figure figureKilled;
	private String gameStatus;
	
	



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
