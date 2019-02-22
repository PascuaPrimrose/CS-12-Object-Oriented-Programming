import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class Controller extends GameObject{
  String action1 = " ";
  String action2 = " ";
  BufferedImage img1, img2; //player models
  int life1=100, life2=100; //set life
  int x1=700,x2=100; //locations

  public void paint(Graphics2D g){
    g.setColor(Color.WHITE);
    g.setFont(new Font("Arial", Font.ITALIC, 24));
    g.drawString("Battle of the Losers", 720, 100); //Game title


    // LIFE BARS GREEN/RED

     if((action1.equals(" "))){
     img1 = MarioWindow.getImage("boystand.png"); //boy normal
      g.drawImage(img1,x1, 300, 200, 300,null);
            img2 = MarioWindow.getImage("girlstand.png"); //girl normal
      g.drawImage(img2,x2, 300, 200, 300,null);
    }
      if((action2.equals(""))){
      img2 = MarioWindow.getImage("girlstand.png"); //girl normal
      g.drawImage(img2,x2, 300, 200, 300,null);
    }

    //BOY ACTIONS
    if ((action1.equals("punch"))) {
      img1 = MarioWindow.getImage("boypunch.png");
      g.drawImage(img1,x1, 300, 200, 300,null);
      life2 =- 5;
      x2 =- 10;
    }
    else if ((action1.equals("kick"))){
      img1 = MarioWindow.getImage("boykick.png");
      g.drawImage(img1,x1, 300, 200, 300,null);
      life2 =- 10;
      x2 =- 10;
    }
    else if ((action1.equals("heal"))){
      img1 = MarioWindow.getImage("boyheal.png");
      g.drawImage(img1,x1, 300, 200, 300,null);
      life1 =+ 2;
    }
    else if ((action1.equals("spec"))){
      img2 = MarioWindow.getImage("boyspec.png");
      g.drawImage(img1,x1, 300, 200, 300,null);
      life2 =- 25;

    }

    //GIRL ACTIONS
    if ((action2.equals("punch"))) {
      img2 = MarioWindow.getImage("girlpunch.png");
      g.drawImage(img1,x2, 300, 200, 300,null);
      life1 =- 5;
    }
    else if ((action2.equals("kick"))){
      img2 = MarioWindow.getImage("kick.png");
      g.drawImage(img1,x2, 300, 200, 300,null);
      life1 =- 10;
    }
    else if ((action2.equals("heal"))){
      img2 = MarioWindow.getImage("girlheal.png");
      g.drawImage(img1,x2, 300, 200, 300,null);
      life2 =+ 2;
    }
    else if ((action2.equals("spec"))){
      img2 = MarioWindow.getImage("girlspec.png");
      g.drawImage(img1,x2, 300, 200, 300,null);
      life2 =+ 2;
    }


  }

  public void run(){
    while(true){
      while (x1>710){
      x1 =+ 1;}
      while (x2<710){
      x2 =- 1;}
      MarioWindow.delay(100);
    }
  }
}
