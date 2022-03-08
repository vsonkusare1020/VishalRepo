package multiTJoin;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		SmratPro s=new SmratPro();
		Thread t=new Thread();
		
		s.start();
		s.join();
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("main thread---"+i);
			t.sleep(700);
			
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
