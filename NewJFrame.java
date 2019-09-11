package grafika2D;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newJPanel1 = new grafika2D.NewJPanel();
        newJPanel2 = new grafika2D.NewJPanel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout newJPanel1Layout = new javax.swing.GroupLayout(newJPanel1);
        newJPanel1.setLayout(newJPanel1Layout);
        newJPanel1Layout.setHorizontalGroup(
            newJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        newJPanel1Layout.setVerticalGroup(
            newJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout newJPanel2Layout = new javax.swing.GroupLayout(newJPanel2);
        newJPanel2.setLayout(newJPanel2Layout);
        newJPanel2Layout.setHorizontalGroup(
            newJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );
        newJPanel2Layout.setVerticalGroup(
            newJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        getContentPane().add(newJPanel2, java.awt.BorderLayout.PAGE_START);

        jButton1.setText("Zmień kolor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       Color c = JColorChooser.showDialog(this, "Wybierz kolor", Color.yellow);
        
        newJPanel2.setKolorGwiazdki(c);
       
        newJPanel2.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private grafika2D.NewJPanel newJPanel1;
    private grafika2D.NewJPanel newJPanel2;
    // End of variables declaration//GEN-END:variables
}
