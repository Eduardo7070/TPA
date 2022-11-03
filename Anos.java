import java.util.Scanner;
public class Anos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		int anoAT, anoN, idade, i;
		
		do {
			System.out.println("Digite o ano Atual:");
			anoAT = ler.nextInt();
			System.out.println("Digite o ano do seu Nascimento:");
			anoN = ler.nextInt();
			idade = anoAT - anoN;
			System.out.println("Sua idade é:"+idade);
			System.out.println("Deseja continuar? Digite 1- para sim, 2- para não");
			i= ler.nextInt();
	}while(i==1);
	
	}

}

