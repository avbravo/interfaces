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
import verlaka5.interfaces.model.Persona;

/**
 *
 * @author avbravo
 */
public class PersonaRepositiory<T> implements Repository{
List<Persona> list = new ArrayList<>();
    @Override
    public void saludo() {
        System.out.println("saludando persona");
    }

   @Override
    public List<Persona> find(String query) {
       list = new ArrayList<>();
      Persona persona  = new Persona("avbravo", "Aris");
         
         list.add(persona);
    return list;
    }
    
}
