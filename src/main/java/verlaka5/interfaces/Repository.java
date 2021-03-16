/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package verlaka5.interfaces;

import java.util.List;

/**
 *
 * @author avbravo
 */
public interface Repository <T>{
   
   public void saludo();
   public List<T> find(String query);
}
