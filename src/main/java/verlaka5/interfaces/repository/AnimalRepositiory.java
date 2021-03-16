/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verlaka5.interfaces.repository;

import java.util.ArrayList;
import java.util.List;
import verlaka5.interfaces.Repository;
import verlaka5.interfaces.model.Animal;

/**
 *
 * @author avbravo
 */
public class AnimalRepositiory<T>  implements Repository{
    List<Animal> list = new ArrayList<>();
    @Override
    public void saludo() {
        System.out.println("saludando animal");
    }

    @Override
    public List<Animal> find(String query) {
       list = new ArrayList<>();
         Animal animal = new Animal("v", "Vaca");
         
         list.add(animal);
    return list;
    }
    
}
