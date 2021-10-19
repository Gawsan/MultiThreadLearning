
public class ThreadRun implements Runnable {
	Check ob;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ob.update(ob);

		}

	public ThreadRun( Check ob) {
		super();
		this.ob=ob;
	}

	}

