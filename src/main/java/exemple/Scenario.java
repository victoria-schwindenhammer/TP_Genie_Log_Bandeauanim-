/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author victoria
 */
public class Scenario {
    
    public void AjouterUnEffet(Bandeau B, Effet E, int nombreDeRepetition){
        for (int i=0; i<nombreDeRepetition; i=i+1) {
            E.EffectuerEffet(B);     
        }
           
        }
    
    public static void main(String[] args) {
	    new Scenario().scenario();
    }
    
     public void scenario() {
	Bandeau monBandeau = new Bandeau();
        Zoom monZoom1 = new Zoom(100);
        Zoom monZoom2 = new Zoom(10);
        Zoom monDeZoom1 = new Zoom(1/100);
        ChangerCouleurCaracteres maNouvelleCouleur1 = new ChangerCouleurCaracteres(Color.blue);
        ChangerCouleurCaracteres maNouvelleCouleur2 = new ChangerCouleurCaracteres(Color.magenta);
        DemiTour monDemiTour= new DemiTour();
        

        monBandeau.setMessage("Hello");
	monBandeau.sleep(1000);
        this.AjouterUnEffet(monBandeau, maNouvelleCouleur1,1);
        monBandeau.sleep(1000);
        this.AjouterUnEffet(monBandeau, monDemiTour, 1);
        monBandeau.sleep(1000);
        this.AjouterUnEffet(monBandeau, monZoom1, 1);
        this.AjouterUnEffet(monBandeau, monDeZoom1,1);
        monBandeau.sleep(1000);
        this.AjouterUnEffet(monBandeau, monDemiTour,3);
        monBandeau.sleep(1000);
        this.AjouterUnEffet(monBandeau, maNouvelleCouleur2,1);
        monBandeau.sleep(1000);
        this.AjouterUnEffet(monBandeau, monZoom2, 1);
        monBandeau.sleep(3000);
        monBandeau.close();
        
        
        

}
}