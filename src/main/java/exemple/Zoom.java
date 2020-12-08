/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;
import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author victoria
 */
public class Zoom extends Effet {
    public float zoom;

    public Zoom(float zoom) {
        this.zoom = zoom;
    }
    
    
    
    @Override
    public void EffectuerEffet(Bandeau b){
        b.setFont(b.getFont().deriveFont(b.getFont().getSize() *zoom));   
    }
       
    
}
