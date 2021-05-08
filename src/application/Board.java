package application;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
//
//Class: Boad
//
//Description:
//Contains the chessboard for the game
//
public class Board {
	
	//a 2D array of the squares that make up the board
	Square[][] places;
	//is a square selected?
	boolean pieceIsSelected = false;
	//stores the currently selected rectangle
	Rectangle selectedRect;
	//stores the color of the first selected rectangle
	Color originalRectColor;
	//stores the parent pane of the rectangle and the piece
	Pane parentPane;
	
	
	
	

	//constructor
	public Board(){
		
		
		
		
	}
	
///////////////////////////////////////////////////////////////////
/// getPlace ///
/// Input : This method returns the square that is selected ///
/// Output: Returns a square///
/// returns a square based on coordinates
/// 
/// ///
///////////////////////////////////////////////////////////////////

	public Square getPlace(int xCoordinate, int yCoordinate) throws Exception {
		//if a square is outsisde the grid then throw an errpr
		if(xCoordinate <= -1 || xCoordinate >= 8 || yCoordinate <= -1 || yCoordinate >= 8) {
			throw new Exception("Are ya trying to move of the board?");
				
		}
		
		return places[xCoordinate][yCoordinate];
		
	}
	
	//method to restart the game by resetting the board
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
