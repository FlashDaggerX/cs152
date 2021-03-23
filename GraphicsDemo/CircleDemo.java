import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author (Kyle Guarco)
 * @version (July 22, 2020)
 */
public class CircleDemo extends Application
{
    // The width and height of the window.
    private static final int SIZE = 600;
    
    @Override
    public void start(Stage stage)
    {
        Group circGroup = new Group();
        
        colorfulCircle(4, circGroup, new Color[] {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.PURPLE});
        
        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(circGroup, SIZE, SIZE);
        stage.setTitle("JavaFX Example");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }
    
    public void colorfulCircle(int dist, Group group, Color[] color)
    {
        Circle circ;
        
        for (int i = 0; i < SIZE / 2; i+=dist)
        {
            circ = new Circle(SIZE / 2, SIZE / 2, i);
            circ.setStroke(color[i % color.length]);
            circ.setStrokeWidth(3);
            circ.setFill(null);

            group.getChildren().add(circ);
        }
    }
    
    public void colorfulCircleStroke(int dist, int width, Group group, Color[] color)
    {
        Circle circ;
        Color c;
        
        for (int i = SIZE / 2; i > 0; i-=dist)
        {
            circ = new Circle(SIZE / 2, SIZE / 2, i);
            c = color[i % color.length];
            
            circ.setStroke(Color.BLACK);
            circ.setStrokeWidth(width);
            circ.setFill(c);

            group.getChildren().add(circ);
        }
    }
}
