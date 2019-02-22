import java.awt.*;
import java.util.Scanner;

public class ServerReceiver extends GameObject {
  MyConnection conn;
  Controller1 ctrl;

  public ServerReceiver (Controller1 pasok2, MyConnection pasok1){
    conn = pasok1;
    ctrl = pasok2;
  }

  public void run(){
    while(true){
      String msg = conn.getMessage();
      ctrl.action2 = msg;
    }
  }
}
