/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grille;

import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author clement
 */
public class Fenetre extends JFrame {
    Grille g ;
    public Fenetre(Grille g){
        this.g = g;
        setTitle("Ma fenêtre Java");
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int size = g.getSize();
        
        GrilleComponent grilleComp = new GrilleComponent(g);
        
        this.setSize(size * 50, size * 50);
        
        
        
        this.getContentPane().add(grilleComp);
        this.getContentPane().add(new JButton("Nouveau bateau"), BorderLayout.SOUTH);
        
        this.setVisible(true);
        grilleComp.repaint();
    }
}
