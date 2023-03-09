package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//lendo o caminho do arquico fxml
		URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
		GridPane raiz = FXMLLoader.load(arquivoFXML);
		String arquivoCss = getClass().getResource("/fxml/Login.css").toExternalForm();
		Scene cena = new Scene(raiz,350 ,350);//arquivo fxml + tamanho da tela
		cena.getStylesheets().add(arquivoCss);//iniciando o arquivo css
		
		primaryStage.setResizable(false);//deixa o tamanho da tela fixa
		primaryStage.setTitle("Tela de Login");
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}
	
	public static void main(String[]args) {
		launch(args);
	}

}
