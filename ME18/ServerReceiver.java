import java.awt.*;
import java.util.Scanner;

public class ServerReceiver extends GameObject {
  MyConnection conn;
  Controller controller;

  public ServerReceiver (MyConnection pasok1, Controller pasok2){
    conn = pasok1;
    controller = pasok2;
  }

  public void run(){
    while(true){
      String msg = conn.getMessage();
      System.out.println("S: Client wants to have color " + msg);
      System.out.print("Enter color: ");
      controller.color2 = msg;
    }
  }
}
