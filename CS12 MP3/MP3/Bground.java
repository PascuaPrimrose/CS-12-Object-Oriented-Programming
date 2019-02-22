import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class Bground{
	BufferedImage bground;

	public void paint(Graphics2D g){
	
	bground = MarioWindow.getImage("bground.jpg");
	g.drawImage(bground, 0,0,0,0,null);
	}
}