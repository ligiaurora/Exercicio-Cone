package cone;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cone coneUm = new Cone(15.50f, 6.85f, 2);
		System.out.println("Cone: "+coneUm);
		
		Cone coneDois = new Cone(2.5f, 3);
		coneDois.setZ(6);
		System.out.println("Cone 2: "+coneDois);
		
		
		Cone coneInformacoes = new Cone();
		coneInformacoes.setZ(8);
		coneInformacoes.setR(6);
		coneInformacoes.setTinta(2);
		System.out.println("Cone 3: "+coneInformacoes);
		
	}

}
