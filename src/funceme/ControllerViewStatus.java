/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funceme;

/**
 *
 * @author Miqueias
 */
public class ControllerViewStatus implements Observer {
    
    private ViewStatus view3;
    private Modelo modelo;
    
    public ControllerViewStatus(Modelo modelo, ViewStatus view3){
        this.modelo = modelo;
        this.view3 = view3;
        this.modelo.attach(this);
        
    }
    
    
    
    @Override
    public void update() {
 
    }
    
}
