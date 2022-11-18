import java.util.Scanner;
public class Segundo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
				
		int idade, i;
		int faixa1=0, faixa2=0, faixa3=0, faixa4=0, faixa5=0;
		double p1, p2, p3, p4, p5;
		
		for (i=1;i<=15;i++) {
		System.out.println("Informe a idade do "+i+"° usuario: ");
			idade = ler.nextInt();
			if (idade<=15) {
				faixa1=faixa1 + 1;
			}
			else if (idade>15 && idade<=30) {
				faixa2 = faixa2 + 1;
			}
			else if (idade>30 && idade<=45) {
				faixa3 = faixa3 +1;
			}
			else if (idade>45 && idade<=60) {
				faixa4 = faixa4 +1;
			}
			else {
				faixa5 = faixa5 + 1;
			}
		}
		p1 = (100*faixa1)/15;
		p2 = (100*faixa2)/15;
		p3 = (100*faixa3)/15;
		p4 = (100*faixa4)/15;
		p5 = (100*faixa5)/15;
		System.out.println("A faixa 1 possui "+faixa1+" pessoas.");	
		System.out.println("PORCENTAGEM: "+p1);
		System.out.println("A faixa 2 possui "+faixa2+" pessoas.");
		System.out.println("PORCENTAGEM: "+p2);
		System.out.println("A faixa 3 possui "+faixa3+" pessoas.");
		System.out.println("PORCENTAGEM: "+p3);
		System.out.println("A faixa 4 possui "+faixa4+" pessoas.");
		System.out.println("PORCENTAGEM: "+p4);
		System.out.println("A faixa 5 possui "+faixa5+" pessoas.");
		System.out.println("PORCENTAGEM: "+p5);
	}

}
