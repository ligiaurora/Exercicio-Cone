package cone;
import java.lang.Math; 


public class Cone {
	//atributos
	private float z;
	private float r;
	private int tinta;
	

	//construtor	
	public Cone(float r, float z, int tinta) {
		setZ(r);
		setR(z);
		setTinta(tinta);
	}
	

	public Cone(float r, int tinta) {
		setR(r);
		setTinta(tinta);
	}
	
	public Cone() {
	}
	
	
	//metodos que criei a parte
	public double geratriz() {			
		return  Math.sqrt(Math.pow(r,2) + Math.pow(z,2));
	}
	public double Fundo() {
		return 3.14 * Math.pow(r,2) ;
	}
	public double Lateral() {
		return 3.14 * r * geratriz();
	}
	public double TotalTintas() {
		return 3.14 * r * (geratriz() + r) ;
	}
	public double Litros() {
		return 3.45 * TotalTintas() ;
	}
	public double Latas() {
		return  Math.round(Litros() / 18) ;
	}
	public double preco() {
		if(tinta == 1) {
			return Latas() * 238.90;
		} else if (tinta == 2) {
			return Latas() * 467.98;
		} else {
			return Latas() * 758.34;
		}
	}
	
	
	//Get e Set
	public float getZ() {
		return z;
	}


	public void setZ(float z) {
		if (z > 0)
			this.z = z;	
	}


	public float getR() {
		return r;
	}


	public void setR(float r) {
		if (r > 0)
			this.r = r;
	}


	public int getTinta() {
		return tinta;
	}


	public void setTinta(int tinta) {
		if (tinta > 0 && tinta < 4)
			this.tinta = tinta;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone [z=");
		builder.append(z);
		builder.append(", r=");
		builder.append(r);
		builder.append(", tinta=");
		builder.append(tinta);
		builder.append("]");
		return builder.toString();
	}


	

	


}
