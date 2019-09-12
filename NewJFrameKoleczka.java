package grafika3;

public class NewJFrameKoleczka extends javax.swing.JFrame {

    public NewJFrameKoleczka() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newJPanelKoleczka1 = new grafika3.NewJPanelKoleczka();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout newJPanelKoleczka1Layout = new javax.swing.GroupLayout(newJPanelKoleczka1);
        newJPanelKoleczka1.setLayout(newJPanelKoleczka1Layout);
        newJPanelKoleczka1Layout.setHorizontalGroup(
            newJPanelKoleczka1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        newJPanelKoleczka1Layout.setVerticalGroup(
            newJPanelKoleczka1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(newJPanelKoleczka1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrameKoleczka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private grafika3.NewJPanelKoleczka newJPanelKoleczka1;
    // End of variables declaration//GEN-END:variables
}
