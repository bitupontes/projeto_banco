package projeto_banco;

public class Contas {
	
	int numero;
	double saldo;

	void setSaque(double valor) {
		
		if (valor <= saldo) {
		this.saldo -= valor;
		}	
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
}

	
