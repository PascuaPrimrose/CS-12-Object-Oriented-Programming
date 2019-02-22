import java.awt.*;
import java.io.*;
import java.util.Scanner;
public class ClientSender extends GameObject{
    MyConnection conn;
    Scanner p;
    Controller control;

    public ClientSender(MyConnection pasok1, Controller pasok2){
        conn = pasok1;
        control = pasok2;
        p = new Scanner(System.in);
}
public void run(){
  while(true){
      System.out.print("Enter the color you like: ");
      String msg = p.nextLine();
      System.out.println("You want to have color " + msg);
      conn.sendMessage(msg);
      control.color1=msg;

}
}
}
