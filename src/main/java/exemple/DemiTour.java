/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author victoria
 */
public class DemiTour {
        public double anglederot = Math.PI;
        ;
    
    public void EffectuerEffetDemiTour(Bandeau b) {
        b.setRotation(anglederot);
    }  
    
}
