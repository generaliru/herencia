
public class Main {

	public static void main(String[] args) {
		
		Perro perro = new Perro("Scannor",2,"Electrico");
		System.out.println(perro.getNombre());
		System.out.println(perro.getEdad());
		System.out.println(perro.getRaza());
		System.out.println(perro.ladrar());
		System.out.println(perro.comer());
		System.out.println(perro.dormir());
		
		Gato gato = new Gato("Vianca",6,"Blanco");
		System.out.println(gato.getNombre());
		System.out.println(gato.getEdad());
		System.out.println(gato.getColor());
		System.out.println(gato.maullar());
		System.out.println(gato.comer());
		System.out.println(gato.dormir());
		
	}

}
