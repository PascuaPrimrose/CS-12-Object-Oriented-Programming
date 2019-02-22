public class MarioWindowDemo {
	public static void main(String args[]) {
		Controller c = new Controller();
		ClientSender cs = new ClientSender();
		ServerSender ss = new ServerSender();
		MarioWindow w1 = new MarioWindow();
		w1.add(cs);
		w1.add(ss);
		w1.add(c);
		w1.startGame();
	}

}