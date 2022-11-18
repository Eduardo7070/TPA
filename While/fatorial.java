import java.util.Scanner;
public class fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int fatorial=0, n, i, r= 0, l;
		
		System.out.println("Digite o número Fatorial");
		n = ler.nextInt();
		i = n;
		l = i-1;
		fatorial = i-1;
		r = (i*fatorial);
		i =i-1;
		while (i>=1) {
		r = r*i;
		i=i-1;	
		}
		r = r/l;
		System.out.println("resultado:"+r);
		ler.close();
	}

}
