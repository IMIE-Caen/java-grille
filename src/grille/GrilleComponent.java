/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grille;

import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author clement
 */
public class GrilleComponent extends JComponent {
    private Grille grille;

    GrilleComponent(Grille grille) {
        this.grille = grille;
    }
    public void paintComponent(Graphics g){
        for(int i = 1 ; i < grille.getSize() ; i++){
            g.drawLine(0, i*50, grille.getSize() * 50, i*50);
        }
        for(int i = 1 ; i < grille.getSize() ; i++){
            g.drawLine(i*50, 0, i*50, grille.getSize() * 50);
        }
        
    }
}
