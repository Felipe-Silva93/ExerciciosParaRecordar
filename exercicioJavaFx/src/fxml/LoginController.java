package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML //anotação para dizer que esses atributos pertencen ao arquivo fxml
	private TextField campoEmail;
	@FXML
	private PasswordField campoSenha;	
	
	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("felipe@brasil.com.br");
		boolean senhaValida = campoSenha.getText().equals("123456");
		
		
		if(emailValido && senhaValida) {
			Notifications.create().title("Login FX")
			.position(Pos.TOP_RIGHT)
			.text("Login efetuado com sucesso")
			.showInformation();
		}else {
			Notifications.create().title("Login FX")
			.position(Pos.TOP_RIGHT)
			.text("usuario ou senha invalido")
			.showError();
		}
	}
}
