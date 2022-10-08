

import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

	int n, r, i=1;
	
	System.out.println("Digite um numero");
	n = ler.nextInt();
	System.out.println("a tabuada de "+n+" sera");
	while(i<=10) {
		r = n*i;
		System.out.println(n+"x"+i+"="+r);
		i = i+1;
	}
	ler.close();
	}

}
