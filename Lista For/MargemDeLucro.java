
import java.util.Scanner;
public class MargemDeLucro {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		int precoProduto, lucro, venda;
		
		System.out.println("Digite o preço que o produto foi comprado :");
		precoProduto = ler.nextInt();
		
		System.out.println("Digite o valor que voce quer vender este produto :");
		venda = ler.nextInt();
		
		lucro = venda-precoProduto;
		lucro = lucro/precoProduto*100;
		System.out.println("Sua porcentagem de lucro é de "+lucro+"%");
		
		

	}

}
                                  