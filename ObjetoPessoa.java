package atividadesPOO2;

public class ObjetoPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("California, USA");
		pessoa1.setProfissao("Ator");
		pessoa1.setCPF(12345678910l);
		pessoa1.setRG(123456789);

		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami, USA");
		pessoa2.setProfissao("Jogador de Futebol");
		pessoa2.setCPF(22222222222l);
		pessoa2.setRG(333333333);

		System.out.println("----- OBJETO 1-----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.getCPF());
		System.out.println(pessoa1.getRG());

		System.out.println("----- OBJETO 2-----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa2.getCPF());
		System.out.println(pessoa2.getRG());
	}
}
