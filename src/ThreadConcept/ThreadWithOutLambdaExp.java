package ThreadConcept;

public class ThreadWithOutLambdaExp {

	public static void main(String[] args) {
		ThreadClass tc=new ThreadClass();
		Thread t=new Thread(tc);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread"+i);
		}

	}

}

class ThreadClass implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread"+i);
		}
	}
}
