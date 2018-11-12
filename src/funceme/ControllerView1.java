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
public class ControllerView1 implements Observer {
    
    private Modelo model;
    private View1 view;
    
    public ControllerView1(Modelo model, View1 view){
       this.model = model;
       this.view = view;
       this.model.attach(this);
       
    }

    @Override
    public void update() {
            
    }
    
}
