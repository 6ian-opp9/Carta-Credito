import java.util.Scanner;
public class cartaCreditoDemo {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		
		System.out.print("Inserisci il numero di carta: ");
		String Info_Carta = s1.nextLine();
		
		System.out.print("Inserisci il nome e il cognome del proprietario della carta: ");
		String Proprietario = s1.nextLine();

		System.out.print("Inserisci la data di scadenza della carta: ");
		String Scadenza = s1.nextLine();
		
		System.out.print("Inserisci il pin della carta: ");
		String passcode = s1.nextLine();
		
		System.out.print("Inserisci il saldo del conto corrente: ");
		double accredito = s2.nextDouble();
		
		System.out.println(" ");
		
		System.out.println("Digita 1 se vuoi vedere la carta ex-nova; 2 se vuoi vedere la tua carta.");
		int sel = s2.nextInt();
		
		System.out.println(" ");
		
		cartaCredito carta1 = new cartaCredito ();
		
		cartaCredito carta2 = new cartaCredito (Info_Carta, Proprietario, Scadenza, passcode, accredito);
		
		if (sel == 1) {
			
			System.out.println("Carta 1");
			System.out.println(" ");
			System.out.println(carta1.to_String());
		}
		else {
			
			System.out.println("Carta 2");
			System.out.println(" ");
			System.out.println(carta2.to_String());
		}
		
		System.out.println(" ");
		
		System.out.println("Digita 1 se vuoi prelevare; 2 se vuoi depositare.");
		int operazione = s1.nextInt();
		
		switch(operazione) {
		    
		case 1:
			
			System.out.print("Inserisci quanto vuoi prelevare: ");
			int prelievo = s2.nextInt();
			
			if (prelievo > accredito) {
				System.out.println(" ");
				System.out.println("Il prelievo supera il saldo sul conto.");
				break;
			}
			
			System.out.println(" ");
			
            System.out.println("Attenzione, se si sbaglia il pin 5 volte la carta verrà bloccata.");
            
            System.out.println(" ");
            
			for (int i = 0; i < 6; i++) {
				
				if (i == 5) {
					System.out.println(" ");
					System.out.println("Troppi tentativi, carta bloccata.");
					break;
				}
				
				System.out.print("Inserisci pin: ");
				String codice = s3.nextLine();
				
				if (codice.equals(passcode)) {
					System.out.println(" ");
					System.out.println("Il conto, dopo aver prelevato, contiene: " + carta2.Fai_Prelievo(prelievo) + "€."); 
					break;
				}
				else if (i < 4){
					System.out.println("Riprova");
				}
			}
		break;	
		
		case 2: 
			
			System.out.println("Inserisci quanto vuoi depositare: ");
			int deposito = s2.nextInt();
			
			System.out.println(" ");
			
            System.out.println("Attenzione, se si sbaglia il pin 5 volte la carta verrà bloccata.");
            
            System.out.println(" ");
            
			for (int i = 0; i < 6; i++) {
				
				if (i == 5) {
					System.out.println(" ");
					System.out.println("Troppi tentativi, carta bloccata.");
					break;
				}
				
				System.out.print("Inserisci pin: ");
				String codice = s3.nextLine();
				
				if (codice.equals(passcode)) {
					System.out.println(" ");
					System.out.println("Il conto, dopo aver depositato, contiene: " + carta2.Fai_Deposito(deposito) + "€.");
					break;
				}
				else if (i < 4){
					System.out.println("Riprova");
				}
			}
		 break;	
		 
		 default:
			
			 System.out.println(" ");
			 System.out.println("Selezione sbagliata.");
			 break;
			 
		}
	}
}