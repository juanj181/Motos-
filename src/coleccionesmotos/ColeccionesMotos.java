/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesmotos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Javi
 */
public class ColeccionesMotos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        List<Moto> motos = new ArrayList<>();
        Moto moto1 = new Moto(Marca.honda, "forza", 500, "1234567A");
        Moto moto2 = new Moto(Marca.suzuki, "katana", 49, "7654321Z");
        Moto moto3 = new Moto(Marca.ducati, "beyron", 1100, "9876541D");
        Moto moto4 = new Moto(Marca.yamaha, "T-max", 500, "98765445F");
        Moto moto5 = new Moto(Marca.yamaha, "X-max", 250, "6985741J");
        
        motos.add(moto1);
        motos.add(moto2);
        motos.add(moto3);
        motos.add(moto4);
        motos.add(moto5);
            
        
        
        
    }
}
