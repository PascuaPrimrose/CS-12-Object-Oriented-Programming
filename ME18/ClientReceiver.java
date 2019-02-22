public class ClientReceiver extends GameObject{
  MyConnection conn;
  Controller controller;

  public ClientReceiver(MyConnection pasok1, Controller pasok2){
  conn= pasok1;
  controller = pasok2;
}
public void run(){
  while (true){
    String msg = conn.getMessage();
    System.out.println("S: Client wants to have color "+msg);
    System.out.print("Enter color: ");
    controller.color2=msg;

}
}
}
