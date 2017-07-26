

class test extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(/*Thread.currentThread().getId() */+ " thread value " + (i+1));
		}
	}
}

public class A {
public static void main(String[] args) {
	test obj = new test();
	obj.start();
	
	/*test obj1 = new test();
	obj1.start();*/
	}
}
