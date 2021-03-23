import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author (Kyle Guarco)
 * @version (July 29, 2020)
 */
public class P5 extends Application
{
    @Override
    public void start(Stage stage)
    {
        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(new P5Pane(), 600, 300);
        stage.setTitle("Kyle Guarco - Inches Conversions");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }
}
