package application;

import javafx.scene.image.ImageView;

public class Knight extends Figure {


	
	
	
	public Knight(String team, boolean isAlive, ImageView imageView) {
		super(team, isAlive, imageView);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isLegalMove(Board board, Square begin, Square end) {
		
		
		if(end.getFigure().getTeam().equals(this.getTeam())) {
			return false;
		}
		
		
		int xCoordinate = begin.getxCoordinate() - end.getxCoordinate();
		int yCoordinate = begin.getyCoordinate() - end.getyCoordinate();
		
		
		return xCoordinate * yCoordinate == 2;
		
		
	}
	
	

	
	
}
