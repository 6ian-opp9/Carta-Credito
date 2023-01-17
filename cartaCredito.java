public class cartaCredito {

	//Attributi
	
	private String NumeroCarta;
	private String Generalita;
	private String Data_Scadenza;
	private String pin;
	private double Saldo;
	
	//Costruttori 
	
	public cartaCredito () {
		this.NumeroCarta = "0000000000000000";
		this.Generalita = "undefined";
		this.Data_Scadenza = "00/0000";
		this.pin = "00000";
		this.Saldo = 0.0;
	}
	
	
	public cartaCredito (String NumeroCarta, String Generalita, String Data_Scadenza, String pin, double Saldo) {
		this.NumeroCarta = NumeroCarta;
		this.Generalita = Generalita;
		this.Data_Scadenza = Data_Scadenza;
		this.pin = pin;
		this.Saldo = Saldo;
	}
	
	//GET 
	
	public String getNumeroCarta() {
		return NumeroCarta;
	}
	public String getGeneralita() {
		return Generalita;
	}
	public String getData_Scadenza() {
		return Data_Scadenza;
	}
	public String getPin() {
		return pin;
	}
	public double getSaldo() {
		return Saldo;
	}
	
	// SET
	
	public void setNumeroCarta(String numeroCarta) {
		NumeroCarta = numeroCarta;
	}
	public void setGeneralita(String generalita) {
		Generalita = generalita;
	}
	public void setData_Scadenza(String data_Scadenza) {
		Data_Scadenza = data_Scadenza;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}


	// Metodo che stampa i dati di una carta da definire.
	
	public String to_String () {
		String result = "Numero Carta: " + NumeroCarta + "\nGeneralità: " + Generalita + "\nData di scadenza: " + Data_Scadenza + "\nSaldo: " + Saldo;
		return result;
	
	}
	
	//Metodo per fare il prelievo, sottare il denaro dal conto
	
	public double Fai_Prelievo(double prelievo) {
		Saldo -= prelievo;
		return Saldo;
		
	}
	
	//Metodo per fare il eposito, aggiunge il denaro al conto
	
	public double Fai_Deposito(double deposito) {
		Saldo += deposito;
		return Saldo;
	} 
	
}