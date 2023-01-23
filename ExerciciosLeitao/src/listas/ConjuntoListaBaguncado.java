package listas;

import java.util.HashSet;

public class ConjuntoListaBaguncado {

	public static void main(String[] args) {

		HashSet conjunto =new HashSet();//set não aceita valorer primitivos entãi automaticamente é convertido
		 conjunto.add(1.2);
		 conjunto.add(true);
		 conjunto.add(2);
		 conjunto.add("teste");
		
		 System.out.println( conjunto.size());
	}

}
