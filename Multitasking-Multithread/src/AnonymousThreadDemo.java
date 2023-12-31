
public class AnonymousThreadDemo {

	public static void main(String[] args) {
		Runnable runable1 = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i);
				}
			}
		};
		
		Thread threadA = new Thread(runable1);
		threadA.start();
	}
}
