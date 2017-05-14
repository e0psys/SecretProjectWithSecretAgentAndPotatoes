import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class DataManager extends mainClass{
	int posX;
	int posY;
 	File skin;

	public DataManager() {
		// TODO Auto-generated constructor stub
	}
	  
	//RECUEILLIR ET CHANGER LES DONNEES (individuellement = getters/setters)
		//GETTERS AND SETTERS

	 public int getPosX() {
	   return posX;
	 }

	 public void setPosX(int posX) {
	   this.posX = posX;
	 }
 
	 public int getPosY() {
	   return posY;
	 }
	 
	 public void setPosY(int posY) {
	   this.posY = posY;
	}
	 
	 public Image getSkin() {
		    try {
				return ImageIO.read(skin);
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		  }
		  
	 public void setSkin(File s) {
		    this.skin = s;
		}
	 
	 
	 
	 //COLLECTER ET ENVOYER LES DONNEES
	 //c'est les methodes appellées par main()
	 //elles transforment les données de 1 entité en 1 tableau
	 //le but c'est qu'elles transforment les données de TOUTES les entités en 1 tableau ====> A FAIRE
		public Image[] collectSkin(){
			Image[] s = new Image[getEntityNumber()];
			for(int i=0 ; i<(getEntityNumber()) ; i++){
			s[i] = getEntityList()[i].getSkin();
			}
			return s;
		}
		
		public int[] collectPosX(){
			int[] x = new int[getEntityNumber()];
			for(int i=0 ; i<(getEntityNumber()) ; i++){
			x[i] = getEntityList()[i].getPosX();
			}
			return x;
		}
		
		public int[] collectPosY(){
			int[] y = new int[getEntityNumber()];
			for(int i=0 ; i<(getEntityNumber()) ; i++){
			y[i] = getEntityList()[i].getPosY();
			}
			return y;
		}
		  
		//BOUGER
		public void goRight(int i){
			this.setPosX(getPosX()+i);
		}
		
		public void goLeft(int i){
			this.setPosX(getPosX()-i);
		}
		
		public void goUp(int i){
			this.setPosY(getPosY()-i);
		}
		
		public void goDown(int i){
			this.setPosY(getPosY()+i);
		}
}
