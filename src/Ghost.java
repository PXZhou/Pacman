import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Ghost {
    protected int color;
    protected int x;
    protected int y;
    protected int xp;
    protected int yp;
    public Ghost(int color, int x, int y, int xp, int yp){
    	this.color = color;
    	this.x = x;
    	this.y = y;
    	this.xp = xp;
    	this.yp = yp;
    	switch(color)
        {
        case 1: // '\001'
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledCircle(getX(), getY(), 0.40);
            break;

        case 2: // '\002'
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledCircle(getX(), getY(), 0.40);
            break;

        case 3: // '\003'
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.filledCircle(getX(), getY(), 0.40);
            break;

        case 4: // '\004'
            StdDraw.setPenColor(StdDraw.PINK);
            StdDraw.filledCircle(getX(), getY(), 0.40);
            break;
        }
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
    public int getXp(){
    	return this.xp;
    }
    public int getYp(){
    	return this.yp;
    }
    public void setXp(int x){
    	this.xp = x;
    }
    public void setYp(int y){
    	this.yp = y;
    }
    public int getColor(){
    	return this.color;
    }
    public static int restrictionMouv (int[][] laby,Ghost ghost){
    	int x = ghost.getX();
    	int y = ghost.getY();
    	int yp = ghost.getYp();
    	int xp = ghost.getXp();
    	boolean verification = false;
    	int direction = 0;
    	while (verification == false){
    		direction = (int) (( Math.random()* 4 ) + 1);
    		switch (direction){
    		case 1:
    			if ((laby[30-y][x+1] == 3 || laby[30-y][x+1] == 0 || laby[30-y][x+1] == 2 || laby[30-y][x+1] == 5 || laby[30-y][x+1] == 6) && xp != x+1){
    				verification = true;
    			}
    			break;
    		case 2:
    			if ((laby[30-y][x-1] == 3 || laby[30-y][x-1] == 0 || laby[30-y][x-1] == 2 || laby[30-y][x-1] == 5 || laby[30-y][x-1] == 6) && xp != x-1){
    				verification = true;
    			}
    			break;
    		case 3:
    			if ((laby[29-y][x] == 3 || laby[29-y][x] == 0 || laby[29-y][x] == 2 || laby[29-y][x] == 5  || laby[29-y][x] == 6) && yp != y+1){
    				verification = true;
    			}
    			break;
    		case 4:
    			if ((laby[31-y][x] == 3 || laby[31-y][x] == 0 || laby[31-y][x] == 2 || laby[31-y][x] == 5  || laby[31-y][x] == 6) && yp != y-1){
    				verification = true;
    			}
    			break;
    		}
    	}
    	return direction;
    }
    public static Ghost deplacement(int[][] laby,Ghost ghost, int D){
    	int xm,ym;
    	int x = ghost.getX();
    	int y = ghost.getY();
    	xm = x;
    	ym = y;
		switch (D){
    	case 1:
    		x++;
    		break;
    	case 2:
    		x--;
    		break;
    	case 3:
    		y++;
    		break;
    	case 4:
    		y--;
    		break;
	    	}
		if ((y==16)&&(x==0)){
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledSquare(xm, ym, 0.5);
			x = 26;
			xm = 27;
			y = 16;
		}
		else if((y==16)&&(x==27)){
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledSquare(xm, ym, 0.5);
			x = 1;
			y = 16;
			xm = 0;
		}
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledSquare(xm, ym, 0.5);
		if (laby[30-ym][xm] == 0)
		{
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledCircle(xm, ym, 0.2);
		}
		Ghost new_ghost = new Ghost(ghost.getColor(), x, y, xm, ym);
    	return new_ghost;
    }
    public static int sortieCage(int[][] laby,Ghost ghost){
    	int x = ghost.getX();
    	int y = ghost.getY();
    	int xp = ghost.getXp();
    	int yp = ghost.getYp();
		if (x<){
			
		}
		if (x>){
			
		}

    }
}

