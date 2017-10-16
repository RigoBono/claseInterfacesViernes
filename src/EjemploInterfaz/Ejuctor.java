/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploInterfaz;

/**
 *
 * @author RigoBono
 */
public class Ejuctor {
    
    private onResultGet callerObject;
    
    
    
    public void ejecuta(){
        double valor=Math.pow(2, 8)-1;
        callerObject.onResultPro(valor);
         valor=Math.pow(2, 8)-1;
         callerObject.onProgress(2);
         valor=Math.pow(2, 8)-1;
         callerObject.onProgress(12);
         valor=Math.pow(2, 8)-1;
         callerObject.onProgress(22);
         valor=Math.pow(2, 8)-1;
         callerObject.onProgress(33);
         valor=Math.pow(2, 8)-1;
         callerObject.onProgress(92);
         valor=Math.pow(2, 8)-1;
         callerObject.onProgress(1);
    }
    
    public interface onResultGet{
        public void onResultPro(double valer);
        public void onError(double valer);
        public void onRare(double valer);
        public void onProgress(int entero);
    }

    /**
     * @param callerObject the callerObject to set
     */
    public void setCallerObject(onResultGet callerObject) {
        this.callerObject = callerObject;
    }
    
    
    
}
