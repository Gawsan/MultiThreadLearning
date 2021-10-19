
public class Mythread extends Thread {

	Check ob;

	public void run() {
		ob.update(ob);
	}

	public Mythread(Check ob) {
		super();
		this.ob=ob;
	}
}
