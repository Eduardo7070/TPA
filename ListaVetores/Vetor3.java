import java.util.*;
public class Vetor3 {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			final int TAM=10;
			int i, a[];
			a =  new int [TAM];
			
			for(i=0; i<TAM; i++) {
				System.out.println("Digite numeros para saber quais são os pares. Numero: "+(i+1));			
				a[i] = ler.nextInt();
				
				
						
			}
			if(i % 2 == 0){
				System.out.println(a[i]+" É par");
			}else {
				System.out.println(a[i]+"Não é par");
	}
	}
}
