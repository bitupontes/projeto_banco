package projeto_banco;

public class Contas {
	
	int numero;
	double saldo;

	private static int valorRandom = 1; // Mantem alterações
	
	void setSaque(double valor) {
		
		if (valor <= saldo) {
		this.saldo -= valor;
		}	
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
	public void setRandom() {
		this.numero = valorRandom;
		valorRandom++;
		
	}
	
}

	
