import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * @author (Kyle Guarco)
 * @version (July 23, 2020)
 */
public class SquareDemo extends Application
{
    // The width and height of the window.
    private static final int SIZE = 600;
    private static final int DIST = 30;
    
    @Override
    public void start(Stage stage)
    {
        Group squareGroup = new Group();
        
        //sepSquares(squareGroup);
        sepSquaresRec(0, squareGroup);
        
        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(squareGroup, SIZE, SIZE);
        stage.setTitle("JavaFX Example");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }
    
    public void sepSquares(Group group)
    {
        // 'i' represents the distance from one corner to the center.
        // Remember, a rectangle's draw call begins at (0, 0) (top-left)
        Square sq;
        
        final int ORIGIN = SIZE / 2;
        
        for (int i = 0; i < ORIGIN; i+=DIST)
        {
            sq = new Square(ORIGIN - i, ORIGIN - i, i*2);
            sq.setStroke(Color.BLACK);
            sq.setStrokeWidth(3);
            sq.setFill(null);
            
            group.getChildren().add(sq);
        }
    }
    
    // 'n' is an integer that increments until it maxes out at SIZE/2
    // See iterative implementation above
    public void sepSquaresRec(int n, Group group)
    {
        if (n > SIZE / 2) return;
        
        Square sq = new Square((SIZE / 2) - n, (SIZE / 2) - n, n*2);
        sq.setStroke(Color.BLACK);
        sq.setStrokeWidth(3);
        sq.setFill(null);
        
        group.getChildren().add(sq);
        
        sepSquaresRec(n + DIST, group);
    }
    
    class Square extends Rectangle
    {
        public Square(double x, double y, double size)
        {
            super(x, y, size, size);
        }
    }
}
