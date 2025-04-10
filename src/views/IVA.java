/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;


import domain.*;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public interface IVA {
    public static String OPC_GUARDAR = "guardar animal";
     public void setControlador(Controlador control);
     public void ejecutar();
     public void llenarComboBoxSector(ArrayList<Sector> sectores);
     public void llenarComboBoxPais(ArrayList<Pais> paises); 
     public void llenarComboBoxEspecie(ArrayList<Especie> especies);
}
