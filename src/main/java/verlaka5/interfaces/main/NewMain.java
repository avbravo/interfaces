/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verlaka5.interfaces.main;

import verlaka5.interfaces.repository.PersonaRepositiory;
import verlaka5.interfaces.repository.AnimalRepositiory;
import verlaka5.interfaces.model.Persona;
import java.util.List;
import verlaka5.interfaces.model.Animal;

/**
 *
 * @author avbravo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersonaRepositiory personaRepositiory = new PersonaRepositiory();
        AnimalRepositiory animalRepositiory = new AnimalRepositiory();
        Procesador menu = new Procesador();
        menu.print(personaRepositiory);
        menu.print(animalRepositiory);
        
        List<Persona> listPersona = menu.find(personaRepositiory , "");
        List<Animal> listAnimal = menu.find(animalRepositiory, "");
        
        listPersona.forEach(p -> {
            System.out.println("--->"+p.getId() + " "+p.getName());
        });
        
        listAnimal.forEach(p -> {
            System.out.println("--->"+p.getId() + " "+p.getType());
        });
    }
    
}
