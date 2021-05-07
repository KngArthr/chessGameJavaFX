package application;

public class Square {
	
	private Figure figure;
	private int xCoordinate;
	private int yCoordinate;
	
	
	
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
