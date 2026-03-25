package Clinicaveterinaria;

public class Gato extends Domestico implements ContactaPropietario{


	public Gato(Sexo sexo, double peso, Propietario propietario, String nombre, int edad, String raza, String codigo) {
		super(sexo, peso, propietario, nombre, edad, raza, codigo);
	}

	
	@Override
	public void cortarUnas() {
		if(peso<0) {
			System.out.println("El peso no puede ser negativo!!");
		}else {
			peso=getPeso()-20;
		}
	}

	@Override
	public String toString() {
		return "Gato [id=" + id + ", sexo=" + sexo + ", peso=" + peso + ", propietario=" + propietario + "]";
	}



	@Override
	public void contactaPropietario() {
		System.out.println("Contactando al Propietario del Gato");
	}
	
	
}
