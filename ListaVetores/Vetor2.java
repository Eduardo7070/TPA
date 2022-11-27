import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	int i, x, a[], b[];
		final int TAM=10;
		a = new int[TAM];
		b = new int [TAM];
		x=9;
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º Numero do Vetor ");			
			a[i] = ler.nextInt();
			b[x] = a[i];
			x--;
			
					
		}
		System.out.print("\nVetor A [ ");
		for (i=0; i<TAM; i++) {
			System.out.print(a[i]+"  ");
			
		}
		System.out.print(" ] ");
		
		System.out.print("\nVetor B [  ");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print(" ] ");
	}
	


	}


