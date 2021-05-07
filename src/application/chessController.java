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

public class chessController {
	
	
	

    @FXML
    private VBox vboxBase;

    @FXML
    private SplitPane boardSideSplitPane;

    @FXML
    private AnchorPane boardAnchorPane;

    @FXML
    private VBox vbox;

    @FXML
    private GridPane boardPane;

    @FXML
    private Pane pane0_0;

    @FXML
    private Rectangle rect0_0;

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

    @FXML
    private Label gameOverLabel;

    @FXML
    private AnchorPane sideAnchorPane;

    @FXML
    private Label statusLabel;

    @FXML
    private Button restartGameButton;

    @FXML
    private TableView<?> statusColumn;

    @FXML
    private TableColumn<?, ?> playerColumn;

    @FXML
    private TableColumn<?, ?> messageColumn;

    @FXML
    private Label statusLabelText;
    
    @FXML
    void restartButtonPressed(ActionEvent event) {
    	
    	
    	System.out.println("At least I can do this much.");
    	statusLabelText.setText("Stuff be registering");
    	//pane2_0.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);  
    	
    	
    	
    }
    
//when click on grid, get row and column of square and change that square to green
    

//    @FXML
//    private void mouseEntered(MouseEvent e) {
//        Node source = (Node)e.getSource() ;
//        Integer colIndex = GridPane.getColumnIndex(source);
//        Integer rowIndex = GridPane.getRowIndex(source);
//        System.out.printf("Mouse entered cell [%d, %d]%n", colIndex.intValue(), rowIndex.intValue());
//    }

    
    
    
    Board board = new Board();
    
    
    
    
    @FXML
    void startButtonClicked(ActionEvent event) {

    	
        

    }
    
    
    
    @FXML
    EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
  	   @Override 
  	   public void handle(MouseEvent e) { 
  		   
  		   if(!board.isPieceIsSelected()) {
  			   
  			   
  			   
  			   
  	  	        Node sourceNode = (Node)e.getTarget();
  	  	        Pane parentPane = (Pane) sourceNode.getParent();
  	  	        System.out.println(parentPane);
  	  	        try {
	  	  	        if(parentPane.getChildren().size() > 1){
	  	  	        	board.setParentPane(parentPane);
	  	  	  	        //System.out.println(parentPane.getChildren().get(1));
	  	  	        }
  	  	        	
  	  	        } catch(IndexOutOfBoundsException error) {
  	  	        	
  	  	        	System.out.println("Index Out Of Bounds: First Piece Selected");
  	  	        }
  	  	        
  	  	        

  	  	        
  	  	        Rectangle selectedRect =  (Rectangle) parentPane.getChildren().get(0);
  	  	        board.setOriginalRectColor((Color)selectedRect.getFill());
  	  	        
  	  	    selectedRect.setFill(Color.GREEN);
  	  	        board.setPieceIsSelected(true);
  	  	        board.setSelectedRect(selectedRect);
  	  	        
  	  	       
  	  	        
  		   }else if(board.isPieceIsSelected()) {
  			   board.getSelectedRect().setFill(board.getOriginalRectColor());
  			   
  			   Node sourceNode = (Node)e.getTarget() ;
  			   Pane parentPane = (Pane) sourceNode.getParent();
  			   
  			   try {
	  			   if(board.getParentPane().getChildren().size() > 1){
	  	  			   parentPane.getChildren().add(board.getParentPane().getChildren().get(1));
	  	  			   //board.getParentPane().getChildren().remove(1); //Don't need to remove
	  			   }  			   
  			   } catch(IndexOutOfBoundsException error) {
	  	        	
	  	        	System.out.println("Index Out Of Bounds: Second Piece Selected");
  			   }
  			   System.out.println(sourceNode);
  			   board.setPieceIsSelected(false);
 			   
 		   }
  		   

  	        
  	        
  	        
  	        

  	      
  	   } 
     };
    
    @FXML
    void paneClicked(MouseEvent event) {
    	
        
    	boardPane.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);  
//        rect0_0.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);  
//        rook0_0.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);  
    }
    
    


}
