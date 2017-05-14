
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension; 


public class Fenetre extends JFrame{
	
    //panneau qu'on va metre � l'interieur de la fen�tre
      public Panneau pan = new Panneau();
      
      
private static int compteurDeFenetre = 0;

    public Fenetre() {
    	compteurDeFenetre++;
    	System.out.println("Fenetre "+ compteurDeFenetre+" invoqu�e");//pour compter les fenetre


        //D�finit un titre
        this.setTitle("Swag de pouleyyyyy");

         //D�finit sa taille : largeur, hauteur
        this.setSize(1600, 720);

        //Nous demandons maintenant � notre objet de se positionner au centre
        this.setLocationRelativeTo(null);

        //Termine le processus lorsqu'on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //rend la fen�tre visible
        this.setVisible(true);

        //D�finit si elle est redimensionnable
        setResizable(true);

        //place le fenetre sur l'ecran
        //setLocation(int x, int y)

        //Focus
        setAlwaysOnTop(false);

        //On pr�vient notre JFrame que notre JPanel sera son content pane
        this.setContentPane(pan);

        
        pan.repaint();//pas obligatoire mais chais pas, �a fait joli
    }//fin de constructeur

}//fin de classe