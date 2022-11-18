import java.util.Scanner;
public class elevado {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
		int numero, numero2, i, resultado = 0;
		
		System.out.println("Digite o primeiro numero");
		numero = ler.nextInt();
		
		System.out.println("Digite o segundo numero ");
		numero2 = ler.nextInt();
		i = numero2;
		resultado= (numero*numero);
		i = i-1;
		while (i>1) {
			resultado = resultado*numero;
			i=i-1;
		}
		System.out.println(resultado);
		ler.close();
	}
}
