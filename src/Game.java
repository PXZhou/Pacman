import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import edu.princeton.cs.introcs.StdDraw;


public class Game {
    static int[][] Laby = {
    		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    		{1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
    		{1,0,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,0,1},
    		{1,2,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,2,1},
    		{1,0,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,0,1},
    		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    		{1,0,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,0,1},
    		{1,0,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,0,1},
    		{1,0,0,0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,1},
    		{1,1,1,1,1,1,0,1,1,1,1,1,3,1,1,3,1,1,1,1,1,0,1,1,1,1,1,1},
    		{3,3,3,3,3,1,0,1,1,1,1,1,3,1,1,3,1,1,1,1,1,0,1,3,3,3,3,3},
    		{3,3,3,3,3,1,0,1,1,3,3,3,3,3,3,3,3,3,3,1,1,0,1,3,3,3,3,3},
    		{3,3,3,3,3,1,0,1,1,3,1,1,1,4,3,1,1,1,3,1,1,0,1,3,3,3,3,3},
    		{1,1,1,1,1,1,0,1,1,3,1,3,3,3,3,3,3,1,3,1,1,0,1,1,1,1,1,1},
    		{3,3,3,3,3,3,0,3,3,3,1,3,3,3,3,3,3,1,3,3,3,0,3,3,3,3,3,3},
    		{1,1,1,1,1,1,0,1,1,3,1,1,1,1,1,1,1,1,3,1,1,0,1,1,1,1,1,1},
    		{3,3,3,3,3,1,0,1,1,3,3,3,3,3,3,3,3,3,3,1,1,0,1,3,3,3,3,3},
    		{3,3,3,3,3,1,0,1,1,3,1,1,1,1,1,1,1,1,3,1,1,0,1,3,3,3,3,3},
    		{1,1,1,1,1,1,0,1,1,3,1,1,1,1,1,1,1,1,3,1,1,0,1,1,1,1,1,1},
    		{1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
    		{1,0,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,0,1},
    		{1,0,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,1,1,0,1},
    		{1,2,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,2,1},
    		{1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,1,1},
    		{1,1,1,0,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,1,1,0,1,1,1},
    		{1,0,0,0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,1,1,0,0,0,0,0,0,1},
    		{1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1},
    		{1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,0,1},
    		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
    		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}  		
    };

    public static int checkLaby(int[][] laby){
    	int nbre1 = 0;
        for (int x = 0; x<30;x++){
        	for (int y = 0; y<28;y++){
        		if (laby[x][y]==0){
        			nbre1++;
        		}
        	}
        }
        return nbre1;
    }
    
    public static void draw(int[][] Laby){
        for (int x = 0; x<30;x++){
        	for (int y = 0; y<28;y++){
        		if ((Laby[x][y] == 0) || (Laby[x][y] ==3)|| (Laby[x][y] ==2)){
        			StdDraw.setPenColor(StdDraw.BLACK);
        			StdDraw.filledSquare(y, 30-x, 0.5);
        			if ((Laby[x][y]) ==0){
            			StdDraw.setPenColor(StdDraw.WHITE);
            			StdDraw.filledCircle(y, 30-x, 0.2);
        			}
        			else if ((Laby[x][y]) ==2 ){
            			StdDraw.setPenColor(StdDraw.GRAY);
            			StdDraw.filledCircle(y, 30-x, 0.3);
        			}
        		}
        		else if (Laby[x][y] ==1 ){
        			StdDraw.setPenColor(StdDraw.BLUE);
        			StdDraw.filledSquare(y, 30-x, 0.5);
        		}
        	}
        }
    }
    
    public static int[][] redraw(int[][] laby){
    	for (int x = 0;x<30;x++){
    		for(int y = 0; y<28;y++){
    			if (laby[x][y] == 5){
    				laby[x][y] = 0;
    			}
    			else if (laby[x][y] == 6){
    				laby[x][y] = 2;
    			}
    		}
    	}
    	return laby;
    }
    
	public static void main(String[] args) throws InterruptedException {
		int restart = 0;
		int score = 0;
		int vie = 2;
		int etat = 0;
		int nbre1 = 0;
        boolean val  = true;

        Menu.EcranStart();
        while (val){
             val  = Menu.ValueEcranStart();
        }
        long debut = System.currentTimeMillis();
        while ((vie!=0)) {
        	boolean collision = false;
            StdDraw.setXscale(-1,28);
            StdDraw.setYscale(-4,32);
            if (restart == 1){
                Laby = redraw(Laby);
                restart = 0;
            }
            StdDraw.clear(StdDraw.BLACK);
            draw(Laby);
            Joueur pac = new Joueur(14, 22, score,Laby);
            Ghost rouge = new Ghost(1, 11, 17, 10, 13);
            Ghost bleu = new Ghost(2, 11, 16, 10, 14);
            Ghost vert = new Ghost(3, 16, 17 , 17, 15);
            Ghost rose = new Ghost(4, 16, 16, 17, 13);
            while (collision == false){
            	System.out.println("debutboucle");
	            StdDraw.setPenColor(StdDraw.BLACK);
	            StdDraw.filledRectangle(15, -2, 29, 1);
	            StdDraw.setPenColor(StdDraw.WHITE);
	            StdDraw.textLeft(20, -2, "Score : " + pac.getScore());
	            StdDraw.textRight(10, -2, "Vie : " + vie);
	            System.out.println("pacD");
	           	pac = Joueur.deplacement(pac.getX(),pac.getY(),pac.getScore(),Laby,etat);
	           	if (pac.getX() == rouge.getX() && 30-pac.getY()==rouge.getY() || pac.getX() == rouge.getX() && 30-pac.getY()==rouge.getY() || pac.getX() == bleu.getX() && 30-pac.getY()==bleu.getY() || pac.getX() == rose.getX() && 30-pac.getY()==rose.getY()){
	          		collision = true;
	          	}
	           	System.out.println("rougeD");
	           	
	           		
	           	}
		          	rouge = Ghost.deplacement(Laby,rouge,Ghost.restrictionMouv(Laby, rouge));
		          	if (pac.getX() == rouge.getX() && 30-pac.getY()==rouge.getY()){
		          		collision = true;
		          	}
	          	System.out.println("bleuD");
	          	bleu = Ghost.deplacement(Laby,bleu,Ghost.restrictionMouv(Laby, bleu));
	          	if (pac.getX() == bleu.getX() && 30-pac.getY()==bleu.getY()){
	          		collision = true;
	          	}
	          	System.out.println("vertD");
	          	vert = Ghost.deplacement(Laby,vert,Ghost.restrictionMouv(Laby, vert));
	          	if (pac.getX() == vert.getX() && 30-pac.getY()==vert.getY()){
	          		collision = true;
	          	}
	          	System.out.println("roseD");
	          	rose = Ghost.deplacement(Laby,rose,Ghost.restrictionMouv(Laby, rose));
	          	if (pac.getX() == rose.getX() && 30-pac.getY()==rose.getY()){
	          		collision = true;
	          	}
	          	System.out.println("check laby");
	           	nbre1  = checkLaby(Laby);
	           	if (nbre1 == 0){
	           		collision = true;
	           	}
	           	
	           	Thread.sleep(150); 
	           	System.out.println("finboucle");
            }
            if (nbre1 == 0){
           		boolean valb = true;
           		int Temps = (int) (System.currentTimeMillis()-debut)/1000;
        		Menu.EcranFin(pac,Temps);

        		while (valb){
                    valb  = Menu.ValueFin();
        		}
        		vie = 3;
        		score = 0;
        		restart = 1;
           	}
            vie --;
        }
	}
}