
public class TestThread {

	public static void main(String[] args) {
		
		Mythread t=new Mythread();
		t.start();
		
		for(int i=0;i<3;i++) {
			System.out.println("Hello i'm main thread " +(i+1));
		}

	}

}
