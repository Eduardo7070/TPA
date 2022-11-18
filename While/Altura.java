import java.util.Scanner;
public class Altura {
	public static void main(String[] args) {
		Scanner ler = new  Scanner (System.in);
		
		double j=1.34, i=1, p=1.45;
		
		while(j<p) {
			j= j+0.025;
			p= p+0.020;
			i++;
		}
		
		System.out.println("Joao fica mais alto que Pedro depois de "+i+" anos");
		System.out.println("sendo que Joao tem "+j+" de altura e Pedro tem "+p+" de altura");
		ler.close();
		

	}

}
