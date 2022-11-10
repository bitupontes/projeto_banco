package projeto_banco;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1= new Cliente(); // Novo objeto da Classe cliente Chamado cliente1
		cliente1.conta = new Contas();
		
		cliente1.nome = "Bombom";
		cliente1.cpf = "1234";
		cliente1.conta.numero = 1234;
		cliente1.conta.saldo = 1299;
		
		Contas conta1 = new Contas();
		conta1.numero = 8888;
		conta1.saldo = 999;
		
		Cliente cliente2 = new Cliente();
		cliente2.conta = conta1;
	}

}
