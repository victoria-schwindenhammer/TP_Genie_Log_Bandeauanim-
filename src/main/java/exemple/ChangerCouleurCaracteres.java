/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author victoria
 */
public class ChangerCouleurCaracteres {
    public Color couleur;
    
    
    public void EffectuerEffetChangeCouleur(Bandeau b) {
        if (b.getForeground()==couleur) {}
        else {
            b.setForeground(couleur);
        } 
    }
}
