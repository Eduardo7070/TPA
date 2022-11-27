import java.util.*;
public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int tab=1, x, y=1;
		
		System.out.println("Digite um numero para ser tabuado: ");
//nem sei se essa palavra existe 
		x = ler.nextInt();
		for (int i=0; i<10; i++) {
		System.out.println(x+"x"+tab+"="+y);
		tab++;
		y = x*y;
		y = x*tab;
			
		}
	}

}
