/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

import Example.ejemplo.onResult;

/**
 *
 * @author RigoBono
 */
public class test implements onResult{
    
    public  test(){
        ejemplo ejem=new ejemplo();
        ejem.setData(this);
        ejem.ejecutaEjemplo();
    }

    @Override
    public void onResult(String pro) {
        System.out.println(pro);
    }
    
}
