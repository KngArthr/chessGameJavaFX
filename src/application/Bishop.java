package application;

import javafx.scene.image.ImageView;

public class Bishop extends Figure {


	public Bishop(String team, boolean isAlive, ImageView imageView) {
		super(team, isAlive, imageView);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isLegalMove(Board board, Square start, Square end) {
		// TODO Auto-generated method stub
		return false;
	}

}
