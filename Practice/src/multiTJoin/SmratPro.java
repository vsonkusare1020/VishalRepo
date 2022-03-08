package multiTJoin;



public class SmratPro extends Thread {
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("child thread---"+i);
			sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
