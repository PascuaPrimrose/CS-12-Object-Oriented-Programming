import java.util.Scanner;

public class CS12MP2PascuaPrimrose {
    public static void main (String args[]) {
      MarioWindow w1 = new MarioWindow();
      Resto r1 = new Resto();
      Resto2 r2 = new Resto2();
      LinkedQueue l = new LinkedQueue();
      ChefDemo z = new ChefDemo(l);
      w1.add(r1);
      w1.add(z);
      w1.add(l);
      w1.add(r2);
      w1.startGame();
    }
}
