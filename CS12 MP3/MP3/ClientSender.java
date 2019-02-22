import java.awt.*;
import java.util.Scanner;

public class ClientSender extends GameObject{
  MyConnection conn;
  Controller1 cntrl;
  Scanner p;
  String act,msg;

  public ClientSender(Controller1 pasok2, MyConnection pasok1){
  	conn = pasok1;
    cntrl = pasok2;
    p = new Scanner (System.in);
  }

public void keyPressed(String s){ //GIRL ACTIONS
            if(s.equals("W")){ 
            	msg="punch";
                cntrl.action2=msg;
                conn.sendMessage(msg);
                act = "You punched your opponent";
                //cntrl.action2 = " "; //Revert to normal position

            }
            else if(s.equals("A")){
				msg="heal";
                cntrl.action2=msg;
                conn.sendMessage(msg);
                act = "You healed yourself";
                //cntrl.action2 = " ";

            }
            else if(s.equals("S")){
				msg="kick";
                cntrl.action2=msg;
                conn.sendMessage(msg);
                  act = "You kicked your opponent";
                //cntrl.action2 = " ";

           }
            else if(s.equals("D")){
				msg="spec";
                cntrl.action2=msg;
                conn.sendMessage(msg);
      	         act = "You used your special attack";
                //cntrl.action2 = " ";

            }
        }

  public void run(){
    while(true){
      System.out.println(act);
    }
  }
}
