package atividadesPOO2;

public class ObjetoAviao {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		Aviao aviao3 = new Aviao();
		Aviao aviao4 = new Aviao();
		
		aviao1.setCor("Branco");
		aviao1.setCompanhia("Azul");
		aviao1.setJanelas(65);
		aviao1.setRodas(18);
		aviao1.setAbrePorta("Sim");
		aviao1.setGirarTurb("Sim");
		aviao1.setSubir("Sim");
		aviao1.setDescer("Sim");
		
		aviao2.setCor("Laranja");
		aviao2.setCompanhia("Gol");
		aviao2.setJanelas(64);
		aviao2.setRodas(16);
		aviao2.setAbrePorta("Sim");
		aviao2.setGirarTurb("Sim");
		aviao2.setSubir("Sim");
		aviao2.setDescer("Sim");
		
		aviao3.setCor("Branco");
		aviao3.setCompanhia("Latam");
		aviao3.setJanelas(74);
		aviao3.setRodas(20);
		aviao3.setAbrePorta("Sim");
		aviao3.setGirarTurb("Sim");
		aviao3.setSubir("Sim");
		aviao3.setDescer("Sim");
		
		aviao4.setCor("Azul");
		aviao4.setCompanhia("Air Tahiti Nui");
		aviao4.setJanelas(65);
		aviao4.setRodas(18);
		aviao4.setAbrePorta("Sim");
		aviao4.setGirarTurb("Sim");
		aviao4.setSubir("Sim");
		aviao4.setDescer("Sim");
		
		System.out.println("----- AVIÃO 1-----");
		System.out.println(aviao1.getCor());
		System.out.println(aviao1.getCompanhia());
		System.out.println(aviao1.getJanelas());
		System.out.println(aviao1.getRodas());
		System.out.println(aviao1.getAbrePorta());
		System.out.println(aviao1.getGirarTurb());
		System.out.println(aviao1.getSubir());
		System.out.println(aviao1.getDescer());
		
		System.out.println("----- AVIÃO 2-----");
		System.out.println(aviao2.getCor());
		System.out.println(aviao2.getCompanhia());
		System.out.println(aviao2.getJanelas());
		System.out.println(aviao2.getRodas());
		System.out.println(aviao2.getAbrePorta());
		System.out.println(aviao2.getGirarTurb());
		System.out.println(aviao2.getSubir());
		System.out.println(aviao2.getDescer());
		
		System.out.println("----- AVIÃO 3-----");
		System.out.println(aviao3.getCor());
		System.out.println(aviao3.getCompanhia());
		System.out.println(aviao3.getJanelas());
		System.out.println(aviao3.getRodas());
		System.out.println(aviao3.getAbrePorta());
		System.out.println(aviao3.getGirarTurb());
		System.out.println(aviao3.getSubir());
		System.out.println(aviao3.getDescer());
		
		System.out.println("----- AVIÃO 4-----");
		System.out.println(aviao4.getCor());
		System.out.println(aviao4.getCompanhia());
		System.out.println(aviao4.getJanelas());
		System.out.println(aviao4.getRodas());
		System.out.println(aviao4.getAbrePorta());
		System.out.println(aviao4.getGirarTurb());
		System.out.println(aviao4.getSubir());
		System.out.println(aviao4.getDescer());
	}
}
