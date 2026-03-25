package Clinicaveterinaria;

import java.time.LocalDate;

import java.util.ArrayList;

import java.util.Collections;

import java.util.HashMap;

import java.util.LinkedHashSet;

import java.util.List;

import java.util.Map;

import java.util.Set;

public class Clinica {
	
	private Map<Integer, List<Consulta>> consultas;
    private List<Animal> animales;
	public Clinica() {
		consultas = new HashMap<>();;
		animales =  new ArrayList<>();		
	}  
	/////////////////////////////////////////////
	public List<Perro> perrosByRaza(boolean asc) {
	    List<Perro> perros = new ArrayList<>();
	    for (Animal a : animales) {
	        if (a instanceof Perro) {
	            perros.add((Perro) a);
	        }
	    }
	    if (asc) {
	        Collections.sort(perros, new Comparator<Perro>() {
	            @Override
	            public int compare(Perro p1, Perro p2) {
	                return p1.getRaza().compareTo(p2.getRaza());
	            }
	        });
	    } else {
	        Collections.sort(perros, new Comparator<Perro>() {
	            @Override
	            public int compare(Perro p1, Perro p2) {
	                return p2.getRaza().compareTo(p1.getRaza());
	            }
	        });
	    }
	    return perros;
	}	
	/////////////////////////////////////////////////////////	
	public Set<Consulta> getConsultas(int idAnimal) throws Exception {
        if (!consultas.containsKey(idAnimal)) {
            throw new Exception("noSeEncuentraAnimalException");
        }
        return new LinkedHashSet<>(consultas.get(idAnimal));
    }
	/////////////////////////////////////////////
	  public Set<Medicamento> getMedicamentosByAnimal(int idAnimal,
              LocalDate inicio,
              LocalDate fin) throws Exception {
			if (!consultas.containsKey(idAnimal)) {
				throw new Exception("noSeEncuentraAnimalException");
			}
			
			Set<Medicamento> resultado = new LinkedHashSet<>();
			
			for (Consulta c : consultas.get(idAnimal)) {
				if (!c.getFecha().isBefore(inicio) && !c.getFecha().isAfter(fin)) {
					resultado.addAll(c.getMedicamentos());
				}
			}

				return resultado;
			}

	  ////////////////////////////////////////////////////////////////

}  