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
		cliente2.nome = "Handreya";
		cliente2.cpf = "3434";
		cliente2.conta = conta1;
		
		Cliente cliente3 = new Cliente();
		cliente3.nome = "Carlão";
		cliente3.cpf = "1221";
		cliente3.conta = conta1;
	}

}
