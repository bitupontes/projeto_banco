package projeto_banco;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1= new Cliente("Bitu", "1234"); // Novo objeto da Classe cliente Chamado cliente1
		cliente1.conta.numero = 999;
		cliente1.conta = new Contas();
		
		Cliente cliente2 = new Cliente ("Matheus", "95");
		cliente2.conta.numero = 787;
		cliente2.conta = new Contas();
		
		
		System.out.println(cliente1.conta.saldo);
		cliente1.conta.setSaque(100); // Forma correta de utilização
		System.out.println(cliente1.conta.saldo);
		
		cliente1.conta.saldo = 1000; //
	}

}
