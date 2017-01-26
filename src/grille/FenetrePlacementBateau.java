/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grille;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author clement
 */
public class FenetrePlacementBateau extends JFrame{
    JTextField xTextField;
    JTextField yTextField;
    Grille g ;
    
    public FenetrePlacementBateau(Grille g){
        this.g = g;
        setTitle("Placer");        
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        Container pane = getContentPane();
        
        pane.setLayout(new GridLayout(3, 1));
        
        
        Container ligneX = new Container();
        ligneX.setLayout(new GridLayout(1,2));
        ligneX.add(new JLabel("X : "));
        
        this.xTextField = new JTextField();
        
        ligneX.add(xTextField);
        
        pane.add(ligneX);
        
        Container ligneY = new Container();
        ligneY.setLayout(new GridLayout(1,2));
        ligneY.add(new JLabel("Y : "));
        this.yTextField = new JTextField();
        ligneY.add(yTextField);
         
        pane.add(ligneY);
        
        pane.add(new BoutonValider("Valider", this));
        
        
        setVisible(true);
    }
    
    public void placerBateau(){
        System.out.println("ON A CLIQUÉ SUR LE BOUTON");
        
        Coordonnees c = new Coordonnees( 
                Integer.parseInt(this.xTextField.getText()),
                Integer.parseInt(this.yTextField.getText())       );
       g.addBateau(c);
       System.out.println(g);
    }
    
    
    

}
