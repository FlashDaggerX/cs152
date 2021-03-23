import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * @author (Kyle Guarco)
 * @version (July 27, 2020)
 */
public class FXDrawing extends Application
{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    @Override
    public void start(Stage stage)
    {
        Pane root = new Pane();
        root.setStyle("-fx-background-color: #A6E6F4;");

        Group grpOcean = new Group(),
              grpBeach = new Group(),
              grpSky = new Group();

        createSky(grpSky);
        createOcean(grpOcean);
        createBeach(grpBeach);

        root.getChildren().addAll(grpSky, grpOcean, grpBeach);

        // JavaFX must have a Scene (window content) inside a Stage (window)
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        stage.setTitle("Kyle Guarco - The Beach!");
        stage.setScene(scene);

        // Show the Stage (window)
        stage.show();
    }

    private void createSky(Group grp) 
    {
        final int X = WIDTH / 12;
        final int Y = HEIGHT / 12;
        final int SSIZE = 36;
        final int RAY_COUNT = 16;
        
        Circle sun = new Circle(X, Y, SSIZE/2);
        sun.setFill(Color.YELLOW);
        
        grp.getChildren().add(sun);
        
        // Create the sun's rays (I want 12)
        Line ray;
        // Add them one by one. Store the current angle (in degrees) in 'deg'
        int deg = 0;
        for (int i = 0; i < RAY_COUNT && deg < 360; i++)
        {
            ray = new Line(X - SSIZE, Y - SSIZE, X + SSIZE, Y + SSIZE);
            ray.setStroke(Color.YELLOW);
            ray.setRotate(deg);
            
            grp.getChildren().add(ray);
            
            deg += 360 / RAY_COUNT;
        }
    }
    
    private void createOcean(Group grp) 
    {
        final int X = WIDTH;
        final int Y = HEIGHT / 2;
        
        Rectangle ocean = new Rectangle(0, Y - (Y / 3), X, Y);
        ocean.setFill(Color.BLUE);

        grp.getChildren().add(ocean);
    }

    private void createBeach(Group grp) 
    {
        final int X = WIDTH;
        final int Y = HEIGHT / 2;
        
        final int BALL_SIZE = 64;
        final Color[] BALL_COLORS = {Color.WHITE, Color.YELLOW, Color.RED};
        
        Rectangle sand = new Rectangle(0, Y + (Y / 2), X, Y / 2);
        sand.setFill(Color.YELLOW);
        
        grp.getChildren().add(sand);

        // Let's make a colorful ball! 
        Circle ball;
        
        int color_idx = 0;
        for (int i = BALL_SIZE; i > 0; i-=(BALL_SIZE/BALL_COLORS.length)+1)
        {
            ball = new Circle(X - (X / 4), Y + (Y / 2), i);
            ball.setFill(BALL_COLORS[color_idx % BALL_COLORS.length]);

            grp.getChildren().add(ball);
            
            color_idx++;
        }
    }
}
