package RetoClinica;

public class Medicamento {
    private String nombre;
    private int gramos;
    private int precio;

    public Medicamento(String nombre, int gramos, int precio) {
    	this.nombre = nombre;
    	this.gramos = gramos;
    	this.precio = precio;
    }

	public String getNombre() {
		return nombre;
	}

	public int getGramos() {
		return gramos;
	}
    
}
