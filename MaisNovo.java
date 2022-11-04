import java.util.Scanner;
public class MaisNovo {

	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    int anoAT,idade,anoN,i = 1,velho,novo;

    
	System.out.println("digite o ano atual");

	anoAT = ler.nextInt();


	System.out.println("digite o ano de nascimento do "+ i + " usuario");

	anoN =	ler.nextInt();

	idade = (anoAT-anoN);

	velho = idade;

	novo = idade;


	for(i = 2;i<= 10;i++) {

		System.out.println("digite o ano de nascimento do "+ i + "usuario");

		anoN =	ler.nextInt();


		idade = (anoAT-anoN);

		if(idade < novo) {

			novo = idade;

		}else if(idade > velho) {

			velho = idade;

		}

}

	System.out.println(" o mais novo tem : "+ novo + "anos" );

	System.out.println("o mais velho tem : "+ velho +"anos");

	ler.close();


}
}