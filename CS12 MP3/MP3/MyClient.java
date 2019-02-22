import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyClient {
  public static void main(String args[]) {

    try {
      Scanner w = new Scanner(System.in);

      System.out.println("C: Waiting for connection...");

      Socket s = new Socket("127.0.0.1", 8888);
      System.out.println("C: Connected!");

      MarioWindow w1 = new MarioWindow();
      Controller1 control1 = new Controller1();
      //Controller2 control2 = new Controller2();
      MyConnection conn = new MyConnection(s);
      ClientSender csend = new ClientSender(control1,conn);
      ClientReceiver crec = new ClientReceiver(control1,conn);

      //ServerSender ssend = new ServerSender(control1);
      Lifebar lb = new Lifebar();

      w1.add(lb);
      w1.add(control1);   
      w1.add(crec);
      //w1.add(control2);
      w1.add(csend);
      //w1.add(ssend);
      w1.startGame();




    } catch (Exception e) {
      System.out.println("x___x");
      System.out.println(e);
    }
  }
}
