package grafika2D;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class NewJPanelLinia extends javax.swing.JPanel {

    public NewJPanelLinia() {
        initComponents();
    }

    boolean wylosowano = false;
    private Line2D line;

    private void losuj() {
        if (!wylosowano) {
            double x1 = Math.random() * getWidth();
            double y1 = Math.random() * getHeight();
            double x2 = Math.random() * getWidth();
            double y2 = Math.random() * getHeight();
            line = new Line2D.Double(x1, y1, x2, y2);
            wylosowano = true;
        }
    }

    private void rysuj(Graphics2D g) {
        losuj();
        g.draw(line);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        rysuj(g2d);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
