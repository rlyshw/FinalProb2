package view;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class FormController {
	@FXML
	private TextField Gross;
	@FXML
	private TextField Debt;
	@FXML
	private TextField Interest;
	@FXML
	private ChoiceBox Term;
	@FXML
	private TextField Down;
	@FXML
	private Button Submit;
	@FXML
	private Button Clear;
	@FXML
	private Label HousePayment;
	@FXML
	private Label WithObligations;
	@FXML
	private Label MaxAllowed;
	@FXML
	private Label Financeable;

	@FXML
	public void updateVals(Event i){
		Double gross;
		try{
			gross = Double.parseDouble(Gross.getText());
		} catch(Exception e){
			System.out.println("Incorrect input");
			i.consume();
			gross = 0.0;
		}
		HousePayment.setText(new Double(.18*gross).toString());
		WithObligations.setText(new Double(.36*gross).toString());
	}
	@FXML
	public void onlyNum(final Event arg0) {
	    String key = ((KeyEvent)arg0).getCharacter();
	    try{
	    	Double.parseDouble(key);
	    } catch(Exception e){
	    	System.out.println("Invalid Key Press");
	    	arg0.consume();
	    }
    }

}
