import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int i, anoA, anoN,idade, maior=1, menor=1;
		
		for (i=1; i<=10; i++) {
			System.out.println("Digite o ano atual do "+i+"° usuario ");
			anoA = ler.nextInt();
		
		System.out.println("Digite o ano de nascimento do "+i+"° usuario");
			anoN = ler.nextInt();
		
			idade = anoA - anoN;
		System.out.println("Você tem "+idade+" anos de idade");
		
		if (idade>maior){
			maior = idade;
		} else {
			menor = idade;
		}
		}
		System.out.println("O MAIS VELHO TEM "+ maior+ " ANOS");
		System.out.println("O MAIS NOVO TEM "+menor+" ANOS");
	}

}
