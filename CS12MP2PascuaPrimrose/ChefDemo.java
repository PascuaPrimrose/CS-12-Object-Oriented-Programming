import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.util.Scanner;
import java.util.Random;

public class ChefDemo extends GameObject{
        Chef z = new Chef();
        char choice = ' ';
        LinkedQueue link = new LinkedQueue();

        public ChefDemo (LinkedQueue lq){
            link = lq;
        }

        public void run(){
        JFrame frame = null;
        int cust = 1;
        BufferedImage img;

        while (cust<5){
            link.enqueue(z);
            MarioWindow.delay(1000);
            cust++;}
        

        while ((choice != 'f') && (choice != 'f') && (link.lyf!=0)){
            String c = JOptionPane.showInputDialog("HUNGER GAMES Resto Inc. \n Punch Order \n a. Ice Cream \n b. Grape Cocktail \n c. Orange Juice \n d. Green Apple Frappe \n e. Shortcake \n f. Quit \n Order: ");
            choice = c.charAt(0);
            switch(choice){
                case 'A': case 'a':
                    if(link.head.data.hp==50){
                    if(link.head==null){
                        JOptionPane.showMessageDialog(frame,"Error. There is no Customer");
                        break;
                    }
                    else{
                        link.head.data.iceCream();
                        link.money+=50;
                        if(link.head.data.hp<=0){
                            link.head.data=link.dequeue();
                        }
                        break;
                    }}
                    else {JOptionPane.showMessageDialog(frame,"Wrong order given");
                        link.lyf-=1;
                        if(link.lyf==0){JOptionPane.showMessageDialog(frame,"GAME OVER!");break;}
                        else break;}
                case 'B': case 'b':
                    if(link.head.data.hp==30){
                    if(link.head==null){
                        JOptionPane.showMessageDialog(frame,"Error. There is no Customer");
                        break;
                    }
                    else{
                        link.head.data.grapeCocktail();
                        link.money+=30;
                        if(link.head.data.hp<=0){
                            link.head.data=link.dequeue();
                        }
                        break;
                    }}
                    else {JOptionPane.showMessageDialog(frame,"Wrong order given");
                    link.lyf-=1;
                    if(link.lyf==0){JOptionPane.showMessageDialog(frame,"GAME OVER!");break;}
                        else 
                        break;}
                case 'C': case 'c':
                    if(link.head.data.hp==20){
                    if(link.head==null){
                        JOptionPane.showMessageDialog(frame,"Error. There is no Customer");
                        break;
                    }
                    else{
                        link.head.data.orangeJuice();
                        link.money+=20;
                        if(link.head.data.hp<=0){
                            link.head.data=link.dequeue();
                        }
                        break;
                    }}
                    else {JOptionPane.showMessageDialog(frame,"Wrong order given");
                    link.lyf-=1;
                     if(link.lyf==0){JOptionPane.showMessageDialog(frame,"GAME OVER!");break;}
                        else break;}
                case 'D': case 'd':
                    if(link.head.data.hp==80){
                    if(link.head==null){
                        JOptionPane.showMessageDialog(frame,"Error. There is no Customer");
                        break;
                    }
                    else{
                        link.head.data.greenApple();
                        link.money+=80;
                        if(link.head.data.hp<=0){
                            link.head.data=link.dequeue();
                        }
                        break;
                    }}
                    else {JOptionPane.showMessageDialog(frame,"Wrong order given");
                    link.lyf-=1;
                    if(link.lyf==0){JOptionPane.showMessageDialog(frame,"GAME OVER!");break;}
                        else break;}
                case 'E': case 'e':
                    if(link.head.data.hp==100){
                    if(link.head==null){
                        JOptionPane.showMessageDialog(frame,"Error. There is no Customer");
                        break;
                    }
                    else{
                        link.head.data.shortCake();
                        link.money+=100;
                        link.head.data=link.dequeue();
                        break;
                    }}
                    else {JOptionPane.showMessageDialog(frame,"Wrong order given");
                    link.lyf-=1;
                    if(link.lyf==0){JOptionPane.showMessageDialog(frame,"GAME OVER!");break;}
                        else break;}
                case 'F': case 'f': JOptionPane.showMessageDialog(frame,"Exit :( buhbye!! <3 CS12 the best!!"); break;
                default: JOptionPane.showMessageDialog(frame,"Invalid choice!");

            }

            cust = link.visualizeQueue();
            while (cust<5){
                link.enqueue(z);
                MarioWindow.delay(1000);
                cust++;
            }
        } 

      }
}//demo
