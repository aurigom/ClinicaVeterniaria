package RetoClinica;

public abstract class Animal implements ContactaPropietario{
	private static int contador = 1;
    protected int id;
    protected tipoSexo tipoSexo;
    protected int peso;
    protected Propietario propietario;

    public Animal(tipoSexo tipoSexo, int peso) {
    	this.id=contador++;
    	this.tipoSexo = tipoSexo;
    	this.peso = peso;
    	this.propietario = null;
        
    }
    
    public int getid(){
    	return id;
    }
    
    public abstract void contactaPropietario();
    
}