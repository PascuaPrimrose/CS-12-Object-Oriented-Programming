import java.awt.*;
import java.awt.image.*;
public class Resto extends GameObject{
   int x;
   int y;
   BufferedImage img2;
   public Resto(){
  x = 0; y=0;
  }

  public void paint(Graphics2D g){
    img2 = MarioWindow.getImage("bg1.jpg");
    g.drawImage(img2,x,y,1150,700,null);
    
  }


}
