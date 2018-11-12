/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funceme;

import java.util.ArrayList;


public class Modelo {
    
    private String nomeCidade;
    private String uF;
    private double temperatura;
    private String tempo;
    
    private ArrayList<Observer> observadores = new ArrayList<>();

    public void notifyAllTo(){
        for(int i = 0; i < observadores.size(); i++){
            observadores.get(i).update();
        }
    }
    public void attach(Observer observer){
        this.observadores.add(observer);
    }
    
    public void dettach(Observer observer){
        this.observadores.remove(observer);
    }
    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
        this.notifyAllTo();
    }

    public String getuF() {
        return uF;
    }

    public void setuF(String uF) {
        this.uF = uF;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        this.notifyAllTo();
    }

    public String getTempo() {
        
        return tempo;
        
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
        this.notifyAllTo();
    } 
}
