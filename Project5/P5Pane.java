import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;

/**
 * @author (Kyle Guarco)
 * @version (July 29, 2020)
 */
public class P5Pane extends GridPane
{
    private Label outYards, outFeet, outInches;
    private TextField inputInches;

    public P5Pane()
    {
        setAlignment(Pos.CENTER);
        setStyle("-fx-background-color: #20AB20;");
        
        this.outYards = new Label();
        this.outFeet = new Label();
        this.outInches = new Label();
        
        this.inputInches = new TextField();
        this.inputInches.setOnAction(this::onTextUpdate);
        
        Label lblInput = new Label("Input inches in range 0 to 100000: ");
        Label lblYards = new Label("Yards: ");
        Label lblFeet = new Label("Feet: ");
        Label lblInches = new Label("Inches: ");
        
        add(lblInput, 0, 0);
        add(inputInches, 1, 0);
        
        add(lblYards, 0, 1);
        add(outYards, 1, 1);
        
        add(lblFeet, 0, 2);
        add(outFeet, 1, 2);
        
        add(lblInches, 0, 3);
        add(outInches, 1, 3);
    }
    
    // Updates all the conversion labels when the 'inputInches' field is updated.
    private void onTextUpdate(ActionEvent e)
    {
        int conv = 0;
        try {
            // Make sure the inches input is actually a number.
            conv = Integer.parseInt(inputInches.getText());
        } catch (NumberFormatException ex) {
            return;
        }
        
        // Modulo takes the remainder from the conversion. Use modulo to find 
        // the remainders from each conversion, then use that remainder in the last field.
        int yards = conv / 36;
        conv = conv % 36;
        int feet = conv / 12;
        conv = conv % 12;
        
        outYards.setText("" + yards);
        outFeet.setText("" + feet);
        outInches.setText("" + conv);
    }
}
