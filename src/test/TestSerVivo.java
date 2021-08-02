
package test;

import dominio.AnimalCarnivoro;
import dominio.AnimalHerbivoro;
import dominio.Planta;


/**
 *
 * @author Chalán Dilan ; Quishpi Jordan
 */
public class TestSerVivo {
    public static void main(String[] args){
        Planta planta = new Planta();
        planta.setNombre("Sabila");
        System.out.println("Nombre de la Planta :"+planta.getNombre());
        planta.alimentarse();
        System.out.println("");
        AnimalCarnivoro animalC = new AnimalCarnivoro();
        animalC.setNombre("Leon");
        System.out.println("Nombre del animal carnivoro: "+animalC.getNombre());
        animalC.alimentarse();
        System.out.println("");
        AnimalHerbivoro animalH = new AnimalHerbivoro();
        animalH.setNombre("Vaca");
        System.out.println("Nombre del animla Herbivoro: "+animalH.getNombre());
        animalH.alimentarse();
    }
}
