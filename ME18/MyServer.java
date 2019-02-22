import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyServer {
  public static void main (String args[]){
    try {
      ServerSocket ssocket = new ServerSocket(8888);
      System.out.println("S: Accepting connections...");
      Socket s = ssocket.accept();
      System.out.println("S: Client connected!");
      MyConnection conn = new MyConnection(s);

      MarioWindow w1 = new MarioWindow();
      Controller control = new Controller();
      ServerSender ssend = new ServerSender(conn, control);
      ServerReceiver sreceive = new ServerReceiver(conn, control);
      w1.add(control);
      w1.add(ssend);
      w1.add(sreceive);
      w1.startGame();
    }

    catch (Exception e){
      e.printStackTrace();
    }
  }
}
