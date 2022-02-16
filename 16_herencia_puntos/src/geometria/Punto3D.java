package geometria;

public class Punto3D extends Punto{
	private int z;
	public Punto3D(int z) {
		super();
		this.z=z;
	}
	
	public Punto3D(int x, int y, int z) {
		super(x,y);//llamamos al constructor que recibe los dos parámetros, x e y
		this.z=z;
	}
	
	//sobrescritura de dibujar()
	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		super.dibujar();
		System.out.println(","+z);
	}
	
}
