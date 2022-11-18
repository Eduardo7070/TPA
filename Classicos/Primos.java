import java.util.*;
public class Classico1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int N;
		int x = 0;
		
		System.out.println("Digite um numero: ");
		N = ler.nextInt();
		for (int i = 1; i<=N; i++) {
			if(N %  i== 0) {
				x++;
			}
		}
		if(x ==2) {
			System.out.println("O numero é primo");
			
	}else {
		System.out.println("O numero não é primo");
	}
}
}