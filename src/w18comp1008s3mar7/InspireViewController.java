package w18comp1008s3mar7;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class InspireViewController implements Initializable
{
    @FXML private TextArea textArea;

    /**
     * This is the first method called when the view is loaded
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        textArea.setText("Code what you like and like what you code...");
    }    
    
    /**
     * This method will update the text area with a super inspirational
     * message.  You build the code in here!!
     */
    public void inspireButtonPushed()
    {
        
    }
    
}
