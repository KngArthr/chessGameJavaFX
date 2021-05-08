package application;

import javafx.scene.image.ImageView;
//
//Class: King
//
//Description:
//This class is for the King chess piece, it is meant to make sure the move done is a legal one
//and store values such as which team, if it is alive and the image that is associated with it
//
public class Knight extends Figure {


	
	
	//Constructor
	public Knight(String team, boolean isAlive, ImageView imageView) {
		super(team, isAlive, imageView);
		// TODO Auto-generated constructor stub
	}
///////////////////////////////////////////////////////////////////
/// isLegalMove ///
/// Input : the chessboard, the square that the piece is being moved from and the piece it is being moved to ///
/// Output: true or false///
/// returns true or false based on if the user's selected move is legal or not
/// 
/// ///
///////////////////////////////////////////////////////////////////

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
