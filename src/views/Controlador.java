package views;

import data.Persistencia;
import domain.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;

public class Controlador implements ActionListener {
     VistaPrincipal vp = new VistaPrincipal();
     IVA  va = new VistaAnimales(null,true);
     
    public static TipoAlimentacion[] getTiposAlimentacion(){
        return  TipoAlimentacion.values();
    }
    public static ArrayList<Especie> getEspecies(){
        return Persistencia.getEspecies();
    }
    public static ArrayList<Sector> getSectores(){
        return Persistencia.getSectores();
    }
    
    public static ArrayList<AnimalViewModel> getAnimales(){
        ArrayList<AnimalViewModel> animales = new ArrayList<>();
        for(Mamifero animal : Persistencia.getAnimales()){
            animales.add(new AnimalViewModel(animal));
        }
        return animales;
    }
    
    
    public static ComidaViewModel  calcularComida(){
        double totalCarnivoros = Persistencia.getTotalComida(TipoAlimentacion.CARNIVORO);
        double totalHerbivoros = Persistencia.getTotalComida(TipoAlimentacion.HERBIVORO);
        return new ComidaViewModel(totalCarnivoros, totalHerbivoros);
    }

      public void ejecutar(){
       vp.setControlador(this);    
       vp.ejecutar();
      }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getActionCommand().equals(vp.OP_AGREGAR)){
            System.out.println("Abiendo menu...");
             va.llenarComboBoxSector(Persistencia.getSectores());
            va.ejecutar();
            
            
        }
     
        
    }
    
    
  
    
}
