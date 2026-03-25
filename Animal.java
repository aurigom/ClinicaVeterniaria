package ClinicaVeterinaria1;

public abstract class Animal {
    protected static int contador = 0;

    protected int id;
    protected Sexo sexo;
    protected double peso;
    protected Propietario propietario;


    public Animal(Sexo sexo, double peso, Propietario propietario) {
        this.id = ++contador;
        this.sexo = sexo;
        this.peso = peso;
        this.propietario = propietario;
    }

   
    public abstract void contactarPropietario();

    public int getId() {
        return id;
    }

    public double getPeso() {
        return peso;
    }

   
}