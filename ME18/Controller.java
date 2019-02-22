import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class Controller extends GameObject{
  String color1 = "";
  String color2 = "";

  public void paint(Graphics2D g){
    g.setColor(Color.WHITE);
    g.setFont(new Font("Arial", Font.ITALIC, 24));
    g.drawString("Me: ", 550, 100);
    g.drawString("Crush: ", 650, 100);
    g.fillArc(550,200,50,50,0,360);
    g.fillArc(650,200,50,50,0,360);

    if ((color1.equals("red")) || (color1.equals("Red")) || (color1.equals("RED"))) {
      g.setColor(Color.RED);
      g.setFont(new Font("Arial", Font.ITALIC, 24));
      g.drawString("Me: ", 550, 100);
      g.fillArc(550,200,50,50,0,360);
    }
    else if ((color1.equals("blue")) || (color1.equals("Blue")) || (color1.equals("BLUE"))){
      g.setColor(Color.BLUE);
      g.setFont(new Font("Arial", Font.ITALIC, 24));
      g.drawString("Me: ", 550, 100);
      g.fillArc(550,200,50,50,0,360);
    }
    else if ((color1.equals("green")) || (color1.equals("Green")) || (color1.equals("GREEN"))){
      g.setColor(Color.GREEN);
      g.setFont(new Font("Arial", Font.ITALIC, 24));
      g.drawString("Me: ", 550, 100);
      g.fillArc(550,200,50,50,0,360);
    }
    else if ((color1.equals("yellow")) || (color1.equals("Yellow")) || (color1.equals("YELLOW"))){
      g.setColor(Color.YELLOW);
      g.setFont(new Font("Arial", Font.ITALIC, 24));
      g.drawString("Me: ", 550, 100);
      g.fillArc(550,200,50,50,0,360);
    }
    else if ((color1.equals("pink")) || (color1.equals("Pink")) || (color1.equals("PINK"))){
      g.setColor(Color.PINK);
      g.setFont(new Font("Arial", Font.ITALIC, 24));
      g.drawString("Me: ", 550, 100);
      g.fillArc(550,200,50,50,0,360);
    }



    if ((color2.equals("red")) || (color2.equals("Red")) || (color2.equals("RED"))){
      g.setColor(Color.RED);
      g.setFont(new Font("Arial", Font.ITALIC, 24));
      g.drawString("Crush: ", 650, 100);
      g.fillArc(650,200,50,50,0,360);
    }
    else if ((color2.equals("blue")) || (color2.equals("Blue")) || (color2.equals("BLUE"))){
      g.setColor(Color.BLUE);
      g.setFont(new Font("Arial", Font.ITALIC, 24));
      g.drawString("Crush: ", 650, 100);
      g.fillArc(650,200,50,50,0,360);
    }
    else if ((color2.equals("green")) || (color2.equals("Green")) || (color2.equals("GREEN"))){
      g.setColor(Color.GREEN);
      g.setFont(new Font("Arial", Font.ITALIC, 24));
      g.drawString("Crush: ", 650, 100);
      g.fillArc(650,200,50,50,0,360);
    }
     else if ((color2.equals("yellow")) || (color2.equals("Yellow")) || (color2.equals("YELLOW"))){
      g.setColor(Color.YELLOW);
      g.setFont(new Font("Arial", Font.ITALIC, 24));
      g.drawString("Crush: ", 650, 100);
      g.fillArc(650,200,50,50,0,360);
    }
     else if ((color2.equals("pink")) || (color2.equals("Pink")) || (color2.equals("PINK"))){
      g.setColor(Color.PINK);
      g.setFont(new Font("Arial", Font.ITALIC, 24));
      g.drawString("Crush: ", 650, 100);
      g.fillArc(650,200,50,50,0,360);
    }
  }
}
