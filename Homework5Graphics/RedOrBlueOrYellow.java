
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * @author (Kyle Guarco)
 * @version (July 27, 2020)
 */
public class RedOrBlueOrYellow extends Application
{
    private Button redButton, blueButton, yellowButton;
    private FlowPane pane;
    //--------------------------------------------------------------------
    //  Presents a GUI with two buttons that control the color of the
    //  pane background.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        redButton = new Button("Red!");
        redButton.setOnAction(this::processColorButton);

        blueButton = new Button("Blue!");
        blueButton.setOnAction(this::processColorButton);
        
        yellowButton = new Button("Yellow!!");
        yellowButton.setOnAction(this::processColorButton);

        pane = new FlowPane(redButton, blueButton, yellowButton);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: white");
 
        Scene scene = new Scene(pane, 300, 100);
   
        primaryStage.setTitle("Red, Blue or Yellow?");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //--------------------------------------------------------------------
    //  Determines which button was pressed and sets the pane color
    //  accordingly.
    //--------------------------------------------------------------------
    public void processColorButton(ActionEvent event)
    {
        if (event.getSource() == redButton)
            pane.setStyle("-fx-background-color: crimson");
        else if (event.getSource() == blueButton)
            pane.setStyle("-fx-background-color: deepskyblue");
        else
            pane.setStyle("-fx-background-color: yellow");
    }
}