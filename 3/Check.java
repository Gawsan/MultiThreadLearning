
public class Check {
	public synchronized void update(Check ob) {
		for (int i = 0; i < 3; i++) {
			System.out.println("Update  " + (i + 1));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	//synchronized block
	//another way to add synchronized
	//synchronized(ob) {
		//		for (int i = 0; i < 3; i++) {
		//			System.out.println("Update  " + (i + 1));
		//			try {
		//				Thread.sleep(300);
		//			} catch (InterruptedException e) {
		//				// TODO Auto-generated catch block
		//				e.printStackTrace();
		//			}
		//		}
		//			
}
