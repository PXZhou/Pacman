import java.awt.event.KeyEvent;
import edu.princeton.cs.introcs.StdDraw;

public class Menu {
		 
	 public static void EcranStart(){
         StdDraw.setXscale(0,16);
         StdDraw.setYscale(0,16);
         StdDraw.setPenColor(StdDraw.BLACK);
         StdDraw.filledRectangle(5, 8, 11, 1);
         StdDraw.setPenColor(StdDraw.RED);
         StdDraw.textLeft(0, 8, "Start ? Tapez sur Entrée");
	 }
	 
     public static boolean ValueEcranStart(){
    	 
         if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)){
        	 return false;
         }
         return true;
     }
     
     public static void EcranFin(Joueur pac,int Temps){
         StdDraw.setXscale(0,20);
         StdDraw.setYscale(0,20);
         StdDraw.clear(StdDraw.GRAY);
         StdDraw.setPenColor(StdDraw.BLACK);
         StdDraw.filledRectangle(10, 15, 10, 2);
         StdDraw.setPenColor(StdDraw.RED);
         StdDraw.textLeft(0, 15, "Recommencer ? Si oui, tapez sur entrée");
         StdDraw.setPenColor(StdDraw.BLACK);
         StdDraw.filledRectangle(10, 5, 10, 2);
         StdDraw.setPenColor(StdDraw.RED);
         StdDraw.textLeft(0, 5, "Quitter ? Si oui, tapez sur la barre Espace.");
         StdDraw.setPenColor(StdDraw.BLUE);
         StdDraw.textLeft(8, 10, "Score : " + pac.getScore());
         StdDraw.textLeft(8, 9, "Temps(en ms) : " + Temps);
     }
     public static boolean ValueFin(){
    	 
    	 if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)){
    		 return false;
    	 }
    	 else if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE)){
    		 System.exit(0);
    	 }         
    	 return true;
     }
}
