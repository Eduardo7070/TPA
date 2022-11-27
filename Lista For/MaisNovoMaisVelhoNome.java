import java.util.Scanner; 
public class MaisNovoMaisVelhoNome {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
  
		int idade, velho=0, novo=200  ;
		String nome, nomeV = null , nomeN = null; 
		
			
			
			for(int i=1; i<=4; i++) {
				System.out.println("Digite seu nome:");
				nome = ler.next();
			
				
				System.out.println("Digite sua idade:");
				idade = ler.nextInt();
				
				if(idade>velho){
					
					velho=idade;
					nomeV = nome;
				}else if(idade<=novo){
					novo=idade;
					nomeN = nome;
					
					}
				}
			
		System.out.println(" O mais velho é o "+nomeV+" e ele tem " +velho+" anos ");
	
		System.out.println(" O mias novo é o "+nomeN+" e ele tem "+novo+" anos ");
		
	}

}
