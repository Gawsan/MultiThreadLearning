
public class TestThread {

	public static void main(String[] args) {
		
		Check ob = new Check();

		Mythread t = new Mythread(ob);
		Thread t1 = new Thread(new ThreadRun(ob));

		t.start();
		t1.start();
	}
}
