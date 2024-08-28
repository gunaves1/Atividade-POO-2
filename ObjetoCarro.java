package atividadesPOO2;

public class ObjetoCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		
		carro1.setCor("Amarelo");
		carro1.setPortas(4);
		carro1.setMarca("Renault");
		carro1.setRodas(4);
		carro1.setTipo("Esportivo");
		carro1.setModelo("Renault Kwid");
		carro1.setAceleracao(10);
		carro1.setUsarFarol("Sim");
		carro1.setVelocMax(200);
		carro1.setVelocMed(110);
		
		carro2.setCor("Vermelho");
		carro2.setPortas(2);
		carro2.setMarca("Chevrolet");
		carro2.setRodas(4);
		carro2.setTipo("Sedan");
		carro2.setModelo("Chevrolet Cobalt");
		carro2.setAceleracao(5);
		carro2.setUsarFarol("Sim");
		carro2.setVelocMax(200);
		carro2.setVelocMed(100);
		
		carro3.setCor("Preto");
		carro3.setPortas(4);
		carro3.setMarca("Fiat");
		carro3.setRodas(4);
		carro3.setTipo("Picapes");
		carro3.setModelo("Fiat Strada Freedom");
		carro3.setAceleracao(7);
		carro3.setUsarFarol("Sim");
		carro3.setVelocMax(180);
		carro3.setVelocMed(110);
		
		carro4.setCor("Azul");
		carro4.setPortas(2);
		carro4.setMarca("Toyota");
		carro4.setRodas(4);
		carro4.setTipo("SUV");
		carro4.setModelo("Toyota SW4");
		carro4.setAceleracao(5);
		carro4.setUsarFarol("Sim");
		carro4.setVelocMax(160);
		carro4.setVelocMed(90);
		
		System.out.println("----- CARRO 1-----");
		System.out.println(carro1.getCor());
		System.out.println(carro1.getPortas());
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getRodas());
		System.out.println(carro1.getTipo());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAceleracao());
		System.out.println(carro1.getUsarFarol());
		System.out.println(carro1.getVelocMax());
		System.out.println(carro1.getVelocMed());
		
		System.out.println("----- CARRO 2-----");
		System.out.println(carro2.getCor());
		System.out.println(carro2.getPortas());
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getRodas());
		System.out.println(carro2.getTipo());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getAceleracao());
		System.out.println(carro2.getUsarFarol());
		System.out.println(carro2.getVelocMax());
		System.out.println(carro2.getVelocMed());
		
		System.out.println("----- CARRO 3-----");
		System.out.println(carro3.getCor());
		System.out.println(carro3.getPortas());
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getRodas());
		System.out.println(carro3.getTipo());
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getAceleracao());
		System.out.println(carro3.getUsarFarol());
		System.out.println(carro3.getVelocMax());
		System.out.println(carro3.getVelocMed());
		
		System.out.println("----- CARRO 4-----");
		System.out.println(carro4.getCor());
		System.out.println(carro4.getPortas());
		System.out.println(carro4.getMarca());
		System.out.println(carro4.getRodas());
		System.out.println(carro4.getTipo());
		System.out.println(carro4.getModelo());
		System.out.println(carro4.getAceleracao());
		System.out.println(carro4.getUsarFarol());
		System.out.println(carro4.getVelocMax());
		System.out.println(carro4.getVelocMed());
	}
}