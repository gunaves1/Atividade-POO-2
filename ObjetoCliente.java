package atividadesPOO2;

public class ObjetoCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setNome("Gustavo");
		cliente1.setId(01);
		cliente1.setTelefone("999999999");
		cliente1.setCpf("11111111111");
		cliente1.setRg("10101010");
		cliente1.setAnda("Sim");
		cliente1.setEstuda("Sim");
		cliente1.setTrabalha("Não");
		cliente1.setCanta("Não");
		
		cliente2.setNome("João");
		cliente2.setId(02);
		cliente2.setTelefone("888888888");
		cliente2.setCpf("22222222222");
		cliente2.setRg("20202020");
		cliente2.setAnda("Sim");
		cliente2.setEstuda("Não");
		cliente2.setTrabalha("Sim");
		cliente2.setCanta("Sim");
		
		System.out.println("----- CLIENTE 1-----");
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		System.out.println(cliente1.getAnda());
		System.out.println(cliente1.getEstuda());
		System.out.println(cliente1.getTrabalha());
		System.out.println(cliente1.getCanta());
		
		System.out.println("----- CLIENTE 2-----");
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
		System.out.println(cliente2.getAnda());
		System.out.println(cliente2.getEstuda());
		System.out.println(cliente2.getTrabalha());
		System.out.println(cliente2.getCanta());
	}

}
