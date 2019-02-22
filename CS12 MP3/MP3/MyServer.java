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

      MarioWindow w1 = new MarioWindow();
      Controller1 control1 = new Controller1();
      //Controller2 control2 = new Controller2();
      MyConnection conn = new MyConnection(s);
      ServerSender ssend = new ServerSender(control1,conn);
      ServerReceiver srec = new ServerReceiver(control1,conn);
      //ClientSender csend = new ClientSender(control2);


      Lifebar lb = new Lifebar();

      w1.add(lb);
      w1.add(control1);
      //w1.add(control2);
      w1.add(ssend);
      w1.add(srec);
      //w1.add(csend);
      w1.startGame();
    }

    catch (Exception e){
      e.printStackTrace();
    }
  }
}
