import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int N, x=1, y=0;
		System.out.println("Digite um numero: ");
		N = ler.nextInt();
		System.out.println("A sequencia em fibonacci é");
		System.out.println(x);
		
		for(int i=1; i<=N; i++) {
			
			
			x = x + y;
			y = x-y;   
			System.out.println(x);
			
	}
	}
}
