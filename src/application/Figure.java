package application;

import javafx.scene.image.ImageView;
//
//Class: Figure
//
//Description:
//This is an Abstract class is for all the chess piece Figures.
//It defines what their classes should be made up of
//

public abstract class Figure {
	
	//keeps track if the move is alive or dead
	private boolean isAlive = true;
	//keeps track of which image is associated with the piece
	private ImageView imageView = new ImageView();
	//keeps track of the team
	private String team = "black";
	
	
	//Constructor
	public Figure(String team, boolean isAlive, ImageView imageView) {
		super();
		this.team = team;
		this.isAlive = isAlive;
		this.imageView = imageView;
	}
	
///////////////////////////////////////////////////////////////////
/// isLegalMove ///
/// Input : the chessboard, the square that the piece is being moved from and the piece it is being moved to ///
/// Output: true or false///
/// returns true or false based on if the user's selected move is legal or not
/// 
/// ///
///////////////////////////////////////////////////////////////////
	public abstract boolean isLegalMove(Board board, Square begin, Square end);
	
	//setters and getters
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}


	public ImageView getImageView() {
		return imageView;
	}


	public void setImageView(ImageView imageView) {
		this.imageView = imageView;
	}
	

	

}
