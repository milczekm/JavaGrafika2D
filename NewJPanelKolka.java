package grafika3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.Timer;

public class NewJPanelKolka extends javax.swing.JPanel
        implements ActionListener {

    private int x = 0;
    private int y = 0;
    private int dx = 1;
    private int dy = 1;
    public Timer timer = new Timer(10, this);

    @Override
    public void actionPerformed(ActionEvent e) {
        przesunKolo();
        repaint();
    }

    public void przesunKolo() {
        x += dx;
        y += dy;
        if (y == this.getHeight() - 30) {
            dy = -dy;
        }

        if (x == this.getWidth() - 30) {
            dx = -dx;
        }
        if (y == 0) {
            dy = -dy;
        }
        if (x == 0) {
            dx = -dx;
        }

        repaint();
    }

    private void rysuj(Graphics2D g) {
        Ellipse2D.Double e = new Ellipse2D.Double(x, y, 30, 30);
        g.setColor(Color.red);
        g.fill(e);
        setBackground(Color.yellow);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        rysuj(g2d);
    }

    public NewJPanelKolka() {
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
