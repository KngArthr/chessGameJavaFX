package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


//
//Class: chessController
//
//Description:
//This class is the controller for the GUI of the BMI calculator. The objects corresponding to FXML
//file are created here.
//
public class chessController {
	
	
	
	//Base Vbox
    @FXML
    private VBox vboxBase;
    
    //Split pane for chess portion and status portion
    @FXML
    private SplitPane boardSideSplitPane;
    //It automatically adds this anchor pane
    @FXML
    private AnchorPane boardAnchorPane;
    //another vBox
    @FXML
    private VBox vbox;
    //gridpane for the chessboard
    @FXML
    private GridPane boardPane;
    //a pane that allows me to easily manipulate images and shapes inside it
    @FXML
    private Pane pane0_0;
    //a square on the chess board that I can fill with color
    @FXML
    private Rectangle rect0_0;
    //The chess piece
    @FXML
    private ImageView rook0_0;

    @FXML
    private Pane pane1_0;

    @FXML
    private Rectangle rect1_0;

    @FXML
    private ImageView knight1_0;

    @FXML
    private Pane pane2_0;

    @FXML
    private Rectangle rect2_0;

    @FXML
    private ImageView bishop2_0;

    @FXML
    private Pane pane3_0;

    @FXML
    private Rectangle rect3_0;

    @FXML
    private ImageView queen3_0;

    @FXML
    private Pane pane4_0;

    @FXML
    private Rectangle rect4_0;

    @FXML
    private ImageView king4_0;

    @FXML
    private Pane pane5_0;

    @FXML
    private Rectangle rect5_0;

    @FXML
    private ImageView bishop5_0;

    @FXML
    private Pane pane6_0;

    @FXML
    private Rectangle rect6_0;

    @FXML
    private ImageView knight6_0;

    @FXML
    private Pane pane7_0;

    @FXML
    private Rectangle rect7_0;

    @FXML
    private ImageView rook7_0;

    @FXML
    private Pane pane0_1;

    @FXML
    private Rectangle rect0_1;

    @FXML
    private ImageView pawn0_1;

    @FXML
    private Pane pane1_1;

    @FXML
    private Rectangle rect1_1;

    @FXML
    private ImageView pawn1_1;

    @FXML
    private Pane pane2_1;

    @FXML
    private Rectangle rect2_1;

    @FXML
    private ImageView pawn2_1;

    @FXML
    private Pane pane3_1;

    @FXML
    private Rectangle rect3_1;

    @FXML
    private ImageView pawn3_1;

    @FXML
    private Pane pane4_1;

    @FXML
    private Rectangle rect4_1;

    @FXML
    private ImageView pawn4_1;

    @FXML
    private Pane pane5_1;

    @FXML
    private Rectangle rect5_1;

    @FXML
    private ImageView pawn5_1;

    @FXML
    private Pane pane6_1;

    @FXML
    private Rectangle rect6_1;

    @FXML
    private ImageView pawn6_1;

    @FXML
    private Pane pane7_1;

    @FXML
    private Rectangle rect7_1;

    @FXML
    private ImageView pawn7_1;

    @FXML
    private Pane pane0_0511;

    @FXML
    private Rectangle rect0_0511;

    @FXML
    private ImageView pawnW2_1211121;

    @FXML
    private Pane pane0_05111;

    @FXML
    private Rectangle rect0_05111;

    @FXML
    private ImageView pawnW2_12111211;

    @FXML
    private Pane pane0_05112;

    @FXML
    private Rectangle rect0_05112;

    @FXML
    private ImageView pawnW2_12111212;

    @FXML
    private Pane pane0_05113;

    @FXML
    private Rectangle rect0_05113;

    @FXML
    private ImageView pawnW2_12111213;

    @FXML
    private Pane pane0_11;

    @FXML
    private Rectangle rect2_123;

    @FXML
    private ImageView pawnW2_12111214;

    @FXML
    private Pane pane0_12;

    @FXML
    private Rectangle rect2_124;

    @FXML
    private ImageView pawnW2_12111215;

    @FXML
    private Pane pane0_13;

    @FXML
    private Rectangle rect2_125;

    @FXML
    private ImageView pawnW2_125;

    @FXML
    private Pane pane0_14;

    @FXML
    private Rectangle rect2_126;

    @FXML
    private ImageView pawnW2_126;

    @FXML
    private Pane pane0_01;

    @FXML
    private Rectangle rect0_01;

    @FXML
    private ImageView pawnW2_1222;

    @FXML
    private Pane pane7_01;

    @FXML
    private Rectangle rect2_122121;

    @FXML
    private ImageView pawnW2_12211;

    @FXML
    private Pane pane6_01;

    @FXML
    private Rectangle rect6_01;

    @FXML
    private Pane pane1_01;

    @FXML
    private Rectangle rect2_1222;

    @FXML
    private Pane pane0_111;

    @FXML
    private Rectangle rect2_1231;

    @FXML
    private ImageView pawnW2_121112141;

    @FXML
    private Pane pane0_112;

    @FXML
    private Rectangle rect2_1232;

    @FXML
    private ImageView pawnW2_121112142;

    @FXML
    private Pane pane0_051121;

    @FXML
    private Rectangle rect0_051121;

    @FXML
    private ImageView pawnW2_121112121;

    @FXML
    private Pane pane0_051122;

    @FXML
    private Rectangle rect0_051122;

    @FXML
    private ImageView pawnW2_121112122;

    @FXML
    private Pane pane0_051123;

    @FXML
    private Rectangle rect0_051123;

    @FXML
    private Pane pane0_113;

    @FXML
    private Rectangle rect2_1233;

    @FXML
    private Pane pane0_1131;

    @FXML
    private Rectangle rect2_12331;

    @FXML
    private Pane pane0_1137;

    @FXML
    private Rectangle rect2_12337;

    @FXML
    private Pane pane0_11310;

    @FXML
    private Rectangle rect2_123310;

    @FXML
    private Pane pane0_1133;

    @FXML
    private Rectangle rect2_12333;

    @FXML
    private Pane pane0_1134;

    @FXML
    private Rectangle rect2_12334;

    @FXML
    private Pane pane0_1135;

    @FXML
    private Rectangle rect2_12335;

    @FXML
    private Pane pane0_1136;

    @FXML
    private Rectangle rect2_12336;

    @FXML
    private Pane pane0_1138;

    @FXML
    private Rectangle rect2_12338;

    @FXML
    private Pane pane0_1139;

    @FXML
    private Rectangle rect2_12339;

    @FXML
    private Pane pane0_11311;

    @FXML
    private Rectangle rect2_123311;

    @FXML
    private Pane pane0_11312;

    @FXML
    private Rectangle rect2_123312;

    @FXML
    private Pane pane0_11313;

    @FXML
    private Rectangle rect2_123313;

    @FXML
    private Pane pane0_11314;

    @FXML
    private Rectangle rect2_123314;

    @FXML
    private Pane pane0_0511231;

    @FXML
    private Rectangle rect0_0511231;

    @FXML
    private Pane pane0_0511232;

    @FXML
    private Rectangle rect0_0511232;

    @FXML
    private Pane pane0_0511233;

    @FXML
    private Rectangle rect0_0511233;

    @FXML
    private Pane pane0_0511234;

    @FXML
    private Rectangle rect0_0511234;

    @FXML
    private Pane pane0_0511235;

    @FXML
    private Rectangle rect0_0511235;

    @FXML
    private Pane pane0_0511236;

    @FXML
    private Rectangle rect0_0511236;

    @FXML
    private Pane pane0_0511237;

    @FXML
    private Rectangle rect0_0511237;

    @FXML
    private Pane pane0_0511238;

    @FXML
    private Rectangle rect0_0511238;

    @FXML
    private Pane pane0_0511239;

    @FXML
    private Rectangle rect0_0511239;

    @FXML
    private Pane pane0_05112310;

    @FXML
    private Rectangle rect0_05112310;

    @FXML
    private Pane pane0_05112311;

    @FXML
    private Rectangle rect0_05112311;

    @FXML
    private Pane pane0_05112312;

    @FXML
    private Rectangle rect0_05112312;

    @FXML
    private Pane pane0_05112313;

    @FXML
    private Rectangle rect0_05112313;

    @FXML
    private Pane pane0_05112314;

    @FXML
    private Rectangle rect0_05112314;

    @FXML
    private Pane pane0_05112315;

    @FXML
    private Rectangle rect0_05112315;

    @FXML
    private Pane pane0_11371;

    @FXML
    private Rectangle rect2_123371;

    @FXML
    private Pane pane0_113711;

    @FXML
    private Rectangle rect2_1233711;
    //label for gameover message which is kept invisible until the game ends
    @FXML
    private Label gameOverLabel;
    //anchorpane for menu pane
    @FXML
    private AnchorPane sideAnchorPane;
    //label for "status:"
    @FXML
    private Label statusLabel;
    //button to restart the game
    @FXML
    private Button restartGameButton;
    //table for game updates
    @FXML
    private TableView<?> statusColumn;
    //leftmost column for player
    @FXML
    private TableColumn<?, ?> playerColumn;
    //rightmost column for updates
    @FXML
    private TableColumn<?, ?> messageColumn;
    //text in status area will be displayed here
    @FXML
    private Label statusLabelText;
    
    
    
    
///////////////////////////////////////////////////////////////////
/// restartButtonPressed ///
/// Input : an event (usually button is pressed) ///
/// Output: None///
/// On the click of the button in the GUI, the following code runs
/// to restart the game. (Incomplete)
/// 
/// ///
///////////////////////////////////////////////////////////////////
    @FXML
    void restartButtonPressed(ActionEvent event) {
    	
    	
    	System.out.println("At least I can do this much.");
    	statusLabelText.setText("Stuff be registering");
    	//pane2_0.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);  
    	
    	
    	
    }
    

    

//    @FXML
//    private void mouseEntered(MouseEvent e) {
//        Node source = (Node)e.getSource() ;
//        Integer colIndex = GridPane.getColumnIndex(source);
//        Integer rowIndex = GridPane.getRowIndex(source);
//        System.out.printf("Mouse entered cell [%d, %d]%n", colIndex.intValue(), rowIndex.intValue());
//    }

    
    
    
    Board board = new Board();
    
    
///////////////////////////////////////////////////////////////////
/// eventHandler ///
/// Input : an eventHandler///
/// Output: None///
/// Does stuff upon mouseclick. When a pane (square on chessboard) is clicked.
/// the rectangle will turn green and the pane becomes selected.
/// Upon clicking on a square after, the image (chesspiece) moves to that square.
/// ///
///////////////////////////////////////////////////////////////////    

    
    
    @FXML
    EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
    	
///////////////////////////////////////////////////////////////////
/// handle ///
/// Input : a mouseEvent///
/// Output: None///
/// Does stuff upon mouseclick. When a pane (square on chessboard) is clicked.
/// the rectangle will turn green and the pane becomes selected.
/// Upon clicking on a square after, the image (chesspiece) moves to that square.
/// ///
///////////////////////////////////////////////////////////////////    
    	
  	   @Override 
  	   public void handle(MouseEvent e) { 
  		   
///////////////////////////////////////////////////////////////////
/// handle ///
/// Input : an mouse event  ///
/// Output: None///
/// When a mouse button is clicked this method handles it
/// When a pane (square on chessboard) is clicked.
  		/// the rectangle will turn green and the pane becomes selected.
  		/// Upon clicking on a square after, the image (chesspiece) moves to that square.
/// 
/// ///
///////////////////////////////////////////////////////////////////
  		   //if a piece is not yet selected, upon mouseclick we want to select it and turn it green
  		   if(!board.isPieceIsSelected()) {
  			   
  			   
  			   
  			   //the parentNode (pane) must be found because both the square and chess piece
  			   //are its children, so by finding the pane I can access the others
  	  	        Node sourceNode = (Node)e.getTarget();
  	  	        Pane parentPane = (Pane) sourceNode.getParent();
  	  	        System.out.println(parentPane);
  	  	        //if the parent pane has more than one child (meaning it has a chess piece in it)
  	  	        // then we need to remember the parent pane for the next step
  	  	        try {
	  	  	        if(parentPane.getChildren().size() > 1){
	  	  	        	board.setParentPane(parentPane);
	  	  	  	        //System.out.println(parentPane.getChildren().get(1));
	  	  	        }
  	  	        	
  	  	        } catch(IndexOutOfBoundsException error) {
  	  	        	
  	  	        	System.out.println("Index Out Of Bounds: First Piece Selected");
  	  	        }
  	  	        
  	  	        

  	  	        //the index 0 of all the panes is a square on the chessboard(rectangle)
  	  	        Rectangle selectedRect =  (Rectangle) parentPane.getChildren().get(0);
  	  	        //find the original color of the square and store it for later
  	  	        board.setOriginalRectColor((Color)selectedRect.getFill());
  	  	        //the square will turn green if selected
  	  	        selectedRect.setFill(Color.GREEN);
  	  	        //a chess peice has been selected, hence we store it as a boolean
  	  	        board.setPieceIsSelected(true);
  	  	        //we also store the rectangle
  	  	        board.setSelectedRect(selectedRect);
  	  	        
  	  	       
  	  	    //if a piece is already selected and we click on a second one, it is time to either move
  	  	    //the chesspiece to the second selected square or deselect the previous square
  		   }else if(board.isPieceIsSelected()) {
  			   //we give the previous square its color back
  			   board.getSelectedRect().setFill(board.getOriginalRectColor());
  			   //get the new clicked square info
  			   Node sourceNode = (Node)e.getTarget() ;
  			   Pane parentPane = (Pane) sourceNode.getParent();
  			   
  			   try {//if the old square has a chess piece in it then add it to the new square
	  			   if(board.getParentPane().getChildren().size() > 1){
	  	  			   parentPane.getChildren().add(board.getParentPane().getChildren().get(1));
	  	  			   //board.getParentPane().getChildren().remove(1); //Don't need to remove
	  			   }  			   
  			   } catch(IndexOutOfBoundsException error) {
	  	        	
	  	        	System.out.println("Index Out Of Bounds: Second Piece Selected");
  			   }
  			   System.out.println(sourceNode);
  			   //this turns to false because a piece is no longer selected.
  			   board.setPieceIsSelected(false);
 			   
 		   }
  		   

  	        
  	        
  	        
  	        

  	      
  	   } 
     };
///////////////////////////////////////////////////////////////////
/// paneClicked ///
/// Input : event///
/// Output: None///
/// Upon movement of the mouse, registers the eventHandler to a mouse click on the boardpane
/// ///
///////////////////////////////////////////////////////////////////    
    @FXML
    void paneClicked(MouseEvent event) {
    	
        
    	boardPane.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);  
//        rect0_0.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);  
//        rook0_0.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);  
    }
    
    


}
