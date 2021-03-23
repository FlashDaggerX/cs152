import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author (Kyle Guarco)
 * @version (July 21, 2020)
 */
public class LineDemo extends Application
{
    private static final int HEIGHT = 600;
    private static final int WIDTH = 600;
    
    @Override
    public void start(Stage stage)
    {
        Group lineGroup = new Group();
        
        hLine(20, lineGroup, new Color[] {Color.BLUE, Color.ORANGE, Color.GREEN});
        //stairs(50, lineGroup);
        
        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(lineGroup, WIDTH, HEIGHT);
        stage.setTitle("JavaFX Example");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }
    
    private void vLine(int x, Group group)
    {
        for (int i = 0; i < WIDTH; i+=x)
        {
            Line line = new Line();
            
            line.setStartX(i);
            //line.setStartY(0);
            line.setEndX(i);
            line.setEndY(HEIGHT);
            
            line.setStroke(Color.GREEN);
            line.setStrokeWidth(5);
            
            group.getChildren().addAll(line);
        }
    }
    
    public void hLine(int y, Group group, Color[] color)
    {
        for (int i = 0; i < HEIGHT; i+=y)
        {
            Line line = new Line();
            
            line.setStartY(i);
            //line.setStartX(0);
            line.setEndY(i);
            line.setEndX(WIDTH);
            
            line.setStroke(color[i % color.length]);
            line.setStrokeWidth(5);
            
            group.getChildren().addAll(line);
        }
    }
    
    public void stairs(int dist, Group group)
    {
        for (int y = 0; y < WIDTH; y+=dist)
        {
            for (int x = 0; x < y; x++)
            {
                Line hLine = new Line(x, y, x+dist, y);
                Line vLine = new Line(x+dist, y, x+dist, y+dist);
                
                group.getChildren().addAll(hLine, vLine);
            }
        }
    }
}
