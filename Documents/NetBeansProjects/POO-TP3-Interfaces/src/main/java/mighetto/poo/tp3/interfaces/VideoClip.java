/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mighetto.poo.tp3.interfaces;

/**
 *
 * @author Administrador
 */
public interface VideoClip {
/*comienza la reproduccion del video*/
    public void play();
/*reproduce el clip en un bucle, un loopinfinito*/ 
    public void bucle();
/*detiene la reproducción del video*/
    public void stop();
}
