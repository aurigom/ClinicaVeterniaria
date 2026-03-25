package Clinicaveterinaria;

public class Perro extends Domestico implements ContactaPropietario{


	public Perro(Sexo sexo, double peso, Propietario propietario, String nombre, int edad, String raza, String codigo) {
		super(sexo, peso, propietario, nombre, edad, raza, codigo);
	}
	
	@Override
	public void cortarUnas() {
		if(peso<0) {
			System.out.println("El peso no puede ser negativo!!");
		}else {
			peso=getPeso()-50;
		}
	}
	
	public void damePatita() {
		System.out.println("El perro "+getNombre()+" te da la patita.");
	}



	@Override
	public String toString() {
		return "Perro [id=" + id + ", sexo=" + sexo + ", peso=" + peso + ", propietario=" + propietario + "]";
	}

	@Override
	public void contactaPropietario() {
		System.out.println("Contactando al Propietario del Perro");
		
	}

	
		
}
