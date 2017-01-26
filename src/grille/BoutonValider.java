/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grille;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author clement
 */
public class BoutonValider extends JButton implements ActionListener {
    
    FenetrePlacementBateau fenetre;
    
    BoutonValider(String label){
        super(label);
        addActionListener(this); 
    }

    BoutonValider(String label, FenetrePlacementBateau fenetre) {
        super(label);
        addActionListener(this); 
        // équivalent à this(label); 
        this.fenetre = fenetre;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       fenetre.placerBateau();
    }
    
  
    
    
}
