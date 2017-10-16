/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

/**
 *
 * @author RigoBono
 */
public class ejemplo {
    
    private onResult data;
    
    
    
    
    public void ejecutaEjemplo(){
        data.onResult("holaaa");
    }
    
    
    public interface onResult{
        public void onResult(String pro);
    }

    /**
     * @param data the data to set
     */
    public void setData(onResult data) {
        this.data = data;
    }
    
}
