import java.util.*;
public class Prova6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			int  i, a[], soma=0, media=0;
			
			
			a = new int [5];
			
			for (i=0; i<5; i++ ) {
				System.out.println("Digite o preco do "+(i+1)+"º produto ");			
				a [i] = ler.nextInt();
				soma = soma+a[i];
				System.out.println("A soma dos produtos é de: "+soma);
				
	}
			media = soma/5;
			System.out.println("A Media dos de preço dos produtos é de : "+media);
			
			for (i=0; i<5; i++ ) {
				if (i==a[1]) {
					a[1] = a[i];
				}else if(a[i]>a[1]) {
					a[1] = a[i];
					System.out.println("O valor do produto mais caro é de :"+a[1]);
				}
			}
						
				if (soma<=150) {
					System.out.println("Ela consegue comprar");
				}else if (soma>150){
					System.out.println("Ela não consegue comprar");
				}
				
	
}
}

