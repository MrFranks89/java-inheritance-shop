import java.util.Scanner;

public class Carrello {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Scegli quale prodotto acquistare\n"
				+ "1 - Smartphone\n"
				+ "2 - Televisore\n"
				+ "3 - Cuffie");
		
		int scelta = scan.nextInt();
		Prodotto prodottoAcquisto = null;
		switch(scelta) {
		case 1: {
			System.out.println("Hai inserito uno Smartphone nel carrello.");
			prodottoAcquisto = new ProdottoSmartphone("Redmi Note 13", "Xiaomi", 699.99, 0.22);
			break;
		}
		
		case 2:{
			System.out.println("Hai inserito una Televisione nel carrello.");
			prodottoAcquisto = new ProdottoSmartphone("Redmi Note 13", "Xiaomi", 699.99, 0.22);
			break;
		}
	}	
}
	}