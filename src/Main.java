

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Prodotto p1 = new Prodotto("monitor", "monitor LG 32\" a schermo piatto",  173.31, 0.22);
		//p1.nome = "monitor";
		//p1.descrizione = "monitor LG 32\" a schermo piatto";
		//p1.prezzo = 173.31;
		//p1.iva = 22;
		//p1.setCodice();
//		System.out.println("Il codice del prodotto è " + p1.codice);
//		System.out.println("Il nome esteso del prodotto è " + p1.nomeEsteso());  
//		System.out.println("Prezzo con IVA: " + String.format("%.2f", p1.calcolaPrezzoConIVA()) + "€"); 
	
		Prodotto p3 = new Prodotto("Stampante","Stampante Canon", 49.9, 0.22);
		//p3.prezzo = 49.9;
		//p3.setCodice();
		
		System.out.println("p1 code: " + p1.getCodice() + ", p3 code: " + p3.getCodice());
		
		System.out.println("Per ottenere informazioni sui prodotti "
				+ "digitare il codice " + p1.getCodice() + " o " + p3.getCodice());
	
		Scanner scan = new Scanner(System.in);
		
		int scelta = scan.nextInt();
		boolean fine = false; //serve per terminare il while
		
		while(!fine) { //da non fare mai (scelta == p1.codice || scelta == p3.codice) perché si impalla il codice. 
			//Perché scelta è diversa da p1 e da p3 quindi il while salta proprio tutto. Rimane sempre true.
			// mettendo scelta !== passa all'else, poi parte un loop infinito in caso di codice giusto. 
			//Lo fa perché gli si dice "devi andare avanti finché è diverso" ma non ci sono condizioni di uscita. in caso di && al posto degli || non sarebbe mai vero
			//se la scelta è codice 1 sarà stampato questo
			/*if(scelta == p1.getCodice()) {
				System.out.println("Il codice del prodotto è " + p1.getCodice());
				System.out.println("Il nome esteso del prodotto è " + p1.nomeEsteso());  
				System.out.println("Prezzo con IVA: " + String.format("%.2f", p1.calcolaPrezzoConIVA()) + "€"); 
				fine = true;
			} else if(scelta == p3.getCodice()) {//sennò sarà questo a essere stampato
				System.out.println("Il codice del prodotto è " + p3.getCodice());
				System.out.println("Il nome esteso del prodotto è " + p3.nomeEsteso());  
				System.out.println("Prezzo con IVA: " + String.format("%.2f", p3.calcolaPrezzoConIVA()) + "€"); 
				fine = true;
			} else {//se il codice inserito è sbagliato riparte il ciclo finché non viene messo quello giusto
				System.out.println("Codice non valido, reinserire");
				System.out.println("Per ottenere informazioni sui prodotti "
						+ "digitare il codice " + p1.getCodice() + " o " + p3.getCodice());
				scelta = scan.nextInt();
			}
		}
*/
	}
}}
