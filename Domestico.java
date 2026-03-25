package Clinicaveterinaria;

public abstract class Domestico extends Animal{

	private String nombre;
	private int edad;
	private String raza;
	private String codigo;

	public Domestico(Sexo sexo, double peso, Propietario propietario, String nombre, int edad, String raza,String codigo) {
		super(sexo, peso, propietario);
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.codigo = codigo;
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract void cortarUnas() ;
	
}
