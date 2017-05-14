
import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.*;
import javax.imageio.*;
import javax.swing.*;


public class Panneau extends JPanel { 
	Image[] s = new Image[1];
	int[] x = new int[1];
	int[] y = new int[1];

	//-------------SETTERS------------------
	//on a pas besoin de getters car chaque entité connait sa position
	
  public void setS(Image[] s) {//tableau des skins
		this.s = s;}
	

	public void setX(int[] x) {//tableau des abscisses
		this.x = x;}
	

	public void setY(int[] y) {//tableau des ordonnées
		this.y = y;}
	
//------------------------------------------
	
//méthode qui permet de dessiner
	public void paintComponent(Graphics g){
	int compteur = 0;//c'est pour vérifier qu'on dépasse pas la longueur du tableau, sinon exception :S
		while (compteur!=-1){
			g.drawImage(s[compteur],x[compteur],y[compteur],this);//on dessine tout ce qu'il y a dans le tableau
			compteur++;
			if(compteur==s.length)//si ya plus rien après, on arrête (la méthode retourne la longueur du tableau
				{compteur =-1;}
		}//fin de while
	}//fin de la methode paintComponent()
	
	
}//fin de classe