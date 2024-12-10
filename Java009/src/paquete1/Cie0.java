package paquete1;

public class Cie0 {

	public static void main(String[] args) {
		Monitor m1=new Monitor("Lg",200);
		System.out.print("La marca del monitor es "+m1.getMarca());
		System.out.println(" y cuesta "+m1.getPrecio()+" €");

		System.out.println("***********");
		
		CPU c1=new CPU("IBM","i7",175);
		System.out.print("La marca de la CPU es "+c1.getMarca());
		System.out.print(" ,tiene un procesador "+c1.getProcesador());
		System.out.println(" y cuesta "+c1.getPrecio()+"€");
		
		System.out.println("***********");
		Ordenador o=new Ordenador(m1,c1);
		System.out.println("El precio del ordenador es: "+o.sumaTotal());
	}

}
