public class ClientReceiver extends GameObject{
  MyConnection conn;
  Controller1 cntrl;

    public ClientReceiver(Controller1 pasok2, MyConnection pasok1){
    conn = pasok1;
    cntrl = pasok2;
  }
public void run(){
  while (true){
    String msg = conn.getMessage();
    cntrl.action1=msg;

}
}
}
