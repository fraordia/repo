/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apponsaresmanagement.controllers.travels;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author fran
 */
public class BillCodeController implements Initializable {
    @FXML
    private TextField billCodeTxt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public TextField getBillCodeTxt() {
        return billCodeTxt;
    }
    
}
