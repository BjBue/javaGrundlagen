package application;
	
import javafx.application.Application;


import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
/*
public class Main extends Application {
	@Override
	public void start (Stage primaryStage) throws Exception {

		//myLine line = myLine.getMyLine();

		
		//create text
		Text text = new Text(100,200,"EY Du Arschgesicht!");
		text.setFont(Font.font("Arial", 20));
		text.setFill(Color.RED);
		

		Text text2 = new Text(10,20,"Hallo?");
		text2.setFont(Font.font("Verdana", 10));
		text2.setFill(Color.GREEN);


		Text fancytext = new Text(70,70,"Voll der geile Verlauf!!!!!");
		fancytext.setId("fancytext");
		
		
		//funzt is aba nich so schön
		//text.setFont(new Font(45));
		//text.setX(5.9);
		//text.setY(100.0);
		//text.setText("Hallo Du Saftsackhackfressenpenner!");
		
		//group object
		//Group group = new Group(line, text, text2, fancytext);
		
		//creating the scene ba passing the group object, height, width
		//Scene scene = new Scene(group, 300,300);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		//color
		//scene.setFill(Color.DARKSEAGREEN);
		
		//title
		primaryStage.setTitle("FARBE, ALTA!!");
		
		//adding scene to stage
		77primaryStage.setScene(scene);
		
		//display the content of stage
		//primaryStage.show();
		
	}
	
	public static void main (String args[]) {
		launch(args);
	}
	
	
}

/*
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane root = new BorderPane();
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setTitle("ein Titel");
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
*/


