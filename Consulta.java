package ClinicaVeterinaria1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private LocalDate fecha;
    private int idAnimal;
    private String diagnostico;
    private List<Medicamento> medicamentos = new ArrayList<>();

    public Consulta(LocalDate fecha, int idAnimal, String diagnostico) {
        this.fecha = fecha;
        this.idAnimal = idAnimal;
        this.diagnostico = diagnostico;
    }

    public void addMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    public boolean removeMedicamento(String nombre) {
        return medicamentos.removeIf(m -> m.getNombre().equals(nombre));
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}