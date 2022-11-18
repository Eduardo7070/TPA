import java.util.Scanner;
public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		int i = 0;
		int anoAt, anoNasc, idade, escolha;
		
		do {
		System.out.println("Digite o ano atual:");
			anoAt = ler.nextInt();
		System.out.println("Digite o ano de nascimento");
			anoNasc = ler.nextInt();
			idade = anoAt - anoNasc;
		if (idade<18) {
			System.out.println("Você tem "+idade+" anos e é menor de idade!");
			}else {
				System.out.println("Você tem "+idade+" anos e é maior de idade!");
				
			}
		System.out.println("Deseja continuar a execução? 1 para SIM ou 2 para NÃO");
		escolha = ler.nextInt();
		}while (escolha == 1);
	}
}
