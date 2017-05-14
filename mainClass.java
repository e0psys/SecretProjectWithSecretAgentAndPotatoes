
import java.awt.Image;

import javax.swing.JFrame;

public class mainClass {
	private static int nb = 0;//c'est le nombre d'entité listé dans le tableau
	public static Entity[] entityList = new Entity[99];//tableau qui gère les références des entités instanciées
													   //yep, je sais, le 99 il est dégueu xD
	
    public static void main(String[] args){
        Fenetre fe1 = new Fenetre();
        UniteDeCalcul UC = new UniteDeCalcul();
		Poulpinator Poulpinator01 = new Poulpinator();
		inEntityList(Poulpinator01);//A CHAQUE FOIS QU'ON INSTANCIE UNE ENTITE ON UTILISE CETTE METHODE APRES
		Poulpinator Poulpinator02 = new Poulpinator();
		inEntityList(Poulpinator02);
    	
    	Poulpinator01.jump();
        while(true){
        	//normalement (plus tard, là je l'ai pas encore fait) ici on balance <<UC.work();>>   : 
        		//ça écoute le key listener
        		//ça calcule les pos (mobs en fonction de IA, poulpi en fonction du KL)
        	//UC.work();
        	
        	/*
        	i++;
        	if(i<10){
        	Poulpinator01.goRight(5);//ça c'est juste un délire x')
        	Poulpinator02.goLeft(5);}
        	if(10<i&&i<20){
        	Poulpinator01.goDown(5);
        	Poulpinator02.goDown(5);}
        	if(20<i&&i<30){
        	Poulpinator01.goLeft(5);
        	Poulpinator02.goRight(5);}
        	if(30<i&&i<40){
        	Poulpinator01.goUp(5);
        	Poulpinator02.goUp(5);}
        	if(i>40)
        	i=0;*/


        	
        	//----------Si poulpi saute, on continue son saut---------
        	if(Poulpinator01.jumping==1){
            	Poulpinator01.jump();
        		Poulpinator01.goUp(Poulpinator01.jump());
        	}
        	
        	//----------ENVOI DES DONNEES / ATTENTE DE x ms / MAJ DE LA FENETRE------------------
        	fe1.pan.setS(Poulpinator01.collectSkin());//on envoie les données des images à afficher au panneau
        	fe1.pan.setX(Poulpinator01.collectPosX());//on envoie les données des abscisses au panneau
        	fe1.pan.setY(Poulpinator01.collectPosY());//on envoie les données des ordonnées (inversées hein) au panneau
        	
            try {
                Thread.sleep(25);//la pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            fe1.repaint();//on raifraichit la fenetre
            //-----------------------------------------------------------------------------------
        	
        }//fin de while(true)
        
    }//fin de main()

	private static void inEntityList(Entity ent){//ça met toutes les entités au fur et à mesure dans le tableau
		entityList[nb]=ent;
		nb++;
	}
	
	public static Entity[] getEntityList(){//...ça me parait obvious comme code.
		return entityList;
	}
	
	public static int getEntityNumber(){
		return nb;
	}

	
}//fin de la classe