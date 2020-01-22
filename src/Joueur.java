//import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import edu.princeton.cs.introcs.StdDraw;

public class Joueur{
    //Color Color;
    protected int x;
    protected int y;
    public int score;
    static int[][] laby;
    
    public Joueur(int x, int y, int score,int [][] laby){
    	this.x = x;
    	this.y = y;
    	this.score = score;
    	this.laby = laby;

        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.filledCircle(this.x, 30-this.y, 0.40);
        
    }
    
    public int getX(){
    	return this.x;
    }
    public int getY(){
    	return this.y;
    }
    public void setX(int x){
    	this.x = x;
    }
    public void setY(int y){
    	this.y = y;
    }

    public int[][] getLaby(){
    	return this.laby;
    }
    public int getScore(){
    	return this.score;
    }
	public static Joueur deplacement(int x,int y, int score, int[][] Laby, int etat) 
	{
    	int xp,yp;
    	xp = x;
    	yp = y;
		
		if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)){
			if (CaseLibre(x,y+1,laby)){
				y++;
			}
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_UP)){
			if (CaseLibre(x,y-1,laby)){
				y--;
			}
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)){
			if (CaseLibre(x-1,y,laby)){
				x--;
			}
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)){
			if (CaseLibre(x+1,y,laby)){
				x++;
			}
		}
		if (Laby[y][x] == 0){
			laby[y][x] = 5;
			score ++;
		}
		else if(Laby[y][x] == 2){
			Laby[y][x] = 6;
			etat = 1;
		}
		if ((y==14)&&(x==0)){
			x = 27;
			y = 14;
		}
		else if((y==14)&&(x==27)){
			x = 0;
			y = 14;
		}
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledSquare(xp, 30-yp, 0.5);
		Joueur pac = new Joueur(x,y,score,laby);
		return pac;
	}
	
	private static boolean CaseLibre(int x,int y, int[][] laby){
		if ((x==0)&&(y==14)){
			return true;
		}
		int Valeurcase = laby[y][x];
		switch(Valeurcase){
		case(1):
			return false;
		case(4):
			return false;
		default:
			return true;
		}
	}
}