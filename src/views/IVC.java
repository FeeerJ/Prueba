/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public interface IVC {
    public void ejecutar();
    public void cargarTabla(ArrayList<String[]> datos);
    public void setControlador(Controlador control);
}
