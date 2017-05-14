import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public abstract class Entity extends DataManager{
	int jumping=0;
	int etapeDuSaut =0;
	int tailleDuSaut = 0;
	int x=0;
	public Entity() {
		  System.out.println("Entité "+this.getClass()+" invoquée");
	}//fin du constructeur
	
	public void goUp(int i){
		this.setPosY(getPosY()-i);
	}
	
	public int jump(){
		System.out.println(etapeDuSaut);
		if(this.jumping==0){
		this.jumping = 1;

		if(etapeDuSaut<=100){
			tailleDuSaut = 1;
		}
		if(etapeDuSaut>=100){
			tailleDuSaut = (-1);
		}
		}//fin if
		System.out.println(tailleDuSaut);
		etapeDuSaut++;
		
		if(etapeDuSaut==200){
		tailleDuSaut = 0;
		this.jumping = 0;
		etapeDuSaut = 0;}
		return tailleDuSaut;
	}

	
}//Fin de la classe