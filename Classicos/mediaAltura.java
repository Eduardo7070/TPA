import java.util.Scanner;
public class Terceiro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade, i, maior=0, menor=9999;
		double altura, sA=0, mA;
		
		for (i=1;i<=5;i++) {
			System.out.println("Informe a idade do "+i+"° usuário: ");
				idade = ler.nextInt();
				
				if (idade>maior) {
					maior = idade;
				}else if (idade<menor){
					menor = idade;
				}

				System.out.println("Informe a altura: ");
				altura = ler.nextDouble();
				sA = sA+altura;
		}		
		mA = sA/10;
		System.out.printf("A média das alturas é de: %.2f%n ", mA);
		System.out.println("Mais velho: "+maior);
		System.out.println("Mais novo: "+menor);
	}

}
