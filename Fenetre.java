
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension; 


public class Fenetre extends JFrame{
	
    //panneau qu'on va metre à l'interieur de la fenêtre
      public Panneau pan = new Panneau();
      
      
private static int compteurDeFenetre = 0;

    public Fenetre() {
    	compteurDeFenetre++;
    	System.out.println("Fenetre "+ compteurDeFenetre+" invoquée");//pour compter les fenetre


        //Définit un titre
        this.setTitle("Swag de pouleyyyyy");

         //Définit sa taille : largeur, hauteur
        this.setSize(1600, 720);

        //Nous demandons maintenant à notre objet de se positionner au centre
        this.setLocationRelativeTo(null);

        //Termine le processus lorsqu'on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //rend la fenêtre visible
        this.setVisible(true);

        //Définit si elle est redimensionnable
        setResizable(true);

        //place le fenetre sur l'ecran
        //setLocation(int x, int y)

        //Focus
        setAlwaysOnTop(false);

        //On prévient notre JFrame que notre JPanel sera son content pane
        this.setContentPane(pan);

        
        pan.repaint();//pas obligatoire mais chais pas, ça fait joli
    }//fin de constructeur

}//fin de classe