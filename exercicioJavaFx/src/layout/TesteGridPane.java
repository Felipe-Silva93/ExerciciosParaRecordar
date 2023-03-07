package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane{
	
	public TesteGridPane() {
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		setGridLinesVisible(true);
		getColumnConstraints().addAll(cc(),cc(),fcc(),cc(),cc());//cada vez que chama esse metodo ele adiciona uma coluna
		getRowConstraints().addAll(rc(),rc(),rc(),rc(),rc());
	
		setVgap(10);
		setHgap(10);
		
		add(c1,0,0,2,2);//o objeto c1 vai ocupar linha 0 coluna 0, caso queira espandir add(c1,0,0,2,1)
		add(c2,1,1,2,2);
		add(c3,4,2,1,3);
		add(c4,3,1);
		add(c5,0,4,2,1);
		add(c6,3,3);
		
	}
	
	
	//como a coluna vai se comporta
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20);//tera 20 por cento da tela
		cc.setFillWidth(true);
		return cc;
	}
	
	//deixando a coluna fixa
	private ColumnConstraints fcc() {
		ColumnConstraints cc = new ColumnConstraints();
		//cc.setPercentWidth(20);//tera 20 por cento da tela
		cc.setMinWidth(200);
		cc.setMaxWidth(200);
		cc.setFillWidth(true);
		return cc;
	}
	
	//como a linha vai se comportar
	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20);
		rc.setFillHeight(true);//preencher altura
		return rc;
	}
}
