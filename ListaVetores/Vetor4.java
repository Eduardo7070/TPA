import java.util.*;
public class Vetor4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM=10;
		int i, a[], maior=0, menor=0; 
		
		a =  new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º número a ser lido ");			
			a[i] = ler.nextInt();
			maior = a[i];
			menor = a[i];
			
	}
		for(i=0; i<TAM; i++) {
			if (a[i]>maior){
				maior = a[i];
			}else if(a[i]<menor) {
				menor = a[i];
			}
		}
		System.out.println("O Maior número é: "+maior);
		System.out.println("O Menor número é: "+menor);
		
		

}
}