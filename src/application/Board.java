package application;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Board {
	
	Square[][] places;
	boolean pieceIsSelected = false;
	Rectangle selectedRect;
	Color originalRectColor;
	Pane parentPane;
	
	
	
	


	public Board(){
		
		
		
		
	}
	
	
	public Square getPlace(int xCoordinate, int yCoordinate) throws Exception {
		
		if(xCoordinate <= -1 || xCoordinate >= 8 || yCoordinate <= -1 || yCoordinate >= 8) {
			throw new Exception("Are ya trying to move of the board?");
				
		}
		
		return places[xCoordinate][yCoordinate];
		
	}
	
	
	public void restartGame() {
		
		
		

		
	}
	
	
	
	
	public boolean isPieceIsSelected() {
		return pieceIsSelected;
	}


	public void setPieceIsSelected(boolean pieceIsSelected) {
		this.pieceIsSelected = pieceIsSelected;
	}


	public Rectangle getSelectedRect() {
		return selectedRect;
	}


	public void setSelectedRect(Rectangle selectedRect) {
		this.selectedRect = selectedRect;
	}


	public Color getOriginalRectColor() {
		return originalRectColor;
	}


	public void setOriginalRectColor(Color originalRectColor) {
		this.originalRectColor = originalRectColor;
	}


	public Pane getParentPane() {
		return parentPane;
	}


	public void setParentPane(Pane parentPane) {
		this.parentPane = parentPane;
	}
	
	
	




	

}
