import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.util.Scanner;
import java.util.Random;

public class Node extends GameObject{
	Chef data;   
	Node next;
  
      public Node(Chef pasok) {
           data = new Chef();  
           data.hp = pasok.hp;
        Random rand = new Random();
        int  n = rand.nextInt(14) + 1;
        switch(n){
        case 1 : data.img = MarioWindow.getImage("1.png"); break;
        case 2 : data.img = MarioWindow.getImage("2.png"); break;
        case 3 : data.img = MarioWindow.getImage("3.png"); break;
        case 4 : data.img = MarioWindow.getImage("4.png"); break;
        case 5 : data.img = MarioWindow.getImage("5.png"); break;
        case 6 : data.img = MarioWindow.getImage("6.png"); break;
        case 7 : data.img = MarioWindow.getImage("7.png"); break;
        case 8 : data.img = MarioWindow.getImage("8.png"); break;
        case 9 : data.img = MarioWindow.getImage("9.png"); break;
        case 10 : data.img = MarioWindow.getImage("10.png"); break;
        case 11 : data.img = MarioWindow.getImage("11.png"); break;
        case 12 : data.img = MarioWindow.getImage("12.png"); break;
        case 13 : data.img = MarioWindow.getImage("13.png"); break;
        case 14 : data.img = MarioWindow.getImage("14.png"); break;
    }  

        Random ran = new Random();
        int  j = ran.nextInt(5) + 1; 
        switch(j){
        case 1 : data.hp = 50; data.order = MarioWindow.getImage("ice cream.png"); break;
        case 2 : data.hp = 30; data.order = MarioWindow.getImage("grape.png"); break;
        case 3 : data.hp = 20; data.order = MarioWindow.getImage("orange.png"); break;
        case 4 : data.hp = 80; data.order = MarioWindow.getImage("drink1.png"); break;
        case 5 : data.hp = 100; data.order = MarioWindow.getImage("shortcake.png"); break;

        }
      }

}
