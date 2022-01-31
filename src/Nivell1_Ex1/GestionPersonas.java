package Nivell1_Ex1;

public class GestionPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona("Juan", 25);
		persona1.presentar();
		
		Vecino vecino1 = new Vecino("Juan", 25, "primer piso.");
		vecino1.presentar();
	}

}
