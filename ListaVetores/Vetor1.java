import java.util.*;

import java.lang.Math;
public class Vetor1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, a[], b[];
		final int TAM=10;
		a = new int[TAM];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"Numero do Vetor ");			
			a[i] = ler.nextInt();
			b[i] = (int) Math.sqrt(a[i]);
			
					
		}
		System.out.print("\nVetor A [ ");
		for (i=0; i<TAM; i++) {
			System.out.print(a[i]+"  ");
			
		}
		System.out.print(" ] ");
		
		System.out.print("\nVetor B [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print(" ] ");
		
	}
	}



