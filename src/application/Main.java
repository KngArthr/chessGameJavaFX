package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
//---------------------------------------------------------------------------
//
//Final Program for CS422. Chess with JavaFX
//
//Author: Mujahid Kazi
//Date: 05/07/2021
//Class: MET CS422
//Issues:
//No rules implemented
//Incomplete Program
//Does not capture pieces
//Does not show status messages such as "you win" or "game over"
//Does not record history of moves
//
//Description:
//This program is a two player chess game with a JavaFX GUI
//
//
//
//


//Class: Main
//
//Description:
//This class launches the program.
//It is the driver.
//

public class Main extends Application {
	@Override
	
	
	
///////////////////////////////////////////////////////////////////
/// start ///
/// Input : a Stage ///
/// Output: None///
/// Displays the stage and scene for the program based on the fxml file.
/// 
/// ///
///////////////////////////////////////////////////////////////////
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("JFXT.fxml"));
			Scene scene = new Scene(root,1300,860);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.getIcons().add(new Image("application/resources/chessIcons/006-checker board.png"));
			primaryStage.setTitle("The Game Of Chess");
			primaryStage.setScene(scene);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		

		
		
	}
	
///////////////////////////////////////////////////////////////////
/// main ///
/// Input : String[] args ///
/// Output: None///
/// Runs the program. Key methods are placed in to the main method to run the program.
/// 
/// ///
///////////////////////////////////////////////////////////////////

	
	public static void main(String[] args) {
		
		
		launch(args);
	}
}
