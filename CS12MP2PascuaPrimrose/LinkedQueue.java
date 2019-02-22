import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.util.Scanner;
import java.util.Random;

public class LinkedQueue extends GameObject{
	Node head;
	Node tail;
	int anchorx = 350;
  	int anchory = 240;
  	BufferedImage imgg, ord, bank, bub, life;
  	int money = 0;
  	int lyf = 3;

  public void paint(Graphics2D g) {
         int currx = anchorx;
         int curry = anchory;
         int x = anchorx;
         int hpy = anchory - 10;
         Node rover = head;
         

           while (rover != null) {
              int currenthp = rover.data.hp;
              imgg = rover.data.img;
              ord = rover.data.order;
              String profit = Integer.toString(money);
              bub = MarioWindow.getImage("bub.png");
              g.drawImage(bub, x-50, 60, 180, 200, null);
              g.drawImage(ord, x, 100,80,90,null);
              x = x+220;
              g.drawImage(imgg, currx, curry, 170, 150, null);
              g.setColor(Color.BLACK);
              g.setFont(new Font("Arial", Font.BOLD, 20));
              bank = MarioWindow.getImage("bank.png");
              g.drawImage(bank, 10,10,200,50,null);
              life = MarioWindow.getImage("heart.png");
              int lx=230;
              for(int i=0; i<lyf;i++){
              	g.drawImage(life, lx, 10, 50,50,null);
              	lx += 60;
              }
              g.drawString("$ "+profit, 100, 40);
              rover = rover.next;
              currx = (currx + 200);
              /*if (currx > 1000){
                curry = (curry + 150);
                currx = 100;
              } */    
           }

           
  }

	public void enqueue(Chef i) {
		Node bago = new Node(i);
		if (head == null) {
			head = bago;
			tail = bago;
		} else {
			tail.next = bago;
			tail = bago;
		}
	}

	public Chef dequeue() {
		if (head != null) {
			Chef result = head.data;
			head = head.next;
			if (head == null) {
				tail = null;
			}
			return result;
		} else {
			return null;  
		}
	}

	public Chef peek() {
		if (head != null) {
			Chef result = head.data;
			return result;
		} else {
			return null; 
		}

	}

	public int visualizeQueue() {
           Node rover = head;
           int c=1;
           while (rover != null) {
               c++;  
               rover = rover.next;      
           }
           return c;
      }

	public boolean isEmpty() {
		return head == null;
	}
      
}
