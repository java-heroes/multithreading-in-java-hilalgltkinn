package multithreading;

public class main {
	public static void main(String[] args) {
		I�lemler i1 = new I�lemler("�lk");
		Thread t1 = new Thread(i1);
		
		I�lemler i2 = new I�lemler("�ki");
		Thread t2 = new Thread(i2);
		t1.start();
		t2.start();
	}

}
