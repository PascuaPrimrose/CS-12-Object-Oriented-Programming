import java.util.Scanner;
import java.awt.*;
import java.awt.image.*;

public class Chef {
    Scanner s = new Scanner(System.in);
    int hp;
    BufferedImage img, order;

    public int getHP(){
        return hp;
    }
	public void iceCream(){
		hp-=50;
	}
    public void grapeCocktail(){
        hp-=30;
    }
    public void orangeJuice(){
        hp-=20;
    }
    public void greenApple(){
        hp-=80;
    }

    public void shortCake(){
        hp=0;
    }

}
