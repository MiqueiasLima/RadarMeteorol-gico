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
public class ControllerView2 implements Observer {

    private Modelo model;
    private View2 view2;
   
    public ControllerView2(Modelo model, View2 view2){
        this.model = model;
        this.view2 = view2;
        this.model.attach(this);
    }

    public void trataEvento(java.awt.event.ActionEvent evt){
        if("Cadastrar Cidade".equals(evt.getActionCommand())){
            this.model.setNomeCidade(this.view2.getTxtCidade().getText());
        }
        if("Cadastrar UF".equals(evt.getActionCommand())){
            this.model.setuF(this.view2.getTxtUf().getText());
        }
        if("Cadastrar Temperatura".equals(evt.getActionCommand())){
            this.model.setTemperatura(Double.parseDouble(this.view2.getTxtTemperatura().getText()));
        }
        if("Cadastrar Tempo".equals(evt.getActionCommand())){
            this.model.setTempo(this.view2.getTxtTempo().getText());
        }
    }
    @Override
    public void update() {
        
    }
}
