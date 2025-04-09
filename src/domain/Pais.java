
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Fernando
 */
public class Pais {
    
    private final String nombre;
    private String codigo;

    public Pais(String nombre,String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
      
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    
  

}
