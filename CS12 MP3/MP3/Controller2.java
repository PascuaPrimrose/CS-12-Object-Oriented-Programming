import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class Controller2 extends GameObject{
  String action2 = " ";
  BufferedImage img2; //player models
  int life1=100, life2=100; //set life
  int x1=700,x2=100; //locations

  public void paint(Graphics2D g){
    g.setColor(Color.WHITE);
    g.setFont(new Font("Arial", Font.ITALIC, 24));
    g.drawString("Battle of the Losers", 720, 100); //Game title


      if((action2.equals(" "))){
      img2 = MarioWindow.getImage("girlstand.png"); //girl normal
      g.drawImage(img2,x2, 300, 200, 300,null);
    }

    //GIRL ACTIONS
    if ((action2.equals("punch"))) {
      img2 = MarioWindow.getImage("girlpunch.png");
      g.drawImage(img2,x2, 300, 200, 300,null);
      life1 =- 5;
    }
    else if ((action2.equals("kick"))){
      img2 = MarioWindow.getImage("girlkick.png");
      g.drawImage(img2,x2, 300, 200, 300,null);
      life1 =- 10;
    }
    else if ((action2.equals("heal"))){
      img2 = MarioWindow.getImage("girlheal.png");
      g.drawImage(img2,x2, 300, 200, 300,null);
      life2 =+ 2;
    }
    else if ((action2.equals("spec"))){
      img2 = MarioWindow.getImage("girlspec.png");
      g.drawImage(img2,x2, 300, 200, 300,null);
      life2 =+ 2;
    }


  }

  public void run(){
    while(true){
      while (x2<670){
      x2 += 1;}
      MarioWindow.delay(1000);
    }
  }
}
