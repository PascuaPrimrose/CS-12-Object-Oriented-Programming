import java.awt.*;
import java.awt.image.*;
public class Resto2 extends GameObject{
   int x;
   int y;
   BufferedImage img, img2, img3;
   public Resto2(){
  x = 0; y=0;
  }

  public void paint(Graphics2D g){
    img = MarioWindow.getImage("happyedited.jpg");
    g.drawImage(img,x,400,1150,300,null);
    img2 = MarioWindow.getImage("pay.png");
    g.drawImage(img2,10,270,150,150,null);
    img3 = MarioWindow.getImage("tray.png");
    g.drawImage(img3,170,370,200,75,null);
  }


}
