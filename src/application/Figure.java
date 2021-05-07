package application;

import javafx.scene.image.ImageView;

public abstract class Figure {
	

	private boolean isAlive = true;
	private ImageView imageView = new ImageView();
	private String team = "black";
	
	
	
	public Figure(String team, boolean isAlive, ImageView imageView) {
		super();
		this.team = team;
		this.isAlive = isAlive;
		this.imageView = imageView;
	}
	
	
	public abstract boolean isLegalMove(Board board, Square begin, Square end);
	
	
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
