package atividadesPOO2;

public class Pessoa {
	String nome;
	int idade;
	long cpf;
	int rg;
	String endereco;
	String profissao;
	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade (int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	public String getProfissao(){
		return profissao;
	}
	public void setProfissao (String profissao) {
		this.profissao = profissao;
	}
	public long getCPF() {
		return cpf;
	}
	public void setCPF (long cpf) {
		this.cpf = cpf;
	}
	public int getRG() {
		return rg;
	}
	public void setRG (int rg) {
		this.rg = rg;
	}
}
