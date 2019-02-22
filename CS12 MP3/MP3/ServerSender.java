import java.awt.*;
import java.util.Scanner;

public class ServerSender extends GameObject{
  MyConnection conn;
  Controller1 cntrl;
  Scanner p;
  String act,msg;

  public ServerSender(Controller1 pasok2, MyConnection pasok1){
    cntrl = pasok2;
    conn = pasok1;
    p = new Scanner (System.in);
  }

public void keyPressed(String s){//BOY ACTIONS
            if(s.equals("W")){
                msg="punch";
                cntrl.action1 = msg;
                conn.sendMessage(msg);

                act = "You punched your opponent";
                //cntrl.action1 = " "; //Revert to normal position
            }
            else if(s.equals("A")){
                msg="heal";
                cntrl.action1 = msg;
                conn.sendMessage(msg);
               //cntrl.action1 = " "; //Revert to normal position
            }
            else if(s.equals("S")){
                msg="kick";
                cntrl.action1 = msg;
                conn.sendMessage(msg);
                //cntrl.action1 = " "; //Revert to normal position
           }
            else if(s.equals("D")){
                msg="spec";
                cntrl.action1 = msg;
                conn.sendMessage(msg);               
                 //cntrl.action1 = " "; //Revert to normal position
            }
        }

  public void run(){
    while(true){
      System.out.println(act);
    }
  }
}
