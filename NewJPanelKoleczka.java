package grafika3;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class NewJPanelKoleczka extends javax.swing.JPanel
        implements ActionListener {

    private Timer timer = new Timer(1000, this);

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    private void rysuj(Graphics2D g) {
        timer.start();
        g.setPaint(new GradientPaint(0, 0, Color.black, getWidth(), getHeight(), Color.yellow));
        g.fillRect(0, 0, getWidth(), getHeight());
        for (int i = 0; i < (getWidth() * getHeight()) / 1000; i++) {
            int r = (int) (Math.random() * 255);
            int gr = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            g.setPaint(new Color(r, gr, b));
            int promien = (int) (Math.random() * 40);
            g.drawOval((int) (Math.random() * this.getWidth()), (int) (Math.random() * this.getHeight()), promien, promien);

        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        rysuj(g2d);
    }

    public void NewJPanelKoleczka() {
        initComponents();
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
