/**
 * Esta clase hija hereda de Animal y contiene los metodos y
 * atributos que definen a un gato.
 * @author uriel
 *
 */
public class Gato extends Animal implements Mascota, Cuidados {
	
	private String color;
	
	Gato(String nombre, int edad, String color){
		super(nombre, edad);
		this.color = color;
	}
	
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * 
	 * @return the sound
	 */
	public String maullar() {
		return "Miauu!!";
	}

	@Override
	public String comer() {
		return "Comiendo -> Atun";
	}
	
	@Override
	public String dormir() {
		return "Durmiendo en el sillon";
	}

	@Override
	public String trucos() {
		return "Ronrronear";
	}

	@Override
	public String premio() {
		return "Bola de Estambre";
	}

	@Override
	public String irAlVeterinario() {
		return "Una vez al mes";
	}

	@Override
	public String bañar() {
		return "una vez cada 15 dias";
	}

	@Override
	public String alimentacion() {
		return "3 veces al día";
	}
	
}
