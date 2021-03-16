/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verlaka5.interfaces.main;

import java.util.List;
import verlaka5.interfaces.Repository;

/**
 *
 * @author avbravo
 */
public class Procesador <T> {
    public void print(Repository repository){
        repository.saludo();
                
    }
    public List<T> find(Repository repository, String query){
    return   repository.find(query);
                
    }
}
