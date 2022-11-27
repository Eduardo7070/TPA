import java.util.Scanner;
public class Inss {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double sf, des;
		
		for(int i=0; i<=4; i++ ) {

			System.out.println("Digite seu salario:");
			sf = ler.nextDouble();
			if(sf<=2000){
				des = sf*8.5/100;	
				System.out.println("O valor descontado do seu salario sera de:"+des);
				}else if (sf>2000) {
					des = sf*11/100;
					System.out.println("O valor descontado do seu salario sera de:"+des);
			
		
		
		
		
	}
		
		}
	}

}
