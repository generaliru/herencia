
/**
 * Esta clase hija hereda de clase animal i define los metodos
 * y atributos para un perro.
 * @author uriel
 *
 */
public class Perro extends Animal {
	
	String raza;
	
	/**
	 * El constructor asigna y envía los datos de sus parametros
	 * a la clase padre.
	 * @param nombre 
	 * @param edad
	 * @param raza
	 */
	Perro(String nombre, int edad, String raza){
		super(nombre, edad);
		this.raza = raza;
	}
	
	public String ladrar() {
		return "Guuau!!";
	}

	@Override
	public String comer() {
		return "Comiendo -> Hueso";
	}

	@Override
	public String dormir() {
		return "Durmiendo en el sesped";
	}

	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}
}
