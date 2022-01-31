package Nivell1_Ex2;



public class GestionPersonas {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vecino vecino1 = new Vecino("Juan", 25, "primer piso.");
		vecino1.presentar();
		
		
		vecino1.saludar();
		vecino1.saludarVecino();
		

	}

}
