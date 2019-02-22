import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class Controller1 extends GameObject{
  String action1 = " ";
  String action2 = " ";

  BufferedImage img1, img2, bground; //player models
  int life1=100, life2=100; //set life
  int x1=810,x2=270; //locations
  //int h1=,h2=340; //Health

  public void paint(Graphics2D g){
      bground = MarioWindow.getImage("bground.jpg");
    g.drawImage(bground, -35,0,1440,720,null);
    g.setColor(Color.WHITE);

    g.setFont(new Font("Verdana", Font.BOLD, 38));
    g.drawString("Battle of the Losers", 325 , 100); //Game title

        g.setColor(Color.RED);

    //w.setColor(Color.RED);  //Missing health
    g.fillRect(580,120,380,35); //Player b health 
    g.fillRect(100,120,380,35);

    g.setColor(Color.GREEN);

    //q.setColor(Color.GREEN); //Current health
    g.fillRect(580,120,380,35); //Player b health 
    g.fillRect(100,120,380,35); //Player g health

  
  
    if((action1.equals(" "))){
     img1 = MarioWindow.getImage("boystand.png"); //boy normal
      g.drawImage(img1,x1, 400, 150, 250,null);       
    }
    if((action2.equals(" "))){
     img2 = MarioWindow.getImage("girlstand.png"); //girl normal
      g.drawImage(img2,x2, 400, 150, 250,null);
    }


    //BOY ACTIONS
    if ((action1.equals("punch"))) {
      img1 = MarioWindow.getImage("boypunch.png");
      g.drawImage(img1,x1, 400, 150, 250,null);
     if(x1<541&&x2>359){
      life2 =-15;
      x2 -= 50;
    }
    }
      else if ((action1.equals("kick"))){
      img1 = MarioWindow.getImage("boykick.png");
      g.drawImage(img1,x1, 400, 150, 250,null);
     if(x1<561&&x2>339){
      life2 =- 10;
      x2 -= 70;
      } 
    }
     else if ((action1.equals("heal"))){
      img1 = MarioWindow.getImage("boyheal.png");
      g.drawImage(img1,x1, 400, 150, 250,null);
      life1 +=3;
    }
     else if ((action1.equals("spec"))){
      img1 = MarioWindow.getImage("boyspec.png");
      g.drawImage(img1,x1, 400, 150, 250,null);
            if(x1<521&&x2>379){
      life2 =- 25;
      x2-=120;

    }
  }
    if ((action2.equals("punch"))) {
      img2 = MarioWindow.getImage("girlpunch.png");
      g.drawImage(img2,x2, 400, 150, 250,null);
     if(x1<541&&x2>359){
      life1 =-15;
      x1 += 55;
    }
    }
    else if ((action2.equals("kick"))){
      img2 = MarioWindow.getImage("girlkick.png");
      g.drawImage(img2,x2, 400, 150, 250,null);
     if(x1<561&&x2>339){
      life1 =- 10;
      x1 += 70;
      } 
    }
    else if ((action2.equals("heal"))){
      img2 = MarioWindow.getImage("girlheal.png");
      g.drawImage(img2,x2, 400, 150, 250,null);
      life2 += 3;
    }
    else if ((action2.equals("spec"))){
      img2 = MarioWindow.getImage("girlspec.png");
      g.drawImage(img2,x2, 400, 150, 250,null);
            if(x1<521&&x2>379){
      life1 -= 25;
      x1+=120;

    }

  }
}

  public void run(){
    while(true){
      if (x1>500){
      x1 -= 6;
          MarioWindow.delay(100);
          System.out.println(x1);
}
      if (x2<400){
      x2 += 6;
          MarioWindow.delay(100);
                    System.out.println(x2);

}


    }
  }
}
