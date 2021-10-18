
public class TestThread {

	public static void main(String[] args) {
		//implement runnable thread 
		ThreadRun r=new ThreadRun();
		Thread t=new Thread(r);
		
		//single line approach
		Thread t1=new Thread(new ThreadRun());
		t.start();
		t1.start();
		
		
		
		
		
	
		
		
		for(int i=0;i<3;i++) {
			System.out.println("Hello i'm main thread " +(i+1));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
