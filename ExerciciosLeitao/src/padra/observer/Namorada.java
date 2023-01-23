package padra.observer;

public class Namorada implements ObservadorChagadaAniversariante{

	@Override
	public void chegou(EventoChegadaAniversariante evento) {

		System.out.println("avisar os convidadeos");
		System.out.println("apagar as luzes");
		System.out.println("esperar um pouco");
		System.out.println("e surpresa infeliz kkk");
	}

	
}
