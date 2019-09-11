
package grafika2D;


public class NewJFrameLinia extends javax.swing.JFrame {

  
    public NewJFrameLinia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newJPanelLinia1 = new grafika2D.NewJPanelLinia();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout newJPanelLinia1Layout = new javax.swing.GroupLayout(newJPanelLinia1);
        newJPanelLinia1.setLayout(newJPanelLinia1Layout);
        newJPanelLinia1Layout.setHorizontalGroup(
            newJPanelLinia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        newJPanelLinia1Layout.setVerticalGroup(
            newJPanelLinia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(newJPanelLinia1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrameLinia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private grafika2D.NewJPanelLinia newJPanelLinia1;
    // End of variables declaration//GEN-END:variables
}
