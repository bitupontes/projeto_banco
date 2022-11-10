package projeto_banco;

public class Cliente {

	String nome;
	String cpf; // private String cpf -> não permite que outras classes manipulem o objeto
	
	Contas conta;
	
	
	//Construtor
	public Cliente(String nome, String cpf) { // Ao criar o new devemos informar os valores (ao instanciar).
		this.nome = nome;
		this.cpf = cpf;
	}
}
