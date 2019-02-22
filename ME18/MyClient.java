import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyClient {
  public static void main(String args[]) {

    try {
      Scanner w = new Scanner(System.in);

      System.out.println("C: Waiting for connection...");

      Socket s = new Socket("127.0.0.1", 8888);
      MyConnection conn = new MyConnection(s);
      System.out.println("C: Connected!");

      MarioWindow w1 = new MarioWindow();
      Controller control = new Controller();
      ServerReceiver sreceive = new ServerReceiver(conn, control);
      ServerSender ssend = new ServerSender(conn,control);

      w1.add(ssend);
      w1.add(sreceive);
      w1.add(control);
      w1.startGame();

    } catch (Exception e) {
      System.out.println("Connection failed!");
      System.out.println(e);
    }
  }
}
