package Nivell1_Ex1;

public class Persona {
	private String nombre;
	private Integer edad;
	public Persona(String nombre, Integer edad) {
		
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona() {
		this.nombre=null;
		this.edad=null;
	}
	
	public void presentar() {
		System.out.println("Soy "+ nombre+ ", tengo "+edad+" años.");
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	
}


class Vecino extends Persona{
	private String piso;

	public Vecino(String nombre, Integer edad, String piso) {
		super(nombre, edad);
		this.piso = piso;
	}

	@Override
	public void presentar() {
		System.out.println("Soy "+ super.getNombre()+ ", tengo "+super.getEdad()+" años y vivo en el "+piso);
	}
	
}