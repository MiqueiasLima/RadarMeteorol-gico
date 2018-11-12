/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funceme;

import javax.swing.ImageIcon;

/**
 *
 * @author Miqueias
 */
public class ViewStatus extends javax.swing.JFrame implements Observer {

    private ControllerViewStatus controllerViewStatus;
    private Modelo model;
            
    public ViewStatus(Modelo model) {
        
        this.model = model;
        this.controllerViewStatus = new ControllerViewStatus(model,this);
        model.attach(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTempo = new javax.swing.JLabel();
        jCidade = new javax.swing.JLabel();
        jTempo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTempo, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCidade;
    private javax.swing.JLabel jTempo;
    private javax.swing.JLabel jTempo1;
    // End of variables declaration//GEN-END:variables

    ImageIcon img = new ImageIcon(this.getClass().getResource("1.png"));
    ImageIcon img1 = new ImageIcon(this.getClass().getResource("2.png"));
    ImageIcon img2 = new ImageIcon(this.getClass().getResource("3.png"));
    
    public void trocaImg(){
        
        if("Nublado".equals(this.model.getTempo())){
            this.jTempo.setIcon(img);
        }
        else if("Ensolarado".equals(this.model.getTempo())){
            this.jTempo.setIcon(img2);
        }
        
        else if ("Chuvoso".equals(this.model.getTempo())){
            this.jTempo.setIcon(img1);
        }
        else{
            this.jTempo.setIcon(null);
        }
    }
    
    
    @Override
    public void update() {
      this.jCidade.setText(this.model.getNomeCidade());
      this.jTempo1.setText((Double.toString(this.model.getTemperatura())));
      this.trocaImg();
    }
}
