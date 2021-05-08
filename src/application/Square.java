package application;
//
//Class: Square
//
//Description:
//This class defines a single square on a chessboard.
//
public class Square {
	
	//if there is a figure on the square it will be stored here
	private Figure figure;
	//the x coordinate of this particular square
	private int xCoordinate;
	//the y coordinate of this particular square
	private int yCoordinate;
	
	
	//constructor
	public Square(Figure figure, int xCoordinate, int yCoordinate) {
		super();
		this.figure = figure;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}

	
	
	
	public Figure getFigure() {
		return figure;
	}
	public void setFigure(Figure figure) {
		this.figure = figure;
	}
	public int getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	
	
	

}
