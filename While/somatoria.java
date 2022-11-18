import java.util.Scanner;
public class somatoria {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i=1, resultado=0;
		
		while (i<100) {
		resultado = i+resultado;
		i++;
		}
		System.out.println(resultado);
		ler.close();
		}
		}


