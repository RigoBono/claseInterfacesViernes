/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploInterfaz;

import EjemploInterfaz.Ejuctor.onResultGet;



/**
 *
 * @author RigoBono
 */
public class Pasivo  implements onResultGet{
    
    public Pasivo(){
        Ejuctor ejecutor=new Ejuctor();
        ejecutor.setCallerObject(this);
        ejecutor.ejecuta();
    }

    @Override
    public void onResultPro(double valer) {
        System.out.println("onResult "+valer);
    }

    @Override
    public void onError(double valer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onRare(double valer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onProgress(int entero) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("onResult "+entero);
    }

}
