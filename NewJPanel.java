/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafika2D;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JColorChooser;

public class NewJPanel extends javax.swing.JPanel {

    static Object g;

    /**
     * Creates new form NewJPanel
     */
    public NewJPanel() {
        initComponents();
    }

    private Color kolorGwiazdki = new Color(100, 150, 250);

    public void setKolorGwiazdki(Color c) {
        kolorGwiazdki = c;
    }

    private void rysuj(Graphics2D g) {
         // Rectangle2D r1 = new Rectangle.Double(50, 50, 150, 150);
        // Rectangle2D r2 = new Rectangle.Double(100, 100, 150, 150);
        // g.draw(r1);
        // g.draw(r2);
        g.setPaint(kolorGwiazdki);
        Ellipse2D.Double e = new Ellipse2D.Double(80, 80, 150, 150);
        g.draw(e);

        Path2D path1 = new Path2D.Double();
        path1.moveTo(100, 10);
        path1.lineTo(70, 60);
        path1.lineTo(130, 60);
        path1.closePath();
        Area a1 = new Area(path1);

        Path2D path2 = new Path2D.Double();
        path2.moveTo(100, 75);
        path2.lineTo(70, 25);
        path2.lineTo(130, 25);
        path2.closePath();
        Area a2 = new Area(path2);

        a1.add(a2);
        g.fill(a1);

        Area a3 = new Area(e);
        g.fill(a3);

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        rysuj(g2d);

    }
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
            .addGap(0, 308, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

