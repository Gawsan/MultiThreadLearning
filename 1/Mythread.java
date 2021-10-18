
public class Mythread extends Thread{
	public void run() {
		for(int i=1;i<3;i++) {
		System.out.println("Hello i'm Child "+(i+1));
		}
	}
}
