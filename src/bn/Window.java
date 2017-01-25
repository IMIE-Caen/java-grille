/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bn;

import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author clement
 */
public class Window extends JFrame {
    
    public Window(){
        this.setTitle("Ma fenêtre Java");
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.print("Taille de grille : ");
        int size = new Scanner(System.in).nextInt();    
        
        GrilleComponent grilleComp = new GrilleComponent(new Grille(size));
        
        this.setSize(size * 50, size * 50);
        
        this.getContentPane().add(grilleComp);
        this.getContentPane().add(new JButton("Nouveau bateau"), BorderLayout.SOUTH);
        
        this.setVisible(true);
        grilleComp.repaint();
    }
}
