package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Observador");// como construtor rece be o titulo do rograma como parametro
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// feixar janela e parar a aplicação a mesmo tempo

		janela.setSize(600, 200);
		JButton botao = new JButton("Clicar");
		janela.add(botao);
		janela.setLayout(new FlowLayout());// dar outro formato para o botão
		janela.setLocationRelativeTo(null);// passando nullo centraliza na tela do pc
		janela.setVisible(true);// visualizar janela

		// chamando o observable
		/*botao.addActionListener(new ActionListener() {//passando new ActionListener()  como parametro o java cria uma classe anonima
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("evento ocorreu");
			}
		});*/
		
		//fazendo com funcional ficara assim 
		
		botao.addActionListener(e->{
			System.out.println("evento ocorreu");
		});
			
		

	}

}
