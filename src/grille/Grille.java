/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grille;

import java.util.ArrayList;

/**
 *
 * @author clement
 */
public class Grille {
    private int size;
    private ArrayList<Coordonnees> tab = new ArrayList<>();

    Grille(int size) {
        this.size = size;
    }
    public int getSize(){
        return size;
    }
    public void addBateau(Coordonnees coords){
        tab.add(coords);
    }

    @Override
    public String toString() {
        return tab.toString();
    }
    
}
