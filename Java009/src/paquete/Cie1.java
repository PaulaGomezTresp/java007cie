package paquete;

import java.util.ArrayList;

public class Cie1 {

	public static void main(String[] args) {
		ArrayList<Integer> lista=new ArrayList<Integer>();
		lista.add(5);
		lista.add(7);
		lista.add(3);
		lista.add(8);
		lista.add(2);
		lista.add(4);
	int numeroMayor=0;	
		for (int i=0;i<lista.size();i++) {
			if (numeroMayor<lista.get(i)) {
				numeroMayor=lista.get(i);
	}	
		System.out.println(lista.get(i));
		
	}System.out.println("El número mayor es: "+numeroMayor);
	}
}
