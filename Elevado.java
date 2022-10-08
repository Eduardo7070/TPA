import java.util.Scanner;
public class Elevado {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int n, n2, i, r=0;
	
	System.out.println("Digite o primeiro número:");
	n = ler.nextInt();
	System.out.println("Digite o Segundo número:");
	n2 = ler.nextInt();
	i = n2;
	r = (n*n);
	i = i-1;
	while (i>1) {
		r = r*n;
		i = i-1;
	}
	System.out.println(r);
	ler.close();
	}

}
