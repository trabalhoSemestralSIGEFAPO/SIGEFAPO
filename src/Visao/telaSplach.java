/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author danny
 */
public class telaSplach extends javax.swing.JFrame {

    /**
     * Creates new form JfrmSplach
     */
    public telaSplach() {
        initComponents();
        caregando();
    }
    
    public void caregando(){
        ActionListener acao= new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              if(jProgressBar.getValue() < 100) {
                jProgressBar.setValue(jProgressBar.getValue()+1);
                  
              } else{
                  t.stop();
                  telaLogin t = new telaLogin();
                  t.setLocationRelativeTo(null);
                  t.setVisible(true);
                  setVisible(false);
              }
            }
            
        };
       t = new Timer(50,acao); 
       t.start();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar = new javax.swing.JProgressBar();
        jLabelFundoSplach = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGEFAPO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 350, 30));

        jLabelFundoSplach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/loding.png"))); // NOI18N
        getContentPane().add(jLabelFundoSplach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
                String tema="Nimbus";
        String tema2="com.jtattoo.plaf.noire.NoireLookAndFeel";
        String tema3="com.jtattoo.plaf.smart.SmartLookAndFeel";
        String tema4="com.jtattoo.plaf.texture.TextureLookAndFeel";
        String tema5="com.jtattoo.plaf.mint.MintLookAndFeel";
        String tema6="com.jtattoo.plaf.luna.LunaLookAndFeel";
        String tema7="com.jtattoo.plaf.mcwin.McWinLookAndFeel";
        String tema8="com.jtattoo.plaf.aero.AeroLookAndFeel";
        String tema9="com.jtattoo.plaf.acryl.AcrylLookAndFeel";
        String tema10="com.jtattoo.plaf.hifi.HiFiLookAndFeel";
        String tema11="com.jtattoo.plaf.aluminium.AluminiumLookAndFeel";
        String tema12="com.jtattoo.plaf.bernstein.BernsteinLookAndFeel";
        String tema13="com.jtattoo.plaf.fast.FastLookAndFeel";
        String tema14="com.jtattoo.plaf.graphite.GraphiteLookAndFeel";
          try{
    UIManager.setLookAndFeel(tema11);
    
}catch(Exception e){
    
}
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaSplach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaSplach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaSplach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaSplach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaSplach().setVisible(true);
            }
        });
    }

    
    private Timer t;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFundoSplach;
    private javax.swing.JProgressBar jProgressBar;
    // End of variables declaration//GEN-END:variables
}
