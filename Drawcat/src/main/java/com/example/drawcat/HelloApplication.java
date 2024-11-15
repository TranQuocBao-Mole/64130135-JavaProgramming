package com.example.drawcat;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class HelloApplication extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Vẽ thân hình tam giác lớn
        Polygon body = new Polygon();
        body.addPoint(150, 50);
        body.addPoint(50, 170);
        body.addPoint(250, 170);
        g2d.draw(body);

        // Vẽ thân hình tròn

        Ellipse2D.Double lowerbody = new Ellipse2D.Double(100, 160, 100, 100);
        g2d.draw(lowerbody);

        // Vẽ tai
        Polygon ear1 = new Polygon();
        ear1.addPoint(100, 50);
        ear1.addPoint(80, 100);
        ear1.addPoint(120, 100);
        g2d.draw(ear1);

        Polygon ear2 = new Polygon();
        ear2.addPoint(200, 50);
        ear2.addPoint(180, 100);
        ear2.addPoint(220, 100);
        g2d.draw(ear2);

        // Vẽ mũi
        Polygon nose = new Polygon();
        nose.addPoint(150, 130);
        nose.addPoint(140, 120);
        nose.addPoint(160, 120);
        g2d.draw(nose);

        // Vẽ chân
        Ellipse2D.Double leg1 = new Ellipse2D.Double(90, 240, 40, 40);
        Ellipse2D.Double leg2 = new Ellipse2D.Double(170, 240, 40, 40);
        g2d.draw(leg1);
        g2d.draw(leg2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Cat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new HelloApplication());
        frame.setVisible(true);
    }
}