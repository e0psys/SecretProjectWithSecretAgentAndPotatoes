

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Poulpinator extends Entity{
private static int compteur = 0;//c'est d�gueu, mais juste pour le d�lire de faire 2 poulpi
//et c'est comme �a qu'on fera plusieurs mobs

	public Poulpinator() {
		super();
		skin = new File("Poulpinator.png");
		if(compteur==0){
		posX=50;
		posY=50;
		}else
		{
			posX=100;
			posY=100;
		}
		compteur++;
	}

}
