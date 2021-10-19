
public class Dead {
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String[] args) {
		ThreadOne t1 = new ThreadOne(lock1 ,lock2);
		ThreadTwo t2 = new ThreadTwo(lock1 ,lock2);

		t1.start();
		t2.start();

	}
}

class ThreadOne extends Thread {

	private Object lock1 = new Object();
	private Object lock2 = new Object();

	public ThreadOne(Object lock1, Object lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	public void run() {
		System.out.println("Started executing Thread -01");

		synchronized (lock1) {
			System.out.println("Thread one is holding lock 1....");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread one waiting for lock two........");

			synchronized (lock2) {
				System.out.println("Thread one holding lock 1 & lock 2");
			}
		}
	}
}


class ThreadTwo extends Thread {

	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	public ThreadTwo(Object lock1,Object lock2) {
		super();
		this.lock1=lock1;
		this.lock2=lock2;
	}
	public void run() {
		System.out.println("Started executing Thread -02");

		synchronized (lock2) {
			System.out.println("Thread one is holding lock 2....");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread two waiting for lock one........");

			synchronized (lock1) {
				System.out.println("Thread two holding lock 1 & lock 2");
			}
		}
	}

}
