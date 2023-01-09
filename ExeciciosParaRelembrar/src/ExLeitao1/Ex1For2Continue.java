package ExLeitao1;

public class Ex1For2Continue {

	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++) {
			if(i%2==1) {
				continue;//interrompe apenas essa interação  vai para proxima linha e depois volta
			}
			System.out.println(i);
		}
		
	}

}
