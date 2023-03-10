package layout;


import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane{
	
	public TesteStackPane() {
	
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		getChildren().addAll(c2,c3,c4,c5,c6,c1);
		
		setOnMouseClicked(e ->{
			//capturar se o usuario clicou no lado direito ou equedo da tela
			if(e.getSceneX()>getScene().getWidth()/2) {
				getChildren().get(0).toFront();
			}else {
				getChildren().get(5).toBack();

			}
		});
			//trabalhando com thread com javafx
			Thread t = new Thread(()-> {
				while(true) {
					try {
						Thread.sleep(3000);//da uma pausa de 3 segundos
						
						Platform.runLater(()->{//altera
							getChildren().get(0).toFront();

						});//atualizar a tela no momento certo
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						System.out.println(e1.getMessage());
					}

				}
			});
		t.setDaemon(true);//se a thread principal parar tudo vai parar
		t.start();
	}
}
