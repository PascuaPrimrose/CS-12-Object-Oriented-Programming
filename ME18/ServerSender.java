import java.awt.*;
import java.util.Scanner;

public class ServerSender extends GameObject{
  MyConnection conn;
  Controller controller;
  Scanner p;

  public ServerSender(MyConnection pasok1, Controller pasok2){
    conn = pasok1;
    controller = pasok2;
    p = new Scanner (System.in);
  }

  public void run(){
    while(true){
      System.out.print("Enter the color: ");
      String msg = p.nextLine();
      System.out.println("S: You want to have color " + msg);
      conn.sendMessage(msg);
      controller.color1 = msg;
    }
  }
}
