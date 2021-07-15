/**
 * Esta clase abstracta define los atributos y valores necesarios
 * poder crear cualquier especio de animal.
 * @author uriel
 *
 */
public abstract class Animal {
	
	
	private String nombre;
	private int edad;
	
	/**
	 * El contructor asigna los valores a la clase abstracta. 
	 * @param nombre
	 * @param edad
	 */
	public Animal(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/**
	 * @return the name
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the age
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * @return the action eating
	 */
	public abstract String comer();
	
	/**
	 * 
	 * @return the action sleeping
	 */
	public abstract String dormir();
}
