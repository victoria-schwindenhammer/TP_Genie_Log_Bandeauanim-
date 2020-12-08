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
public class Zoom {
    public int zoom;
    
    
    public void EffectuerEffetZoom(Bandeau b){
        b.getFont().deriveFont(b.getFont().getSize() *zoom);   
    }
       
    
}
