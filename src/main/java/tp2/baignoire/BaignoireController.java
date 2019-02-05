package tp2.baignoire;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BaignoireController {
	@FXML
	private TextField txtVolume;
	@FXML
	private TextField txtDebitRobinet;
	@FXML
	private TextField txtDebitFuite;
	@FXML
	private Button btnEnregistrer;
	@FXML
	private Button btnRemplir;
	
	private double volume;
	private double debitRobinet;
	private double debitFuite;
	
	public void enregistrerParametres() {
		this.volume = Double.parseDouble(txtVolume.toString());
		this.debitRobinet = Double.parseDouble(txtDebitRobinet.toString());
		this.debitFuite = Double.parseDouble(txtDebitFuite.toString());
	}
	
	public void remplirBaignoire() {
		
	}

}
