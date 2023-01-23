package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Observador");//como construtor recebe o titulo do rograma como parametro
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//feixar janela e parar a aplicação a mesmo tempo
		
		janela.setSize(600,200); 
		JButton botao = new JButton("Clicar");
		janela.add(botao);
		janela.setLayout(new FlowLayout());//dar outro formato para o botão
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);//visualizar janela
		
		//chamando o observable
		botao.addActionListener();
		
		
	}

}
